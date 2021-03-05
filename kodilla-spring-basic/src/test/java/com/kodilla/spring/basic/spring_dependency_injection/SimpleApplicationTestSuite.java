package com.kodilla.spring.basic.spring_dependency_injection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class SimpleApplicationTestSuite {

    @Test
    public void shouldReturnSkypeCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        MessageService bean = context.getBean(MessageService.class);
        String message = bean.send("Test", "Any receiver");
        Assertions.assertNotNull(message);
        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
    }

    @Test
    public void shouldReturnFacebookCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        MessageService bean = context.getBean(MessageService.class);
        String message = bean.send("Test", "Any receiver");
        Assertions.assertNotNull(message);
        Assertions.assertEquals("Sending [Test] to: Any receiver using Facebook", message);
    }

    @Test
    public void shouldProcessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SimpleApplication bean = context.getBean(SimpleApplication.class);
        String message = bean.processMessage("Test", "Any receiver");
        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
    }
}