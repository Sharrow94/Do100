import io.rece.inventory.ClassOfTravel;
import io.rece.inventory.Seat;
import io.rece.inventory.Station;
import io.rece.inventory.compartment.Leg;
import io.rece.inventory.compartment.instance.CompartmentSegmentInstance;
import io.rece.inventory.compartment.instance.LegInstance;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Stream;

import static java.time.LocalDateTime.parse;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ArchetypeImplementationTest {

    @Test
    public void buildTrain() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        Leg leg1 = new Leg(new Station("Poznań"), new Station("Łódź"));
        Leg leg2 = new Leg(new Station("Łódź"), new Station("Warszawa"));

        LegInstance legInstance1 = new LegInstance(leg1, parse("2024-03-23 12:15", formatter), parse("2024-03-23 14:15", formatter));
        LegInstance legInstance2 = new LegInstance(leg2, parse("2024-03-23 14:30", formatter), parse("2024-03-23 16:15", formatter));

        CompartmentSegmentInstance ticket1 = new CompartmentSegmentInstance(ClassOfTravel.FIRST, new Seat("L01"));
        ticket1.createTicketForRoutes(List.of(legInstance1, legInstance2));

        CompartmentSegmentInstance ticket2 = new CompartmentSegmentInstance(ClassOfTravel.FIRST, new Seat("L02"));
        ticket2.createTicketForRoutes(List.of(legInstance2));

        Seat seat=new Seat("L01");

        assertFalse(canBeReserved(Stream.of(ticket1,ticket2),seat,legInstance2));
    }

    public boolean canBeReserved(Stream<CompartmentSegmentInstance>tickets,Seat seat,LegInstance legInstance){
        return tickets
                .flatMap(ticket->ticket.getCompartmentLegInstances().stream())
                .filter(compartmentLegInstance -> compartmentLegInstance.getLegInstance().equals(legInstance))
                .noneMatch(compartmentLegInstance ->compartmentLegInstance.getSeat().equals(seat));
    }
}
