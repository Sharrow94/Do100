package com.rece.property.property;

import com.rece.property.service.rental.ForRental;
import com.rece.property.service.rental.RentalContract;
import com.rece.property.service.rental.RentalOffer;
import com.rece.property.service.sale.ForSale;
import com.rece.property.service.sale.SellOffer;
import io.rece.common.valueobject.id.ClientId;

public class Apartment extends Property implements ForRental, ForSale {

    private RentalContract activeRentalContract;

    @Override
    public void startRenting(ClientId clientId, RentalOffer offer) {
        offer.accept(this);
    }

    @Override
    public RentalContract getActiveRentalContract() {
        return activeRentalContract;
    }

    @Override
    public void sell(ClientId clientId, SellOffer offer) {
        offer.accept(this);
    }
}
