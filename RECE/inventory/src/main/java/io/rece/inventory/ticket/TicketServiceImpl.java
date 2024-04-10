package io.rece.inventory.ticket;

import io.rece.inventory.Seat;
import io.rece.inventory.compartment.instance.CompartmentSegmentInstance;
import io.rece.inventory.compartment.type.CompartmentSegmentType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {


    @Override
    public CompartmentSegmentInstance bookTicket(CompartmentSegmentType compartmentSegmentType, Seat seat) {
        return null;
    }
}
