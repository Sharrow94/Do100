package io.rece.rental.domain.core;

import io.rece.rental.domain.core.property.Property;

public interface RentalDomainService {

    void createRentalOffer(Property<?, ?> property);


}
