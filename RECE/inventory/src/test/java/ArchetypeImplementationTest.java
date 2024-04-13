import io.rece.inventory.Seat;
import io.rece.inventory.Station;
import io.rece.inventory.compartment.Leg;
import io.rece.inventory.compartment.instance.CompartmentSegmentInstance;
import io.rece.inventory.compartment.instance.LegInstance;
import io.rece.inventory.compartment.type.CompartmentLegType;
import io.rece.inventory.compartment.type.CompartmentSegmentType;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.util.List;

import static io.rece.inventory.ClassOfTravel.FIRST;
import static io.rece.inventory.ClassOfTravel.SECOND;
import static java.time.LocalDateTime.parse;
import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArchetypeImplementationTest {

    @Test
    public void buildTrain() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        Leg leg1 = new Leg(new Station("Poznań"), new Station("Łódź"));
        Leg leg2 = new Leg(new Station("Łódź"), new Station("Warszawa"));

        LegInstance legInstance1 = new LegInstance(leg1, parse("2024-03-23 12:15", formatter), parse("2024-03-23 14:15", formatter));
        LegInstance legInstance2 = new LegInstance(leg2, parse("2024-03-23 14:30", formatter), parse("2024-03-23 16:15", formatter));

        Seat seat_L01 = new Seat("L01");
        CompartmentSegmentInstance ticket1 = new CompartmentSegmentInstance(FIRST, seat_L01, of(legInstance1, legInstance2));
        Seat seat_L02 = new Seat("L02");
        CompartmentSegmentInstance ticket2 = new CompartmentSegmentInstance(FIRST, seat_L02, of(legInstance2));

        List<CompartmentSegmentInstance> existingTickets = List.of(ticket1, ticket2);
        assertFalse(canBeReserved(existingTickets, seat_L01, legInstance2));
        assertTrue(canBeReserved(existingTickets, seat_L02, legInstance1));
    }

    @Test
    public void buyTicket() {
        //given
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


        Leg leg1 = new Leg(new Station("Poznań"), new Station("Łódź"));
        Leg leg2 = new Leg(new Station("Łódź"), new Station("Warszawa"));
        Seat seat = new Seat("L01");

        CompartmentLegType compartmentLegType1 = new CompartmentLegType(FIRST, leg1);
        CompartmentLegType compartmentLegType2 = new CompartmentLegType(SECOND, leg2);

        CompartmentSegmentType compartmentSegmentType = new CompartmentSegmentType();
        compartmentSegmentType.setCompartmentLegTypes(of(compartmentLegType1, compartmentLegType2));
        LegInstance legInstance1 = new LegInstance(leg1, parse("2024-03-23 12:15", formatter), parse("2024-03-23 14:15", formatter));
        LegInstance legInstance2 = new LegInstance(leg2, parse("2024-03-23 14:30", formatter), parse("2024-03-23 16:15", formatter));

        List<LegInstance> legInstanceList = of(legInstance1, legInstance2);
    }


    public boolean canBeReserved(List<CompartmentSegmentInstance> tickets, Seat seat, LegInstance legInstance) {
        return tickets.stream()
                .flatMap(ticket -> ticket.getCompartmentLegInstances().stream())
                .filter(compartmentLegInstance -> compartmentLegInstance.getLegInstance().equals(legInstance))
                .noneMatch(compartmentLegInstance -> compartmentLegInstance.getSeat().equals(seat));
    }
}
