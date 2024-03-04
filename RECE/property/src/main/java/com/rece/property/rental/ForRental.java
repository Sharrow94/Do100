package com.rece.property.rental;

import io.rece.common.valueobject.id.ClientId;

public interface ForRental {

    void startRenting(ClientId clientId, RentalOffer offer);
}
