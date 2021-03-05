package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldDeliveryServiceReturnFalseWhenTooHeavy() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean weightOK = bean.deliverPackage("Hill Street 11, New York", 30.1);
        Assertions.assertFalse(weightOK);
    }

    @Test
    public void shouldDeliveryServiceReturnTrueWhenNotTooHeavy() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean weightOK = bean.deliverPackage("Hill Street 11, New York", 29);
        Assertions.assertTrue(weightOK);
    }

    @Test
    public void shouldNotificationServiceReturnCorrectMessageWhenTooHeavy() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.fail("Hill Street 11, New York");
        Assertions.assertNotNull(message);
        Assertions.assertEquals("InPost: Package not delivered to: Hill Street 11, New York", message);
    }

    @Test
    public void shouldNotificationServiceReturnCorrectMessageWhenNotTooHeavy() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.success("Hill Street 11, New York");
        Assertions.assertNotNull(message);
        Assertions.assertEquals("InPost: Package delivered to: Hill Street 11, New York", message);
    }

    @Test
    public void shouldShippingCenterReturnCorrectMessageWhenTooHeavy() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Hill Street 11, New York", 30.1);
        Assertions.assertNotNull(message);
        Assertions.assertEquals("InPost: Package not delivered to: Hill Street 11, New York", message);
    }

    @Test
    public void shouldShippingCenterReturnCorrectMessageNotTooHeavy() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Hill Street 11, New York", 30);
        Assertions.assertNotNull(message);
        Assertions.assertEquals("InPost: Package delivered to: Hill Street 11, New York", message);
    }

}