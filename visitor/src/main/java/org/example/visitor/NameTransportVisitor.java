package org.example.visitor;

import org.example.activity.Animal;
import org.example.activity.Person;
import org.example.activity.Shipment;

public class NameTransportVisitor implements TransportVisitor{
    @Override
    public void visit(Animal animal) {
        System.out.println("Typ zwierzęcia: "+animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Osoba: "+person.getFirstName()+" "+person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Oznaczenie przesyłki: "+shipment.getPrefix()+"-"+shipment.getSerialNumber());
    }
}
