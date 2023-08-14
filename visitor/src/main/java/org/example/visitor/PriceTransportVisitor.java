package org.example.visitor;

import org.example.activity.Animal;
import org.example.activity.Person;
import org.example.activity.Shipment;

public class PriceTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Cena za km dla zwierzaka to: " + animal.getWeight() * 0.2);
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if (person.isRegularCustomer()) {
            price = price / 2;
        }

        System.out.println("Cena za km dla osoby to: "+price+" PLN");
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if (shipment.isLarge()){
            price = price*3;
        }

        System.out.println("Cena za km dla przesyłki to: "+price+" PLN");
    }
}
