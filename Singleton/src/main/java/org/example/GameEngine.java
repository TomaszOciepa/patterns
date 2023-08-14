package org.example;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class GameEngine implements Serializable {

    int score;
    private static GameEngine instance = new GameEngine();

    private GameEngine() {
    }

    public void play() {
        score = 0;
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        System.out.println("Witaj w odgadywance :)");
        while (x < 10) {
            x++;
            System.out.println("Komputer losuje liczbę....");
            int digitComputer = generator.nextInt(10);
            System.out.println("Odgadnij liczbę: ");
            int digitPlayer = scanner.nextInt();

            if(digitComputer == digitPlayer){
                score++;
                System.out.println("Brawo, otrzymałeś punkt");
            }else {
                System.out.println("KOmputer wylosował: "+digitComputer);
                System.out.println("Twoja liczba: "+digitPlayer);
            }

        }
    }

    public static GameEngine getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    public int getScore() {
        return score;
    }
}
