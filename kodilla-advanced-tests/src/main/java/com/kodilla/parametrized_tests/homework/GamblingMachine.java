package com.kodilla.parametrized_tests.homework;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {

    public static int howManyWins(Set<Integer> givenNumbers, Set<Integer> drawNumbers) throws InvalidNumbersException {
        // validateNumbers(userNumbers);
        // Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : givenNumbers) {
            if (drawNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }


    public static boolean validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (numbers.size() != 6) {
            throw new InvalidNumbersException("Wrong numbers provided");
        }

        if (numbers.stream().anyMatch(number -> number < 1 || number > 49)) {
            throw new InvalidNumbersException("Wrong numbers provided");
        }
        return true;
    }

    public static Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }
}
