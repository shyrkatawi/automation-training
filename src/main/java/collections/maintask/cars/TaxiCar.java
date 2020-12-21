package collections.maintask.cars;

import collections.maintask.types.BodyType;
import collections.maintask.types.EngineType;

import java.util.Objects;

public class TaxiCar extends Car {
    private int maxNumberOfClients;

    public TaxiCar(int fuelConsumption, int speed, BodyType bodyType, EngineType engineType, int price, int maxNumberOfClients) {
        super(fuelConsumption, speed, bodyType, engineType, price);
        this.maxNumberOfClients = maxNumberOfClients;
    }

    public void startTaxiService() {
        System.out.println("service started");
    }

    public void endTaxiService() {
        System.out.println("service ended");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxiCar taxiCar = (TaxiCar) o;
        return maxNumberOfClients == taxiCar.maxNumberOfClients;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxNumberOfClients);
    }

    @Override
    public String toString() {
        return "TaxiCar: " +
                "maxNumberOfClients=" + maxNumberOfClients +
                ", " +
                super.toString();
    }
}