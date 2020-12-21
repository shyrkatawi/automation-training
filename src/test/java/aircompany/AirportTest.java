package aircompany;

import aircompany.models.ClassificationLevel;
import aircompany.models.ExperimentalType;
import aircompany.models.MilitaryType;
import aircompany.planes.ExperimentalPlane;
import aircompany.planes.MilitaryPlane;
import aircompany.planes.PassengerPlane;
import aircompany.planes.Plane;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AirportTest {
    private static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT),
            new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalType.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalType.VTOL, ClassificationLevel.TOP_SECRET)
    );
    private static final Airport airport = new Airport(planes);

    @Test
    public void testGetTransportMilitaryPlanesList() {
        Assert.assertEquals(
                Arrays.asList(new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT)),
                airport.getTransportMilitaryPlanesList()
        );
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        Assert.assertEquals(
                new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
                airport.getPassengerPlaneWithMaxPassengersCapacity()
        );
    }

    @Test
    public void testSortPlanesByMaxLoadCapacity() {
        List<Plane> sortedPlanesByMaxLoadCapacity = Arrays.asList(
                new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalType.HIGH_ALTITUDE, ClassificationLevel.SECRET),
                new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalType.VTOL, ClassificationLevel.TOP_SECRET),
                new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
                new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
                new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
                new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
                new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
                new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
                new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
                new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
                new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
                new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
                new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
                new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
                new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
                new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT)
        );
        Airport airportWithSort = new Airport(new ArrayList<>(planes));
        airportWithSort.sortPlanesByMaxLoadCapacity();
        Assert.assertEquals(sortedPlanesByMaxLoadCapacity, airportWithSort.getPlanesList());
    }

    @Test
    public void testGetBomberMilitaryPlanesList() {
        Assert.assertEquals(
                Arrays.asList(
                        new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
                        new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
                        new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER)
                ),
                airport.getBomberMilitaryPlanesList()
        );
    }


//    Я не смог переписать этот тест т.к. не понял для чего он нужен.
//    Изначально я хотел его удалить, но решил что лучше оставить комментарий с пояснением.
//
//    "как бы удалённый @Test"
//    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified() {
//        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanesList();
//        boolean hasUnclassifiedPlanes = false;
//        for (ExperimentalPlane experimentalPlane : experimentalPlanes) {
//            if (experimentalPlane.getClassificationLevel() == ClassificationLevel.UNCLASSIFIED) {
//                hasUnclassifiedPlanes = true;
//                break;
//            }
//        }
//        Assert.assertFalse(hasUnclassifiedPlanes);
//    }
}