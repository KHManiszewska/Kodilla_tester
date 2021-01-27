package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class Opel implements Car {

    int speed = 0;
    int increase = 5;
    int decrease = 5;

    public Opel() {
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
