package io.rece.rental.domain.core.rental.offer;

import io.rece.common.valueobject.id.PropertyId;
import io.rece.common.valueobject.money.Money;
import io.rece.common.valueobject.time.TimeDuration;
import lombok.Data;

@Data
public class RentalOffer {
    private RentalOfferId id;
    private PropertyId propertyId;
    private Money price;
    private Money rent;
    private Money deposit;
    private TimeDuration duration;

}

