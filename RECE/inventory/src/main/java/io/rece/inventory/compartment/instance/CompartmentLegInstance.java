package io.rece.inventory.compartment.instance;

import io.rece.inventory.ClassOfTravel;
import io.rece.inventory.Seat;
import io.rece.inventory.Station;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CompartmentLegInstance {
    private ClassOfTravel classOfTravel;
    private Seat seat;
    private LegInstance legInstance;

    public Station getOriginStation() {
        return legInstance.getOriginStation();
    }

    public Station getDestinationStation() {
        return legInstance.getDestinationStation();
    }

    public LocalDateTime getTimeOfDeparture() {
        return legInstance.getTimeOfDeparture();
    }

    public LocalDateTime getTimeOfArrival() {
        return legInstance.getTimeOfArrival();
    }
}
