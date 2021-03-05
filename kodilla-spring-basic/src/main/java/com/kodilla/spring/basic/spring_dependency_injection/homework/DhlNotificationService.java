package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class DhlNotificationService implements NotificationService {
String message;

    @Override
    public String success(String address) {
        message = "DHL: Package delivered to: " + address;
        System.out.println(message);
        return message;
    }

    @Override
    public String fail(String address) {
        message = "DHL: Package not delivered to: " + address;
        System.out.println(message);
        return message;
    }
}
