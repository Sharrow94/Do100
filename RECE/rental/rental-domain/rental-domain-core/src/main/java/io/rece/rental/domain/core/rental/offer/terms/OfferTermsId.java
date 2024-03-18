package io.rece.rental.domain.core.rental.offer.terms;

import io.rece.common.valueobject.id.BaseId;

import java.util.UUID;

public class OfferTermsId extends BaseId<UUID> {
    public OfferTermsId(UUID value) {
        super(value);
    }
}
