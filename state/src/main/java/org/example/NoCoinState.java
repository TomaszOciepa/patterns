package org.example;


public class NoCoinState implements State{
    @Override
    public void insertTheCoin(OneArmedBandit oneArmedBandit) {
        System.out.println("Wrzucono monetę.");
        oneArmedBandit.state = new CoinInsertedState();
    }

    @Override
    public void pullTheLevers(OneArmedBandit oneArmedBandit) {
        System.out.println("Wrzuć monetę by zagrać.");
    }

    @Override
    public void takeTheWinnings(OneArmedBandit oneArmedBandit) {
        System.out.println("Wrzuć monetę by dać sobie szansę na wygraną.");

    }

    @Override
    public void writeTheCurrentState(OneArmedBandit oneArmedBandit) {
        System.out.println("Aktualny stan - BRAK MONETY");

    }
}
