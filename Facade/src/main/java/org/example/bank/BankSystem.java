package org.example.bank;

 class BankSystem {

    void transferMoney(){
        System.out.println("Przelew pienidzy");
    }


    boolean validatePin(){
        System.out.println("Sprawdzanie nr PIN-u....OK.");
        return true;
    }

    boolean validateTransaction(){
        System.out.println("Sprawdzam transakcjie.....OK");
        return true;
    }

    void getTransactionHistory(){
        System.out.println("Historia transakcji");
    }



}
