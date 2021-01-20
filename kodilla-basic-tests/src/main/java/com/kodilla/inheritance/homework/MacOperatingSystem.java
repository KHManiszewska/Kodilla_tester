package com.kodilla.inheritance.homework;

public class MacOperatingSystem extends OperatingSystem {
    private int year;

    public MacOperatingSystem(int year) {
        super(year);
        this.year = year;
    }

    @Override
    public void turnOn() {
        System.out.println("Mac Operating system "+year+" on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Mac Operating system "+year+" off...");
    }
}
