package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class personBMISources {
    static String bmi15 = "Very severely underweight";
    static String bmi16 = "Severely underweight";
    static String bmi185 = "Underweight";
    static String bmi25 = "Normal (healthy weight)";
    static String bmi30 = "Overweight";
    static String bmi35 = "Obese Class I (Moderately obese)";
    static String bmi40 = "Obese Class II (Severely obese)";
    static String bmi45 = "Obese Class III (Very severely obese)";
    static String bmi50 = "Obese Class IV (Morbidly Obese)";
    static String bmi60 = "Obese Class V (Super Obese)";
    static String bmiExtremelyMore = "Obese Class VI (Hyper Obese)";


    static Stream<Arguments> providePersonsForTestingGetBMI() {
        return Stream.of(

                Arguments.of(72, 1.67, bmi30),
                Arguments.of(66, 1.63, bmi25),
                Arguments.of(48, 1.7, bmi185),
                Arguments.of(92, 1.73, bmi35),
                Arguments.of(105, 1.6, bmi45),
                Arguments.of(38, 1.6, bmi15),
                Arguments.of(50, 1.82, bmi16),
                Arguments.of(102, 1.64, bmi40),
                Arguments.of(145, 1.77, bmi50),
                Arguments.of(182, 1.64, bmiExtremelyMore),
                Arguments.of(159, 1.64, bmi60)
        );
    }
}

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.personBMISources#providePersonsForTestingGetBMI")
    public void shouldCalculateGetrBMI(double weightInKilogram, double heightInMeters, String expectedBMIMessage) {
        Person person = new Person(heightInMeters, weightInKilogram);
        assertEquals(expectedBMIMessage, person.getBMI());
    }
}