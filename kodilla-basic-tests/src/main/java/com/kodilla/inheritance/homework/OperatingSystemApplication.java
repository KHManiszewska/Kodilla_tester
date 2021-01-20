package com.kodilla.inheritance.homework;


public class OperatingSystemApplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2010);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        operatingSystem.displayYear();

        MacOperatingSystem macOperatingSystem = new MacOperatingSystem(2017);
        macOperatingSystem.turnOn();
        macOperatingSystem.turnOff();
        macOperatingSystem.displayYear();

        WindowsOperatingSystem windowsOperatingSystem = new WindowsOperatingSystem(2005);
        windowsOperatingSystem.turnOn();
        windowsOperatingSystem.turnOff();
        windowsOperatingSystem.displayYear();
    }
}
