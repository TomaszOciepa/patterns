package org.example;

import org.example.cars.BmwModel;
import org.example.cars.Car;
import org.example.cars.FordModel;

public interface Factory {
  Car createBMW(BmwModel model);
     Car createFord(FordModel model);
}
