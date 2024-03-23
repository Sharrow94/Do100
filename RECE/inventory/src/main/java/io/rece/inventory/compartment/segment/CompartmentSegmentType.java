package io.rece.inventory.compartment.segment;

import io.rece.inventory.LegType;
import io.rece.inventory.Station;
import io.rece.inventory.compartment.leg.CompartmentLegType;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class CompartmentSegmentType {
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

    public List<LegType> getLegTypes() {
        return compartmentLegTypes.stream().map(CompartmentLegType::getLegType).collect(Collectors.toList());
    }
}
