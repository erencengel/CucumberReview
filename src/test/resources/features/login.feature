@login
Feature: User should able to login to Vytrack App
  Scenario: Driver should be able to login
    Given the user is on the login page
    When the user enters the driver information
    Then the user should able to login

  Scenario: User should be able to login
    Given the user is on the login page
    When the user enters the "salesmanager101" and "UserUser123"
    Then the user should able to login
   @store
  Scenario: login as a user
    Given the user is on the login page
    When the user logged in as "storeManager"
    Then the user should able to login