package io.rece.rental.domain.core.rental.offer;

import io.rece.common.valueobject.id.BaseId;

import java.util.UUID;

public class RentalOfferThreadId extends BaseId<UUID> {

    public RentalOfferThreadId(UUID value) {
        super(value);
    }
}
