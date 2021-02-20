package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.StringManipulator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Ot", "A", "b",})
    public void shouldValidIfTooShort(String input) {
        assertFalse(validator.validateUsername(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldValidIfEmptyOrNull(String input) {
        assertFalse(validator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Otto!Piotr", "Otto.Piotr?", "/OttoPiotr"})
    public void shouldValidIfNotCorrectData(String input) {
        assertFalse(validator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Otto_Piotr", "Otto-Piotr", "-Otto.Piotr"})
    public void shouldValidIfCorrectData(String input) {
        assertTrue(validator.validateUsername(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldValidIfEmailNullOrEmpty(String input) {
        assertFalse(validator.validateEmail(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Otto?Piotr@gmail.com", "piotr@domena.subdomenapl", "@dot.it", " @dot.it", "otto@dot."})
    public void shouldValidIfNotCorrectEmailData(String input) {
        assertFalse(validator.validateEmail(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"OttoPiotr43@gmail.com", "piotr@domena.com.pl", "Otto-P@dot.it", "Otto.P@dot.i"})
    public void shouldValidIfCorrectEmailData(String input) {
        assertTrue(validator.validateEmail(input));
    }

}