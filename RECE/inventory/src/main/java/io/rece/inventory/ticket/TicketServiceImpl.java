package io.rece.inventory.ticket;

import io.rece.inventory.Seat;
import io.rece.inventory.compartment.instance.CompartmentSegmentInstance;
import io.rece.inventory.compartment.instance.LegInstance;
import io.rece.inventory.compartment.type.CompartmentSegmentType;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final JourneySearchEngine journeySearchEngine;

    @Override
    public CompartmentSegmentInstance bookTicket(CompartmentSegmentType compartmentSegmentType, Seat seat) {
        List<LegInstance> route = journeySearchEngine.getRoute(compartmentSegmentType.getLegTypes());
//        return new CompartmentSegmentInstance(compartmentSegmentType, seat, route);
        return null;
    }
}
