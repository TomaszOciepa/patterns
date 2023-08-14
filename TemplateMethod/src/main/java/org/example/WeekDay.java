package org.example;

public abstract class WeekDay {

    public final void everyDayIsTheSame(TypeOfTransport typeOfTransport) {
        wakeUp();
        getReady();
        int time = goToWork(typeOfTransport);
        summary(time);
        work();
        goHome();
    }

    private void goHome() {
        System.out.println("Powrót do domu.");
    }

    protected abstract void work();

    private void summary(int time) {
        System.out.println("Trasa do pracy zajeła: " + time);
    }

    protected abstract int goToWork(TypeOfTransport typeOfTransport);

    private void getReady() {
        System.out.println("Przygotowane do wyjścia.");
    }

    private void wakeUp() {
        System.out.println("Pobudka!!!!!! ");
    }
}
