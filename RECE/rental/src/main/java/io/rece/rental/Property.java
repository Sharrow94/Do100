package io.rece.rental;

import io.rece.common.valueobject.id.ClientId;
import io.rece.common.valueobject.id.OwnerId;
import io.rece.common.valueobject.id.PropertyId;

import java.util.List;

public class Property {
    private PropertyId propertyId;
    private OwnerId ownerId;
    private ClientId tenantId;
    private RentalContract activeRentalContract;
    private List<RentalContract> rentalHistory;
    private PropertyInfo propertyInfo;
}
