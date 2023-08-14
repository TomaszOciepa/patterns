package org.example;

public class Antek extends Child{

    String name = "Antek";
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)){
            System.out.println(name + " zdjął słoiki z półki");
        }else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
