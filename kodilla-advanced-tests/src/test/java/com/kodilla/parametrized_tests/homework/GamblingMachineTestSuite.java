package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


class GamblingMachineTestSuite {
    Set<Integer> computerNumbers1 = GamblingMachine.generateComputerNumbers();
    Set<Integer> computerNumbers2 = GamblingMachine.generateComputerNumbers();
    Set<Integer> computerNumbers3 = GamblingMachine.generateComputerNumbers();

    @Test
    void isComputerNumbersLengthOK() {
        System.out.println(computerNumbers1);
        System.out.println(computerNumbers2);
        System.out.println(computerNumbers3);
        assertEquals(6, computerNumbers1.toArray().length);
        assertEquals(6, computerNumbers2.toArray().length);
        assertEquals(6, computerNumbers3.toArray().length);
    }

    @Test
    void areComputerNumbersValid() throws InvalidNumbersException{
        boolean isValid = true;
        isValid = GamblingMachine.validateNumbers(computerNumbers1);
        isValid = GamblingMachine.validateNumbers(computerNumbers2);
        isValid = GamblingMachine.validateNumbers(computerNumbers3);
        assertTrue(isValid);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/giventValidNumbers.csv")
    void areGivenSixNumbersValid(int number1, int number2, int number3, int number4, int number5, int number6) throws InvalidNumbersException{
        Set<Integer> givenNumbers = new HashSet<>();
        givenNumbers.add(number1);
        givenNumbers.add(number2);
        givenNumbers.add(number3);
        givenNumbers.add(number4);
        givenNumbers.add(number5);
        givenNumbers.add(number6);
        boolean isValid = true;
        System.out.println(givenNumbers);
        isValid = GamblingMachine.validateNumbers(givenNumbers);
        assertTrue(isValid);
    }

    @ParameterizedTest
            // (expected = InvalidNumbersException.class)
    @CsvFileSource(resources = "/givenNotValidNumbers.csv")
    void areGivenSixNumbersNotValid(int number1, int number2, int number3, int number4, int number5, int number6) throws InvalidNumbersException{
        Set<Integer> givenNumbers = new HashSet<>();
        givenNumbers.add(number1);
        givenNumbers.add(number2);
        givenNumbers.add(number3);
        givenNumbers.add(number4);
        givenNumbers.add(number5);
        givenNumbers.add(number6);
        boolean isValid = true;
        System.out.println(givenNumbers);
        isValid = GamblingMachine.validateNumbers(givenNumbers);
        assertFalse(isValid);
    }

    @Test
            // (expected = InvalidNumbersException.class)
    void areGivenNoSixNumbersValid() throws InvalidNumbersException{
        boolean isValid = true;
        Set<Integer> givenNumbers = new HashSet<>();
        givenNumbers.add(4);
        // givenNumbers.add(12);
        givenNumbers.add(27);
        givenNumbers.add(64);
        givenNumbers.add(32);
        // givenNumbers.add(-1);
        isValid = GamblingMachine.validateNumbers(givenNumbers);
        assertFalse(isValid);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/howManyWinsGivenNumbers.csv")
    void howManyWins(int number1, int number2, int number3, int number4, int number5, int number6, int andTheWinnerIs) throws InvalidNumbersException{
        Set<Integer> drawNumbers = new HashSet<>();
        drawNumbers.add(4);
        drawNumbers.add(12);
        drawNumbers.add(27);
        drawNumbers.add(24);
        drawNumbers.add(32);
        drawNumbers.add(8);
        Set<Integer> givenNumbers = new HashSet<>();
        givenNumbers.add(number1);
        givenNumbers.add(number2);
        givenNumbers.add(number3);
        givenNumbers.add(number4);
        givenNumbers.add(number5);
        givenNumbers.add(number6);
        int drawResult = GamblingMachine.howManyWins(givenNumbers, drawNumbers);
        if (drawResult == 6) System.out.println("BINGO!!!");
        assertEquals(andTheWinnerIs, drawResult);
    }
}