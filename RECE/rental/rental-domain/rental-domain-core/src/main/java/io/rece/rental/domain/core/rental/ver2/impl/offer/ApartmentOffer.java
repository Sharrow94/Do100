package io.rece.rental.domain.core.rental.ver2.impl.offer;


import io.rece.rental.domain.core.rental.ver2.abs.contract.Contract;
import io.rece.rental.domain.core.rental.ver2.abs.offer.Offer;
import io.rece.rental.domain.core.rental.ver2.abs.offer.OfferThread;
import io.rece.rental.domain.core.rental.ver2.abs.offer.terms.OfferTerms;
import io.rece.rental.domain.core.rental.ver2.impl.contract.RentalContract;
import io.rece.rental.domain.core.rental.ver2.impl.offer.terms.ApartmentTerms;

public class ApartmentOffer implements Offer {

    private ApartmentTerms terms;

    @Override
    public Contract acceptBy(String clientId) {
        return new RentalContract();
    }

    @Override
    public OfferThread startNegotiation(String clientId, OfferTerms terms) {
        return null;
    }

    @Override
    public ApartmentTerms getTerms() {
        return terms;
    }

    public void x() {

    }
}
