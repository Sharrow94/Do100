package io.rece.inventory.compartment.type;

import io.rece.inventory.ClassOfTravel;
import io.rece.inventory.Station;
import io.rece.inventory.compartment.Leg;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompartmentLegType {
    private ClassOfTravel classOfTravel;
    private Leg legType;

    public Station getOriginStation() {
        return legType.getOriginStation();
    }

    public Station getDestinationStation() {
        return legType.getDestinationStation();
    }
}
