package io.rece.rental.domain.core;

import io.rece.common.valueobject.id.ClientId;
import io.rece.common.valueobject.money.Money;
import io.rece.rental.domain.core.property.Property;

public class RentalOffer {

    private Money price;

    private Property property;

    public RentalContract acceptBy(ClientId clientId) {
        return new RentalContract(this, clientId);
    }
}
