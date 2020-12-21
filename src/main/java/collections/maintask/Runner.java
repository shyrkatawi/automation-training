package java_collections.maintask;

import java_collections.maintask.cars.TaxiCar;
import java_collections.maintask.types.BodyType;
import java_collections.maintask.types.EngineType;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<TaxiCar> taxiCarList = Arrays.asList(
                new TaxiCar(10, 110, BodyType.HATCHBACK, EngineType.DIESEL, 1000, 2),
                new TaxiCar(11, 130, BodyType.SEDAN, EngineType.DIESEL, 1300, 4),
                new TaxiCar(7, 120, BodyType.SEDAN, EngineType.ELECTRIC, 1200, 2),
                new TaxiCar(8, 140, BodyType.HATCHBACK, EngineType.ELECTRIC, 2000, 3),
                new TaxiCar(11, 180, BodyType.VAN, EngineType.PETROL, 3000, 5)
        );

        TaxiCompany taxiCompany = new TaxiCompany(taxiCarList);
        taxiCompany.printTaxiCarsInformation();

        int totalCostOfCompany = taxiCompany.calculateTotalCostOfCompany();
        System.out.println("Taxi company cost: " + totalCostOfCompany);

        taxiCompany.sortTaxiCarsByFuelConsumption();
        System.out.println("Sorted taxi cars by fuel consumption");
        taxiCompany.printTaxiCarsInformation();

        int minSpeed = 120;
        int maxSpeed = 140;
        System.out.printf("Taxi cars by speed limit, from %d to %d\n",minSpeed,maxSpeed);
        List<TaxiCar> taxiCarListBySpeedRange = taxiCompany.getTaxiCarListBySpeedRange(minSpeed, maxSpeed);
        for (TaxiCar taxiCar : taxiCarListBySpeedRange) {
            System.out.println(taxiCar);
        }
    }
}
