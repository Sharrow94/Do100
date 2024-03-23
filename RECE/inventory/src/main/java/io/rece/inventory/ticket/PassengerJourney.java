package io.rece.inventory.ticket;

import lombok.Data;

import java.util.List;

@Data
public class PassengerJourney {
    private List<JourneySeat> journeySeats;
}
