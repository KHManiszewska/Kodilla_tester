package com.kodilla.inheritance.homework;

public class WindowsOperatingSystem extends OperatingSystem {
    private int year;

    public WindowsOperatingSystem(int year) {
        super(year);
        this.year = year;
    }
    @Override
    public void turnOn() {
        System.out.println("Windows Operating system "+year+" on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows Operating system "+year+" off...");
    }
}
