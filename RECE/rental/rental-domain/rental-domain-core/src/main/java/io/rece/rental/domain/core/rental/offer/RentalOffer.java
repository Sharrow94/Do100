package io.rece.rental.domain.core.rental.offer;

import io.rece.common.valueobject.id.ClientId;
import io.rece.common.valueobject.id.PropertyId;
import io.rece.rental.domain.core.rental.RentalContract;
import io.rece.rental.domain.core.rental.abs.offer.terms.OfferTerms;

public class RentalOffer {
    private RentalOfferId id;
    private PropertyId propertyId;
    private OfferTerms rentalTerms;
    private boolean isToNegotiate;

    public RentalOffer(RentalOfferId id, PropertyId propertyId, OfferTerms rentalTerms, boolean isToNegotiate) {
        this.id = id;
        this.propertyId = propertyId;
        this.rentalTerms = rentalTerms;
        this.isToNegotiate = isToNegotiate;
    }

    public RentalOfferThread startNegotiationThread(ClientId clientId, OfferTerms rentalTerms) {
        if (!isToNegotiate) {
            throw new RuntimeException("Can't start negotiation thread for offer with id: " + id.getValue());
        }
        return new RentalOfferThread(this.id, clientId, rentalTerms);
    }

    public RentalContract acceptBy(ClientId clientId) {
        return new RentalContract(this.id, clientId, rentalTerms);
    }
}

