package com.kodilla.collections.interfaces.homework;

public class Porche implements Car{
    int speed = 0;
    int increase = 20;
    int decrease = 15;

    public Porche() {
        this.speed = speed;
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + increase;
    }

    @Override
    public void decreaseSpeed() {
        if (speed >= decrease) {
            speed = speed - decrease;
        }
        else {speed = 0;}
    }
}
