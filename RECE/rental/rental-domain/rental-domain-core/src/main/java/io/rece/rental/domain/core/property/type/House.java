package io.rece.rental.domain.core.property.type;

import io.rece.rental.domain.core.property.Property;
import io.rece.rental.domain.core.property.info.HouseInfo;

public class House extends Property<House, HouseInfo> {

    @Override
    protected HouseInfo getInfo() {
        return null;
    }
}
