package io.rece.rental.domain.core.rental.offer;


import io.rece.common.valueobject.id.ClientId;
import io.rece.rental.domain.core.rental.contract.Contract;
import io.rece.rental.domain.core.rental.offer.terms.AbstractOfferTerms;
import io.rece.rental.domain.core.rental.offer.thread.OfferThread;

public abstract class RentalOffer {

    private RentalOfferId offerId;

    protected abstract Contract acceptBy(ClientId clientId);

    protected abstract OfferThread startNegotiation(ClientId clientId, AbstractOfferTerms terms);

    protected abstract AbstractOfferTerms getTerms();

    public RentalOfferId getId() {
        return this.offerId;
    }
}
