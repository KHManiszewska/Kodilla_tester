package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InPostNotificationService implements NotificationService {
    String message;

    @Override
    public String success(String address) {
        message = "InPost: Package delivered to: " + address;
        System.out.println(message);
        return message;
    }

    @Override
    public String fail(String address) {
        message = "InPost: Package not delivered to: " + address;
        System.out.println(message);
        return message;
    }
}
