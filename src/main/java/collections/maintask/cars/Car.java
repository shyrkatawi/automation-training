package java_collections.maintask.cars;

import java_collections.maintask.types.BodyType;
import java_collections.maintask.types.EngineType;

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
    public String toString() {
        return  "fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                ", bodyType=" + bodyType +
                ", engineType=" + engineType +
                ", price=" + price;
    }
}
