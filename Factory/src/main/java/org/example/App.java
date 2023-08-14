package org.example;

import org.example.cars.BmwModel;
import org.example.cars.Car;
import org.example.cars.FordModel;

public class App
{
    public static void main( String[] args )
    {
        ContinentalFactory continentalFactory = new ContinentalFactory();
        Car bmw = continentalFactory.createBMW(BmwModel.X5);

        System.out.println(bmw.getPosition());

        GreatBritanFactory greatBritanFactory = new GreatBritanFactory();
        Car ford = greatBritanFactory.createFord(FordModel.FOCUS);
        System.out.println(ford.getPosition());


    }
}
