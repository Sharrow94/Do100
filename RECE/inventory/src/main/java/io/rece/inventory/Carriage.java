package io.rece.inventory;

import io.rece.inventory.compartment.segment.CompartmentSegmentInstance;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Carriage {
    private String name;
    private List<CompartmentSegmentInstance> compartmentSegments;
}
