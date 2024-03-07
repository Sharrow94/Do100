package io.rece.rental.domain.core.property;

import io.rece.common.valueobject.id.OwnerId;
import io.rece.common.valueobject.id.PropertyId;

public abstract class Property<T extends Property<T, V>, V> {
    private PropertyId propertyId;
    private OwnerId ownerId;

    protected abstract V getInfo();

}
