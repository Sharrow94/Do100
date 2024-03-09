package io.rece.rental.domain.core.rental.offer;

import io.rece.common.valueobject.id.BaseId;

import java.util.UUID;

public class RentalOfferId extends BaseId<UUID> {
    public RentalOfferId(UUID value) {
        super(value);
    }
}
