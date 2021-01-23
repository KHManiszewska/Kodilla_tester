package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquaring1() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squaringResult = calculator.squaring(a);
        assertEquals(25, squaringResult);
    }

    @Test
    public void testSquaring2() {
        Calculator calculator = new Calculator();
        int a = 0;
        int squaringResult = calculator.squaring(a);
        assertEquals(0, squaringResult);
    }

    @Test
    public void testSquaring3() {
        Calculator calculator = new Calculator();
        int a = -5;
        int squaringResult = calculator.squaring(a);
        assertEquals(25, squaringResult);
    }
}
