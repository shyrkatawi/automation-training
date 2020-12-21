package collections.maintask;

import collections.maintask.cars.TaxiCar;
import collections.maintask.types.BodyType;
import collections.maintask.types.EngineType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TaxiCompanyTest {
    private static List<TaxiCar> taxiCarList = Arrays.asList(
            new TaxiCar(10, 110, BodyType.HATCHBACK, EngineType.DIESEL, 1000, 2),
            new TaxiCar(11, 130, BodyType.SEDAN, EngineType.DIESEL, 1300, 4),
            new TaxiCar(7, 120, BodyType.SEDAN, EngineType.ELECTRIC, 1200, 2),
            new TaxiCar(8, 140, BodyType.HATCHBACK, EngineType.ELECTRIC, 2000, 3),
            new TaxiCar(11, 180, BodyType.VAN, EngineType.PETROL, 3000, 5)
    );

    private static TaxiCompany taxiCompany = new TaxiCompany(taxiCarList);

    @Test
    public void calculateTotalCostOfCompany() {
        Assert.assertEquals(8500, taxiCompany.calculateTotalCostOfCompany());
    }

    @Test
    public void sortTaxiCarsByFuelConsumption() {
        List<TaxiCar> sortedResultList = Arrays.asList(
                new TaxiCar(7, 120, BodyType.SEDAN, EngineType.ELECTRIC, 1200, 2),
                new TaxiCar(8, 140, BodyType.HATCHBACK, EngineType.ELECTRIC, 2000, 3),
                new TaxiCar(10, 110, BodyType.HATCHBACK, EngineType.DIESEL, 1000, 2),
                new TaxiCar(11, 130, BodyType.SEDAN, EngineType.DIESEL, 1300, 4),
                new TaxiCar(11, 180, BodyType.VAN, EngineType.PETROL, 3000, 5)
        );
        TaxiCompany sortedTaxiCompany = new TaxiCompany(new ArrayList<>(taxiCarList));
        sortedTaxiCompany.sortTaxiCarsByFuelConsumption();
        Assert.assertEquals(sortedResultList, sortedTaxiCompany.getTaxiCarList());
    }

    @Test
    public void getTaxiCarListBySpeedRange() {
        List<TaxiCar> taxiCarsBySpeedLimitList = Arrays.asList(
                new TaxiCar(10, 110, BodyType.HATCHBACK, EngineType.DIESEL, 1000, 2),
                new TaxiCar(7, 120, BodyType.SEDAN, EngineType.ELECTRIC, 1200, 2)
        );
        Assert.assertEquals(taxiCarsBySpeedLimitList, taxiCompany.getTaxiCarListBySpeedRange(110, 120));
    }
}