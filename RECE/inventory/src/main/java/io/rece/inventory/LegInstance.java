package io.rece.inventory;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class LegInstance {
    private LegType legType;
    private LocalDateTime timeOfDeparture;
    private LocalDateTime timeOfArrival;

    public Station getOriginStation() {
        return legType.getOriginStation();
    }

    public Station getDestinationStation() {
        return legType.getDestinationStation();
    }
}
