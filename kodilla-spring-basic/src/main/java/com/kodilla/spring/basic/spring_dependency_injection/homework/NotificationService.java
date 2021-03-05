package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

public interface NotificationService {

    String success(String address);

    String fail(String address);
}
