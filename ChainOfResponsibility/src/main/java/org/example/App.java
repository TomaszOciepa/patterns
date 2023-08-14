package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);
        Child ania = new Ania();
        Child tomek = new Tomek();
        Child antek = new Antek();

        tomek.setTallerChild(ania);
        ania.setTallerChild(antek);

        tomek.processRequest(motherRequest);

    }
}
