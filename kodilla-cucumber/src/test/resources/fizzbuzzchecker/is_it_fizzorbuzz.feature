Feature: Is it Fizz or Buzz?
  Crazy Numbers

  Scenario Outline: Number is or isn't Fizz or Buzz
    Given number is <number>
    When I ask whether it's Fizz or Buzz or FizzBuzz
    Then I should be told <answer>

    Examples:
      | number | answer |
      | 69 | "Fizz" |
      | 25 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 11 | "None" |
      | 27 | "Fizz" |
      | 65 | "Buzz" |
      | 300 | "FizzBuzz" |
      | 112 | "None" |