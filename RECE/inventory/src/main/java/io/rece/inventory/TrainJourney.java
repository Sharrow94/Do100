package io.rece.inventory;

import lombok.Data;

import java.util.List;

@Data
public class TrainJourney {
    List<CarriageJourney> carriageJourneys;
}
