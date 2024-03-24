package io.rece.inventory.compartment.instance;


import io.rece.inventory.ClassOfTravel;
import io.rece.inventory.Station;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CompartmentSegmentInstance {
    private ClassOfTravel classOfTravel;
    private CompartmentLegInstance compartmentLegInstance;

    public Station getOriginStation() {
        return compartmentLegInstance.getOriginStation();
    }

    public Station getDestinationStation() {
        return compartmentLegInstance.getDestinationStation();
    }

    public LocalDateTime getTimeOfDeparture() {
        return compartmentLegInstance.getTimeOfDeparture();
    }

    public LocalDateTime getTimeOfArrival() {
        return compartmentLegInstance.getTimeOfArrival();
    }
}
