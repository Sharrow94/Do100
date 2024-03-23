package io.rece.inventory.compartment.leg;

import io.rece.inventory.ClassOfTravel;
import io.rece.inventory.Seat;
import io.rece.inventory.Station;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CompartmentLegInstance {
    private ClassOfTravel classOfTravel;
    private Seat seat;
    private CompartmentLegType type;

    public Station getOriginStation() {
        return type.getLegType().getOriginStation();
    }

    public Station getDestinationStation() {
        return type.getLegType().getDestinationStation();
    }

    public LocalDateTime getTimeOfDeparture() {
        return null;
    }

    public LocalDateTime getTimeOfArrival() {
        return null;
    }
}
