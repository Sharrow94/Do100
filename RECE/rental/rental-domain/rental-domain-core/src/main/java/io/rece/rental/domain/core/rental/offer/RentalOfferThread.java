package io.rece.rental.domain.core.rental.offer;

import io.rece.common.valueobject.id.ClientId;
import io.rece.rental.domain.core.rental.RentalContract;
import io.rece.rental.domain.core.rental.abs.offer.terms.OfferTerms;

import java.util.UUID;

public class RentalOfferThread {
    private RentalOfferThreadId id;
    private RentalOfferThreadId parentId;
    private RentalOfferId offerId;
    private ClientId clientId;
    private OfferTerms rentalTerms;

    public RentalOfferThread(RentalOfferId offerId, ClientId clientId, OfferTerms rentalTerms) {
        this.id = new RentalOfferThreadId(UUID.randomUUID());
        this.parentId = null;
        this.offerId = offerId;
        this.clientId = clientId;
        this.rentalTerms = rentalTerms;
    }

    private RentalOfferThread(RentalOfferThreadId parentId, RentalOfferId offerId, ClientId clientId, OfferTerms rentalTerms) {
        this.id = new RentalOfferThreadId(UUID.randomUUID());
        this.parentId = parentId;
        this.offerId = offerId;
        this.clientId = clientId;
        this.rentalTerms = rentalTerms;
    }

    public RentalOfferThread proposeTerms(OfferTerms offerTerms) {
        return new RentalOfferThread(this.id, this.offerId, this.clientId, offerTerms);
    }

    public RentalContract acceptTerms() {
        return new RentalContract(this.offerId, this.clientId, this.rentalTerms);
    }
}
