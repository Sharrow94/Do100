package io.rece.inventory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LegType {
    private Station originStation;
    private Station destinationStation;
}
