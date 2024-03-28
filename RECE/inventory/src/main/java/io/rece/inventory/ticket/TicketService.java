package io.rece.inventory.ticket;

import io.rece.inventory.Seat;
import io.rece.inventory.compartment.instance.CompartmentSegmentInstance;
import io.rece.inventory.compartment.type.CompartmentSegmentType;

public interface TicketService {

    CompartmentSegmentInstance bookTicket(CompartmentSegmentType compartmentSegmentType, Seat seat);
}
