package io.rece.rental.domain.core.rental.offer.thread;

import io.rece.common.valueobject.id.ClientId;
import io.rece.rental.domain.core.rental.contract.Contract;
import io.rece.rental.domain.core.rental.contract.RentalContract;
import io.rece.rental.domain.core.rental.offer.RentalOfferId;
import io.rece.rental.domain.core.rental.offer.terms.AbstractOfferTerms;

import java.util.UUID;

public class RentalOfferThread implements OfferThread {
    private RentalOfferThreadId id;
    private RentalOfferThreadId parentId;
    private RentalOfferId offerId;
    private ClientId clientId;
    private AbstractOfferTerms rentalTerms;

    public RentalOfferThread(RentalOfferId offerId, ClientId clientId, AbstractOfferTerms rentalTerms) {
        this.id = new RentalOfferThreadId(UUID.randomUUID());
        this.parentId = null;
        this.offerId = offerId;
        this.clientId = clientId;
        this.rentalTerms = rentalTerms;
    }

    private RentalOfferThread(RentalOfferThreadId parentId, RentalOfferId offerId, ClientId clientId, AbstractOfferTerms rentalTerms) {
        this.id = new RentalOfferThreadId(UUID.randomUUID());
        this.parentId = parentId;
        this.offerId = offerId;
        this.clientId = clientId;
        this.rentalTerms = rentalTerms;
    }

    @Override
    public Contract acceptThread() {
        return new RentalContract(this.offerId, this.clientId, this.rentalTerms);
    }

    @Override
    public OfferThread suggestChange(AbstractOfferTerms terms) {
        return new RentalOfferThread(this.id, this.offerId, this.clientId, rentalTerms);
    }
}
