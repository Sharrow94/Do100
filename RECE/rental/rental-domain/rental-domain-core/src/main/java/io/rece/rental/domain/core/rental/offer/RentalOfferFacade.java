package io.rece.rental.domain.core.rental.offer;

import io.rece.common.valueobject.id.PropertyId;

public interface RentalOfferFacade {

    void createOffer(PropertyId propertyId, OfferData offerData);
}
