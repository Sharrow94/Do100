package io.rece.rental.domain.core.property.type;

import io.rece.rental.domain.core.property.Property;
import io.rece.rental.domain.core.property.info.ApartmentInfo;

public class Apartment extends Property<Apartment, ApartmentInfo> {

    @Override
    protected ApartmentInfo getInfo() {
        return null;
    }
}
