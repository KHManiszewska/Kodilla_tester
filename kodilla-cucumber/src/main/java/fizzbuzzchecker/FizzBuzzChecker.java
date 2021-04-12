package fizzbuzzchecker;

import java.time.MonthDay;

public class FizzBuzzChecker {

        public String checkIfFizzBuzz(int number) {
            if (number%3==0 && number%5==0) {
                return "FizzBuzz";
            }
            if (number%3==0) {
                return "Fizz";
            }
            if (number%5==0) {
                return "Buzz";
            }
            return "None";
        }
}

