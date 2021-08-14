@calculator
Feature: Calculator app ...
#  Scenario: Adding two numbers
#    Given I have calculator app open
#    When I add 5 to 7
#    Then I should get 12
#  Scenario: Adding two numbers 10 with 8
#    Given I have calculator app open
#    When I add 10 to 8
#    Then I should get 18

      #what if I wanted to add 5 more pairs of numbers
      #should we add 5 more scenario with same exact steps?
      #is there better way

  Scenario Outline: Adding two numbers <num1> with <num2> and <expect expectedResult>
    Given I have calculator app open
    When I add <num1> to <num2>
    Then I should get <expectedResult>

    Examples:
      | num1 | num2 | expectedResult |
      | 1    | 2    | 3              |
      | 11   | 2    | 15             |
      | 9    | 2    | 11             |
      | 12   | 21   | 33             |
      | 2    | 2    | 4              |
