package io.rece.rental.domain.core.rental.offer;


import io.rece.common.valueobject.id.ClientId;
import io.rece.rental.domain.core.rental.contract.Contract;
import io.rece.rental.domain.core.rental.offer.terms.AbstractOfferTerms;
import io.rece.rental.domain.core.rental.offer.thread.OfferThread;

public abstract class RentalOffer {

    private RentalOfferId offerId;

    public RentalOffer(RentalOfferId offerId) {
        this.offerId = offerId;
    }

    public abstract Contract acceptBy(ClientId clientId);

    public abstract OfferThread startNegotiation(ClientId clientId, AbstractOfferTerms terms);

    public abstract AbstractOfferTerms getTerms();

    public RentalOfferId getId() {
        return this.offerId;
    }
}
