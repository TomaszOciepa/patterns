package org.example.cars;

public class TruckBuilder implements CarsBuilder {

    private Cars cars;

    public TruckBuilder() {
        this.cars = new Cars();
    }

    @Override
    public void setMark() {
        this.cars.setMark("SCANIA");
    }

    @Override
    public void setType() {
        this.cars.setTyp("TRUCK");
    }

    @Override
    public void setColor() {
        this.cars.setColor("WHITE");
    }

    @Override
    public void setEngine() {
        this.cars.setEngine(10000);
    }

    @Override
    public void setHorses() {
        this.cars.setHorses(500);
    }

    @Override
    public void setTypeOfFuel() {
        this.cars.setTypOfFuel("ON");
    }

    @Override
    public Cars getCars() {
        return cars;
    }
}
