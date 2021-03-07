package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CarSettlementTestSuite {

    @Test
    public void shouldCreateCabrioWhenSummer() {
        //Given
        CarSettlement.season = "lato";
        CarSettlement.nightTime = true;
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("seasonCar");
        //When
        String whichCar = car.getCarType();
        //Then
        Assertions.assertEquals("Cabrio", whichCar);
    }

    @Test
    public void shouldCreateSUVWhenWinter() {
        //Given
        CarSettlement.season = "zima";
        CarSettlement.nightTime = true;
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("seasonCar");
        //When
        String whichCar = car.getCarType();
        //Then
        Assertions.assertEquals("SUV", whichCar);
    }

    @Test
    public void shouldCreateSedanWhenSpringOrAutumn() {
        //Given
        CarSettlement.season = "wiosna";
        CarSettlement.nightTime = true;
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("seasonCar");
        //When
        String whichCar = car.getCarType();
        //Then
        Assertions.assertEquals("Sedan", whichCar);
    }

    @Test
    public void shouldHeadlightsTurnedOnWhenNightTime() {
        //Given
        CarSettlement.season = "jesien";
        CarSettlement.nightTime = true;
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("seasonCar");
        //When
        String whichCar = car.getCarType();
        //Then
        Assertions.assertEquals("Sedan", whichCar);
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldHeadlightsTurnedOffWhenDayTime() {
        //Given
        CarSettlement.season = "lato";
        CarSettlement.nightTime = false;
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("seasonCar");
        //When
        String whichCar = car.getCarType();
        //Then
        Assertions.assertEquals("Cabrio", whichCar);
        assertFalse(car.hasHeadlightsTurnedOn());
    }
}