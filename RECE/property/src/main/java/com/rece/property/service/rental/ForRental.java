package com.rece.property.service.rental;

import io.rece.common.valueobject.id.ClientId;

public interface ForRental {

    void startRenting(ClientId clientId, RentalOffer offer);

    RentalContract getActiveRentalContract();
}
