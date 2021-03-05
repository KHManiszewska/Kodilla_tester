package com.kodilla.spring.basic.dependency_injection.homework;

public class InPostNotificationService implements NotificationService{

    @Override
    public String success(String address) {
        System.out.println("InPost: Package delivered to: " + address);
        return address;
    }

    @Override
    public void fail(String address) {
        System.out.println("InPost: Package not delivered to: " + address);
    }
}
