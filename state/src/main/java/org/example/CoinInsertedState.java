package org.example;

import java.util.Random;

public class CoinInsertedState implements State {

    static final private Random random = new Random();

    @Override
    public void insertTheCoin(OneArmedBandit oneArmedBandit) {
        System.out.println("Moneta znajduję się już w automacie.");
    }

    @Override
    public void pullTheLevers(OneArmedBandit oneArmedBandit) {
        System.out.println("Trwa losowanie...");
        int result = random.nextInt(99);
        if(result<20) {
            System.out.println("Wygrana! Odbierz swoją nagrodę");
            oneArmedBandit.state = new WinState();
        } else {
            System.out.println("Przegrana. Może następnym razem się uda?");
            oneArmedBandit.state = new NoCoinState();
        }
    }

    @Override
    public void takeTheWinnings(OneArmedBandit oneArmedBandit) {
        System.out.println("Pociągnij dźwignie by sprawdzić swoje szczęście.");

    }

    @Override
    public void writeTheCurrentState(OneArmedBandit oneArmedBandit) {
        System.out.println("Aktualny stan - WRZUCONO MONETĘ");
    }
}
