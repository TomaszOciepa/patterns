package org.example;

public class MyDay extends WeekDay{

    @Override
    protected void work() {
        System.out.println("I driving big Truck in Norway.");
    }

    @Override
    protected int goToWork(TypeOfTransport typeOfTransport) {
        switch (typeOfTransport){
            case CAR:
                return 15;
            case BIKE:
                return 30;
            case TRAM:
                return 25;
            default:
                return 40;
        }
    }
}
