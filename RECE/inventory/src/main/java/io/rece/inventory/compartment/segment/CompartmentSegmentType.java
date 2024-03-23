package io.rece.inventory.compartment.segment;

import io.rece.inventory.ClassOfTravel;
import io.rece.inventory.LegType;
import io.rece.inventory.Station;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CompartmentSegmentType {
    private ClassOfTravel classOfTravel;
    private LocalDateTime startOfPeriodOfOperation;
    private LocalDateTime endOfPeriodOfOperation;

    public boolean getAvailability(LocalDateTime day) {
        return !day.isBefore(startOfPeriodOfOperation) && !day.isAfter(endOfPeriodOfOperation);
    }

    public Station getOriginStation() {
        return null;
    }

    public Station getDestinationStation() {
        return null;
    }

    public List<LegType> getLegTypes() {
        return null;
    }
}
