package org.example;

public class Ania extends Child {

    String name = "Ania";

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println(name + " zdjeła słoiki z półki");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
