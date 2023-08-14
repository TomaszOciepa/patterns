package org.example;

import org.example.notification.InternetNews;
import org.example.notification.RadioNews;
import org.example.notification.TvNews;
import org.example.weather.WeatherForecast;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Observer!" );

        WeatherForecast weatherForecast = new WeatherForecast(28, 1003);
        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);

        weatherForecast.notifyObservers();

        System.out.println("=================Nowa prognoza tylko dla radia++++++++++++++++");

        weatherForecast.unregisterObserver(internetNews);
        weatherForecast.unregisterObserver(tvNews);

        weatherForecast.updateForecast(18, 1007);
        weatherForecast.notifyObservers();


    }
}
