package io.rece.inventory.compartment.type;

import io.rece.inventory.ClassOfTravel;
import io.rece.inventory.Station;
import io.rece.inventory.compartment.Leg;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class CompartmentSegmentType {
    private ClassOfTravel classOfTravel;
    private LocalDateTime startOfPeriodOfOperation;
    private LocalDateTime endOfPeriodOfOperation;
    private List<CompartmentLegType> compartmentLegTypes;

    public boolean getAvailability(LocalDateTime day) {
        return !day.isBefore(startOfPeriodOfOperation) && !day.isAfter(endOfPeriodOfOperation);
    }

    public Station getOriginStation() {
        if (compartmentLegTypes.isEmpty()) {
            throw new RuntimeException("CompartmentSegmentType must have origin station");
        }
        return compartmentLegTypes.get(0).getOriginStation();
    }

    public Station getDestinationStation() {
        if (compartmentLegTypes.isEmpty()) {
            throw new RuntimeException("CompartmentSegmentType must have destination station");
        }
        return compartmentLegTypes.get(compartmentLegTypes.size() - 1).getDestinationStation();
    }

    public List<Leg> getLegTypes() {
        return compartmentLegTypes.stream().map(CompartmentLegType::getLegType).collect(Collectors.toList());
    }
}
