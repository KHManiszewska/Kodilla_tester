Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <deposit> in my wallet
    When I requested $30
    Then The <amount> should be dispensed

    Examples:
      | deposit | amount |
      | $200 | "30" |
      | $30 | "30" |
      | $10 | "0" |
      | $0 | "0" |