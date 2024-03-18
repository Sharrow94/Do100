package io.rece.rental.domain.core.rental.offer.type;


import io.rece.common.valueobject.id.ClientId;
import io.rece.rental.domain.core.rental.contract.Contract;
import io.rece.rental.domain.core.rental.contract.RentalContract;
import io.rece.rental.domain.core.rental.offer.RentalOffer;
import io.rece.rental.domain.core.rental.offer.terms.AbstractOfferTerms;
import io.rece.rental.domain.core.rental.offer.terms.ApartmentTerms;
import io.rece.rental.domain.core.rental.offer.thread.OfferThread;
import io.rece.rental.domain.core.rental.offer.thread.RentalOfferThread;

public class ApartmentOffer extends RentalOffer {

    private ApartmentTerms terms;

    @Override
    public Contract acceptBy(ClientId clientId) {
        return new RentalContract(getId(), clientId, terms);
    }

    @Override
    public OfferThread startNegotiation(ClientId clientId, AbstractOfferTerms terms) {
        return new RentalOfferThread(getId(), clientId, terms);
    }

    @Override
    public ApartmentTerms getTerms() {
        return terms;
    }
}
