package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SimpleApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldAddCorrect() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.add(13, -13);
        assertEquals(0, result, 0.01);
    }

    @Test
    public void shouldSubtractCorrect() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.subtract(13, -13);
        assertEquals(26, result, 0.01);
    }

    @Test
    public void shouldMultiplyCorrect() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(13, -1);
        assertEquals(-13, result, 0.01);
    }

    @Test
    public void shouldDivideCorrect() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divide(13, -1);
        assertEquals(-13, result, 0.01);
    }
}