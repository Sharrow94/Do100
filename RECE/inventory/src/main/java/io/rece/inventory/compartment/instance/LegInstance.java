package io.rece.inventory.compartment.instance;

import io.rece.inventory.Station;
import io.rece.inventory.compartment.Leg;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class LegInstance {
    private Leg leg;
    private LocalDateTime timeOfDeparture;
    private LocalDateTime timeOfArrival;

    public Station getOriginStation() {
        return leg.getOriginStation();
    }

    public Station getDestinationStation() {
        return leg.getDestinationStation();
    }
}
