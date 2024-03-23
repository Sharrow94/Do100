package io.rece.inventory.ticket;

import lombok.Data;

import java.util.List;

@Data
public class Ticket {
    private Passenger passenger;
    private List<PassengerJourney> journeyList;
}
