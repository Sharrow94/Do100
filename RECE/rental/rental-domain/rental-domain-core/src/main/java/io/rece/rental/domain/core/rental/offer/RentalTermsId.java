package io.rece.rental.domain.core.rental.offer;

import io.rece.common.valueobject.id.BaseId;

import java.util.UUID;

public class RentalTermsId extends BaseId<UUID> {
    public RentalTermsId(UUID value) {
        super(value);
    }
}
