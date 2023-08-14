package org.example.cars;

import org.example.cars.Cars;

public interface CarsBuilder {

    void setMark();

    void setType();

    void setColor();

    void setEngine();

    void setHorses();

    void setTypeOfFuel();

    Cars getCars();
}
