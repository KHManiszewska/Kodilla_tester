package com.kodilla.spring.basic.dependency_injection.homework;

public class DhlNotificationService implements NotificationService{

    @Override
    public String success(String address) {
        System.out.println("Dhl: Package delivered to: " + address);
        return address;
    }

    @Override
    public void fail(String address) {
        System.out.println("Dhl: Package not delivered to: " + address);
    }
}
