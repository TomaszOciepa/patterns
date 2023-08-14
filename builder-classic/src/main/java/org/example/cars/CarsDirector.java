package org.example.cars;

public class CarsDirector {

    private CarsBuilder carsBuilder;

    public CarsDirector(CarsBuilder carsBuilder) {
        this.carsBuilder = carsBuilder;
    }

    public void buildCars(){
        carsBuilder.setMark();
        carsBuilder.setType();
        carsBuilder.setColor();
        carsBuilder.setEngine();
        carsBuilder.setHorses();
        carsBuilder.setTypeOfFuel();
    }

    public Cars getCars(){
        return this.carsBuilder.getCars();
    }
}
