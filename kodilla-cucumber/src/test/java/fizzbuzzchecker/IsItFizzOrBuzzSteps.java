package fizzbuzzchecker;

import org.junit.Assert;
import io.cucumber.java8.En;

public class IsItFizzOrBuzzSteps implements En {
    Integer number;
    private String answer;

    public IsItFizzOrBuzzSteps() {
        Given("number is 69", () -> {
            this.number = 69;
        });
        Given("number is 25", () -> {
            this.number = 25;
        });
        Given("number is 15", () -> {
            this.number = 15;
        });
        Given("number is 11", () -> {
            this.number = 11;
        });
        Given("number is 27", () -> {
            this.number = 27;
        });
        Given("number is 65", () -> {
            this.number = 65;
        });
        Given("number is 300", () -> {
            this.number = 300;
        });
        Given("number is 112", () -> {
            this.number = 112;
        });

        When("I ask whether it's Fizz or Buzz or FizzBuzz", () -> {
            FizzBuzzChecker fizzbuzzChecker = new FizzBuzzChecker();
            this.answer = fizzbuzzChecker.checkIfFizzBuzz(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
