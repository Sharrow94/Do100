package io.rece.inventory;

import io.rece.inventory.compartment.instance.LegInstance;
import lombok.Data;

import java.util.List;

@Data
public class CarriageJourney {
    private Carriage carriage;
    private List<LegInstance> legs;
}
