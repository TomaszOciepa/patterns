package org.example;

import org.example.activity.Animal;
import org.example.activity.Person;
import org.example.activity.Shipment;
import org.example.activity.Transportable;
import org.example.visitor.NameTransportVisitor;
import org.example.visitor.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "23432", false);

        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);
        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportableList.forEach(transport -> transport.accept(priceTransportVisitor));

        System.out.println("-----------------------");

        transportableList.forEach(transport -> transport.accept(nameTransportVisitor));
    }
}
