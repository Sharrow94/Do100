import io.rece.inventory.*;
import io.rece.inventory.compartment.Leg;
import io.rece.inventory.compartment.instance.CompartmentSegmentInstance;
import io.rece.inventory.compartment.instance.LegInstance;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.util.List;

import static io.rece.inventory.ClassOfTravel.FIRST;
import static io.rece.inventory.ClassOfTravel.SECOND;
import static java.time.LocalDateTime.parse;
import static java.util.List.of;

class ArchetypePatternsImplementationApplicationTests {

    @Test
    void build_train() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        Leg firstLegType = new Leg(new Station("Poznań"), new Station("Łódź"));
//        Leg secondLegType = new Leg(new Station("Łódź"), new Station("Warszawa"));
//
//        LegInstance firstLegInstance = new LegInstance(firstLegType, parse("2024-03-23 12:15", formatter), parse("2024-03-23 14:15", formatter));
//        LegInstance secondLegInstance = new LegInstance(secondLegType, parse("2024-03-23 14:30", formatter), parse("2024-03-23 17:00", formatter));
//
//        CompartmentSegmentInstance compartmentSegment_1_1 = prepareCompartmentSegment(of(new Seat(1), new Seat(2)), FIRST);
//        CompartmentSegmentInstance compartmentSegment_1_2 = prepareCompartmentSegment(of(new Seat(3), new Seat(4)), SECOND);
//        Carriage carriage1 = new Carriage("L01", of(compartmentSegment_1_1, compartmentSegment_1_2));
//
//        CompartmentSegmentInstance compartmentSegment_2_1 = prepareCompartmentSegment(of(new Seat(1), new Seat(2)), SECOND);
//        Carriage carriage2 = new Carriage("L02", of(compartmentSegment_2_1));
//
//        CarriageJourney carriageJourney1 = new CarriageJourney();
//        carriageJourney1.setCarriage(carriage1);
//        carriageJourney1.setLegs(of(firstLegInstance, secondLegInstance));
//
//        CarriageJourney carriageJourney2 = new CarriageJourney();
//        carriageJourney2.setCarriage(carriage2);
//        carriageJourney2.setLegs(of(secondLegInstance));
//
//        TrainJourney trainJourney = new TrainJourney();
//        trainJourney.setCarriageJourneys(of(carriageJourney1, carriageJourney2));
    }


//    private CompartmentSegmentInstance prepareCompartmentSegment(List<Seat> seats, ClassOfTravel classOfTravel) {
//        CompartmentSegmentInstance compartmentSegment = new CompartmentSegmentInstance();
//        compartmentSegment.setClassOfTravel(classOfTravel);
//        return compartmentSegment;
//    }

    @Test
    public void sell_ticket() {
        //given
//        TicketService ticketService;
        //when

        //then
    }
}
