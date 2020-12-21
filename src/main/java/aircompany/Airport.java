import planes.ExperimentalPlane;
import models.MilitaryType;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

import java.util.*;

public class Airport {
    private List<? extends Plane> planesList;

    public Airport(List<? extends Plane> planesList) {
        this.planesList = planesList;
    }

    public List<PassengerPlane> getPassengerPlanesList() {
        List<PassengerPlane> passengerPlanesList = new ArrayList<>();
        for (Plane plane : planesList) {
            if (plane instanceof PassengerPlane) {
                passengerPlanesList.add((PassengerPlane) plane);
            }
        }
        return passengerPlanesList;
    }

    public List<MilitaryPlane> getMilitaryPlanesList() {
        List<MilitaryPlane> militaryPlanesList = new ArrayList<>();
        for (Plane plane : planesList) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanesList.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanesList;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanesList = getPassengerPlanesList();
        PassengerPlane planeWithMaxCapacity = passengerPlanesList.get(0);
        for (PassengerPlane passengerPlane : passengerPlanesList) {
            if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlane;
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanesList() {
        List<MilitaryPlane> transportMilitaryPlanesList = new ArrayList<>();
        List<MilitaryPlane> militaryPlanesList = getMilitaryPlanesList();
        for (MilitaryPlane militaryPlane : militaryPlanesList) {
            if (militaryPlane.getMilitaryType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanesList.add(militaryPlane);
            }
        }
        return transportMilitaryPlanesList;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanesList() {
        List<MilitaryPlane> bomberMilitaryPlanesList = new ArrayList<>();
        List<MilitaryPlane> militaryPlanesList = getMilitaryPlanesList();
        for (MilitaryPlane militaryPlane : militaryPlanesList) {
            if (militaryPlane.getMilitaryType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanesList.add(militaryPlane);
            }
        }
        return bomberMilitaryPlanesList;

    }

    public List<ExperimentalPlane> getExperimentalPlanesList() {
        List<ExperimentalPlane> experimentalPlanesList = new ArrayList<>();
        for (Plane plane : planesList) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanesList.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanesList;
    }

    public void sortPlanesByMaxFlightDistance() {
        planesList.sort(new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxFlightDistance() - o2.getMaxFlightDistance();
            }
        });
    }

    public void sortPlanesByMaxSpeed() {
        planesList.sort(new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxSpeed() - o2.getMaxSpeed();
            }
        });
    }

    public void sortPlanesByMaxLoadCapacity() {
        planesList.sort(new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMinLoadCapacity() - o2.getMinLoadCapacity();
            }
        });
    }

    public List<? extends Plane> getPlanesList() {
        return planesList;
    }

    public void printPlanesToConsole() {
        for (Plane plane : planesList) {
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planesList.toString() +
                '}';
    }
}
