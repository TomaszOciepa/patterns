package org.example;

import org.example.cars.*;

public class ContinentalFactory  implements Factory{

    SteeringWheelPosition position = SteeringWheelPosition.LEFT;
    @Override
    public Car createBMW(BmwModel model) {
        switch (model){
            case X5:
                return new Bmw("BMW", "X5", 4000, "ON", "2021", position);
            case E60:
                return new Bmw("BMW", "E60", 3000, "PB", "2022", position);
            default:
                throw new IllegalArgumentException("unknown model");
        }
    }

    @Override
    public Car createFord(FordModel model) {
        switch (model){
            case CMAX:
                return new Ford("Ford", "CMax", 2500, "electric", "2022", position);
            case FOCUS:
                return new Ford("Ford", "Focus", 3000, "PB", "2022", position);
            default:
                throw new IllegalArgumentException("unknown model");
        }
    }
}
