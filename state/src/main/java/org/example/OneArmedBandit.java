package org.example;

public class OneArmedBandit {
    State state;

    public OneArmedBandit() {
        this.state = new NoCoinState();
    }

    public void insertTheCoin() {
        state.insertTheCoin(this);
    }

    public void pushTheLever() {
        state.pullTheLevers(this);
    }

    public void collectTheWinnings() {
        state.takeTheWinnings(this);
    }

    public void currentState() {
        state.writeTheCurrentState(this);
    }

}
