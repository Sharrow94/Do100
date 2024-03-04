package com.rece.property;

import com.rece.property.rental.ForRental;
import com.rece.property.rental.RentalOffer;
import io.rece.common.valueobject.id.ClientId;

public class Apartment extends Property implements ForRental, ForSale {
    @Override
    public void startRenting(ClientId clientId, RentalOffer offer) {
        offer.accept(this);
    }

    @Override
    public void sell(ClientId clientId, SellOffer offer) {
        offer.accept(this);
    }
}
