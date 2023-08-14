package org.example;

public interface State {
   void insertTheCoin(OneArmedBandit oneArmedBandit);
   void pullTheLevers(OneArmedBandit oneArmedBandit);
   void takeTheWinnings(OneArmedBandit oneArmedBandit);
   void writeTheCurrentState(OneArmedBandit oneArmedBandit);
}
