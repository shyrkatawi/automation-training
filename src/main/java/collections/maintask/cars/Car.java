package collections.maintask.cars;

import collections.maintask.types.BodyType;
import collections.maintask.types.EngineType;

import java.util.Objects;

public abstract class Car {
    private int fuelConsumption;
    private int speed;
    private BodyType bodyType;
    private EngineType engineType;
    private int price;

    public Car(int fuelConsumption, int speed, BodyType bodyType, EngineType engineType, int price) {
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuelConsumption == car.fuelConsumption &&
                speed == car.speed &&
                price == car.price &&
                bodyType == car.bodyType &&
                engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelConsumption, speed, bodyType, engineType, price);
    }

    @Override
    public String toString() {
        return  "fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                ", bodyType=" + bodyType +
                ", engineType=" + engineType +
                ", price=" + price;
    }
}
