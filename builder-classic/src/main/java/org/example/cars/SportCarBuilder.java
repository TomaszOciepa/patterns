package org.example.cars;

public class SportCarBuilder implements CarsBuilder {

    private Cars cars;

    public SportCarBuilder() {
        this.cars = new Cars();
    }

    @Override
    public void setMark() {
        this.cars.setMark("Subaru");
    }

    @Override
    public void setType() {
        this.cars.setTyp("BRZ");
    }

    @Override
    public void setColor() {
        this.cars.setColor("BLUE");
    }

    @Override
    public void setEngine() {
        this.cars.setEngine(2500);
    }

    @Override
    public void setHorses() {
        this.cars.setHorses(400);
    }

    @Override
    public void setTypeOfFuel() {
        this.cars.setTypOfFuel("PB");
    }

    @Override
    public Cars getCars() {
        return this.cars;
    }
}
