package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.Animal;
import com.kodilla.spring.basic.spring_configuration.Cat;
import com.kodilla.spring.basic.spring_configuration.Dog;
import com.kodilla.spring.basic.spring_configuration.Duck;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarSettlement {
    private static String localSeason;
    private static boolean localNightTime;
    // public static String season = "lato";
    // public static boolean nightTime = false;

    public static void getSeasonAndTime(String season, boolean nightTime) {
        localSeason = season;
        localNightTime = nightTime;
    }

    @Bean
    public Car seasonCar() {
        Car car;
        boolean lightsOn = localNightTime;

        if (localSeason.equals("lato")) {
             car = new Cabrio();
             if (lightsOn) {
                 car.headlightsTurnedOn();
             }
        } else if (localSeason.equals("zima")) {
            car = new SUV();
            if (lightsOn) {
                car.headlightsTurnedOn();
            }
        } else {
            car = new Sedan();
            if (lightsOn) {
                car.headlightsTurnedOn();
            }
        }
        return car;
    }

}
