package io.rece.inventory.compartment.leg;

import io.rece.inventory.LegType;
import io.rece.inventory.Station;
import lombok.Data;

@Data
public class CompartmentLegType {
    private LegType legType;

    public Station getOriginStation() {
        return legType.getOriginStation();
    }

    public Station getDestinationStation() {
        return legType.getDestinationStation();
    }
}
