package io.rece.rental.domain.core.rental.offer;

import io.rece.common.valueobject.money.Money;
import lombok.Data;

@Data
public class OfferData {
    private Money price;
    private Money rent;
    private Money deposit;
}
