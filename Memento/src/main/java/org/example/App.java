package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystem.createBackup();
        operatingSystemCaretaker.addMemento(operatingSystem.save());
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystem.createBackup();
        operatingSystem.load(operatingSystemCaretaker.getMemento());
    }
}
