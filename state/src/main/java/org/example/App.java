package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        OneArmedBandit oneArmedBandit = new OneArmedBandit();

        oneArmedBandit.insertTheCoin();
        oneArmedBandit.currentState();
        oneArmedBandit.pushTheLever();
        oneArmedBandit.currentState();
        oneArmedBandit.collectTheWinnings();
        oneArmedBandit.currentState();

    }
}
