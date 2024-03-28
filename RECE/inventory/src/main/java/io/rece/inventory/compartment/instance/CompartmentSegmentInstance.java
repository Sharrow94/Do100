package io.rece.inventory.compartment.instance;


import io.rece.inventory.ClassOfTravel;
import io.rece.inventory.Seat;
import io.rece.inventory.Station;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class CompartmentSegmentInstance {
    private final ClassOfTravel classOfTravel;
    private final Seat seat;
    private List<CompartmentLegInstance> compartmentLegInstances;

    public CompartmentSegmentInstance(ClassOfTravel classOfTravel, Seat seat, List<LegInstance> route) {
        this.classOfTravel = classOfTravel;
        this.seat = seat;
        setRoute(route);
    }

    private void setRoute(List<LegInstance> legInstances) {
        if (legInstances.isEmpty()) {
            throw new RuntimeException("List cant be empty");
        }
        compartmentLegInstances = legInstances.stream().map(legInstance -> new CompartmentLegInstance(classOfTravel, seat, legInstance)).collect(Collectors.toList());
    }

    public Station getOriginStation() {
        if (compartmentLegInstances.isEmpty()) {
            throw new RuntimeException("CompartmentSegmentInstance must have origin station");
        }
        return compartmentLegInstances.get(0).getOriginStation();
    }

    public Station getDestinationStation() {
        return compartmentLegInstances.get(compartmentLegInstances.size() - 1).getDestinationStation();
    }

    public LocalDateTime getTimeOfDeparture() {
        return compartmentLegInstances.get(0).getTimeOfDeparture();
    }

    public LocalDateTime getTimeOfArrival() {
        return compartmentLegInstances.get(compartmentLegInstances.size() - 1).getTimeOfArrival();
    }

    public String getSeatNumber() {
        return seat.getSeatNumber();
    }
}
