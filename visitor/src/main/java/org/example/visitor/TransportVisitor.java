package org.example.visitor;

import org.example.activity.Animal;
import org.example.activity.Person;
import org.example.activity.Shipment;

public interface TransportVisitor {
    void visit(Animal animal);

    void visit(Person person);

    void visit(Shipment shipment);
}
