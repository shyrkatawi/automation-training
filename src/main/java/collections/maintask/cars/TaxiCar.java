package java_collections.maintask.cars;

import java_collections.maintask.types.BodyType;
import java_collections.maintask.types.EngineType;

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
    public String toString() {
        return "TaxiCar: " +
                "maxNumberOfClients=" + maxNumberOfClients +
                ", " +
                super.toString();
    }
}