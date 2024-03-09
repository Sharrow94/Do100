package io.rece.rental.domain.core.rental;

import io.rece.common.valueobject.id.ClientId;
import io.rece.common.valueobject.id.OwnerId;
import io.rece.common.valueobject.id.PropertyId;

public class Rental {
    private PropertyId propertyId;
    private OwnerId ownerId;
    private ClientId clientId;
}
