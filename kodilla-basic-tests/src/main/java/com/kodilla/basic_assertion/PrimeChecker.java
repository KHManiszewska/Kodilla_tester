package com.kodilla.basic_assertion;

public class PrimeChecker {
    private int count;

    public boolean isPrime(int number) {

        boolean primeIs = true;
        if (number < 2) {
            primeIs = false;
        } else {
            if (number > 2) {

                for (int i = 1; i < number; i++) {
                    int termI = 2;
                    if (number % termI == 0) {
                        primeIs = false;
                    }
                    termI++;
                }
            }
        }
        return primeIs;
    }
    public int getCount() {
        return count;
    }

    public void incrementCount() {
        this.count++;
    }
}
