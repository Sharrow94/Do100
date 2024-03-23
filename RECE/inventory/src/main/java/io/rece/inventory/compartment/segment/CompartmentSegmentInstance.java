package io.rece.inventory.compartment.segment;


import io.rece.inventory.ClassOfTravel;
import io.rece.inventory.Seat;
import io.rece.inventory.Station;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CompartmentSegmentInstance {
    private ClassOfTravel classOfTravel;
    private List<Seat> seats;

    public Station getOriginStation() {
        return null;
    }

    public Station getDestinationStation() {
        return null;
    }

    public LocalDateTime getTimeOfDeparture() {
        return null;
    }

    public LocalDateTime getTimeOfArrival() {
        return null;
    }
}
