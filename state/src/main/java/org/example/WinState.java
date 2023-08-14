package org.example;

public class WinState implements State{
    @Override
    public void insertTheCoin(OneArmedBandit oneArmedBandit) {
        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    @Override
    public void pullTheLevers(OneArmedBandit oneArmedBandit) {
        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    @Override
    public void takeTheWinnings(OneArmedBandit oneArmedBandit) {
        System.out.println("Zabrano monety. Gratulacje.");
        oneArmedBandit.state = new NoCoinState();
    }

    @Override
    public void writeTheCurrentState(OneArmedBandit oneArmedBandit) {
        System.out.println("Aktualny stan - WYGRANA");

    }
}
