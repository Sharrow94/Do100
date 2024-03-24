import io.rece.inventory.ClassOfTravel;
import io.rece.inventory.Seat;
import io.rece.inventory.Station;
import io.rece.inventory.compartment.Leg;
import io.rece.inventory.compartment.instance.CompartmentLegInstance;
import io.rece.inventory.compartment.instance.LegInstance;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;

import static java.time.LocalDateTime.parse;

public class ArchetypeImplementationTest {

    @Test
    public void buildTrain() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        Leg leg1 = new Leg(new Station("Poznań"), new Station("Łódź"));
        Leg leg2 = new Leg(new Station("Łódź"), new Station("Warszawa"));
        Leg leg3 = new Leg(new Station("Warszawa"), new Station("Lublin"));

        LegInstance legInstance1 = new LegInstance(leg1, parse("2024-03-23 12:15", formatter), parse("2024-03-23 14:15", formatter));
        LegInstance legInstance2 = new LegInstance(leg1, parse("2024-03-23 14:30", formatter), parse("2024-03-23 16:15", formatter));
        LegInstance legInstance3 = new LegInstance(leg1, parse("2024-03-23 16:30", formatter), parse("2024-03-23 18:45", formatter));

        CompartmentLegInstance compartmentLegInstance1 = new CompartmentLegInstance(ClassOfTravel.FIRST, new Seat(1), legInstance1);
        CompartmentLegInstance compartmentLegInstance2 = new CompartmentLegInstance(ClassOfTravel.FIRST, new Seat(2), legInstance1);
        CompartmentLegInstance compartmentLegInstance3 = new CompartmentLegInstance(ClassOfTravel.FIRST, new Seat(3), legInstance1);
        CompartmentLegInstance compartmentLegInstance4 = new CompartmentLegInstance(ClassOfTravel.SECOND, new Seat(4), legInstance1);
        CompartmentLegInstance compartmentLegInstance5 = new CompartmentLegInstance(ClassOfTravel.SECOND, new Seat(5), legInstance1);
        CompartmentLegInstance compartmentLegInstance6 = new CompartmentLegInstance(ClassOfTravel.SECOND, new Seat(6), legInstance1);
    }
}
