package io.rece.rental.domain.core.rental.abs.offer;


import io.rece.common.valueobject.id.ClientId;
import io.rece.rental.domain.core.rental.abs.contract.Contract;
import io.rece.rental.domain.core.rental.abs.offer.terms.OfferTerms;
import io.rece.rental.domain.core.rental.offer.RentalOfferId;

public abstract class Offer {

    private RentalOfferId offerId;

    protected abstract Contract acceptBy(ClientId clientId);

    protected abstract OfferThread startNegotiation(String clientId, OfferTerms terms);

    protected abstract OfferTerms getTerms();

    public RentalOfferId getId() {
        return this.offerId;
    }
}
