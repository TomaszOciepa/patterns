package org.example;

public class OperatingSystemCaretaker {
    public OperatingSystemMemento memento;

    public void addMemento(OperatingSystemMemento operatingSystemMemento) {
        memento = operatingSystemMemento;
        System.out.println("Zapisano backup nr: " + memento.getBackupNumber() + " z datą: "
                + memento.getBackupDate());
    }

    public OperatingSystemMemento getMemento() {
        System.out.println("Wczytano backup nr: " + this.memento.getBackupNumber() + " z datą: "
                + this.memento.getBackupDate());
        return this.memento;
    }
}
