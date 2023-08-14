package org.example;

import org.example.cars.Cars;
import org.example.cars.CarsDirector;
import org.example.cars.SportCarBuilder;
import org.example.cars.TruckBuilder;

public class App
{
    public static void main( String[] args )
    {
        TruckBuilder truckBuilder = new TruckBuilder();
        SportCarBuilder sportCarBuilder = new SportCarBuilder();

        CarsDirector sportCarsDirector = new CarsDirector(sportCarBuilder);
        sportCarsDirector.buildCars();
        Cars sportCars = sportCarsDirector.getCars();

        CarsDirector truckCarsDirector = new CarsDirector(truckBuilder);
        truckCarsDirector.buildCars();
        Cars truckCars = truckCarsDirector.getCars();


        System.out.println(sportCars);
        System.out.println(truckCars);



    }
}
