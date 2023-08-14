package org.example.notification;

import org.example.weather.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);

}
