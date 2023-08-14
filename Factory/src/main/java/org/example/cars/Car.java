package org.example.cars;

public abstract class Car {

    private String Mark;
    private String model;
    private int engineCapacity;
    private String fuelType;
    private String yearOfProduction;

    private SteeringWheelPosition position;

    public Car(String mark, String model, int engineCapacity, String fuelType, String yearOfProduction, SteeringWheelPosition position) {
        Mark = mark;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
        this.position = position;
    }

    public String getMark() {
        return Mark;
    }

    public String getModel() {
        return model;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public SteeringWheelPosition getPosition() {
        return position;
    }
}
