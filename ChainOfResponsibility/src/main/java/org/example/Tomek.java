package org.example;

public class Tomek extends Child{

    String name = "Tomek";
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)){
            System.out.println(name + " zdjął słoiki z półki");
        }else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
