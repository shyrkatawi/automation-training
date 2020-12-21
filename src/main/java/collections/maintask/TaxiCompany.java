package collections.maintask;

import collections.maintask.cars.TaxiCar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 10. Таксопарк.
 * Определить иерархию легковых автомобилей.
 * Создать таксопарк.
 * Подсчитать стоимость автопарка.
 * Провести сортировку автомобилей парка по расходу топлива.
 * Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости
 */
public class TaxiCompany {
    List<TaxiCar> taxiCarList;

    public TaxiCompany(List<TaxiCar> taxiCarList) {
        this.taxiCarList = taxiCarList;
    }

    public List<TaxiCar> getTaxiCarList() {
        return taxiCarList;
    }

    public int calculateTotalCostOfCompany() {
        int cost = 0;
        for (TaxiCar taxiCar : taxiCarList) {
            cost += taxiCar.getPrice();
        }
        return cost;
    }

    public void sortTaxiCarsByFuelConsumption() {
        taxiCarList.sort(Comparator.comparingInt(TaxiCar::getFuelConsumption));
    }

    public List<TaxiCar> getTaxiCarListBySpeedRange(int min, int max) {
        List<TaxiCar> taxiCarsBySpeedRange = new ArrayList<>();
        for (TaxiCar taxiCar : taxiCarList) {
            int speed = taxiCar.getSpeed();
            if (speed >= min && speed <= max) {
                taxiCarsBySpeedRange.add(taxiCar);
            }
        }
        return taxiCarsBySpeedRange;
    }

    public void printTaxiCarsInformation(){
        for (TaxiCar taxiCar : taxiCarList) {
            System.out.println(taxiCar);
        }
        System.out.println();
    }
}
