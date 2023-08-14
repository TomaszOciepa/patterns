package org.example;


import org.example.bank.AtmMachineFacade;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();

        atmMachineFacade.withdrawMoney();
    }
}
