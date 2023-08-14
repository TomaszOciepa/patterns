package org.example;

public class App 
{
    public static void main( String[] args )
    {

        FlightLeg leg = new FlightLeg.FlightLegBuilder("New York","London")
                .price(30)
                .build();
        System.out.println(leg);
        leg.setDelayed(true);
        System.out.println(leg);
    }
}
