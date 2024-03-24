package io.rece.inventory.compartment;

import io.rece.inventory.Station;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Leg {
    private Station originStation;
    private Station destinationStation;
}
