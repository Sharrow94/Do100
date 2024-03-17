package io.rece.rental.domain.core.rental.offer;


import io.rece.common.valueobject.id.ClientId;
import io.rece.rental.domain.core.rental.RentalContract;
import io.rece.rental.domain.core.rental.abs.contract.Contract;
import io.rece.rental.domain.core.rental.abs.offer.Offer;
import io.rece.rental.domain.core.rental.abs.offer.OfferThread;
import io.rece.rental.domain.core.rental.abs.offer.terms.OfferTerms;
import io.rece.rental.domain.core.rental.offer.terms.ApartmentTerms;

public class ApartmentOffer extends Offer {

    private ApartmentTerms terms;

    @Override
    public Contract acceptBy(ClientId clientId) {
        return new RentalContract(getId(), clientId, getTerms());
    }

    @Override
    public OfferThread startNegotiation(String clientId, OfferTerms terms) {
        return null;
    }

    @Override
    public ApartmentTerms getTerms() {
        return terms;
    }
}
