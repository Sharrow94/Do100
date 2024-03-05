package com.rece.property.property;

public interface PropertyService {

    void create(Property property);

    Property getProperty(Long id);

    void update(Property property);

    void delete(Long propertyId);
}
