package io.rece.inventory;

import io.rece.inventory.compartment.instance.CompartmentSegmentInstance;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Carriage {
    private String name;
    private List<CompartmentSegmentInstance> compartmentSegments;
}
