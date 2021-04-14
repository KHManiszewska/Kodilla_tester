Feature: Cash Withdrawal

Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <deposit> in my wallet
    When I requested $30
    Then The <amount> should be dispensed

    Examples:
     | deposit | amount |
     | $1200 | "30" |
     | $30 | "30" |
     | $10 | "0" |
     | $0 | "0" |

  Scenario: Successful withdrawal from a wallet
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170