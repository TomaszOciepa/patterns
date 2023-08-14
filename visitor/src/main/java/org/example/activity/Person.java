package org.example.activity;

import org.example.visitor.TransportVisitor;

public class Person implements Transportable {

    private String firstName;
    private String lastName;
    private boolean isRegularCustomer;

    public Person(String firstName, String lastName, boolean isRegularCustomer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isRegularCustomer = isRegularCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isRegularCustomer() {
        return isRegularCustomer;
    }
}
