package io.rece.property.property;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository propertyRepository;

    @Override
    public void create(Property property) {

    }

    @Override
    public Property getProperty(Long id) {
        return null;
    }

    @Override
    public void update(Property property) {

    }

    @Override
    public void delete(Long propertyId) {

    }
}
