@wip
Feature: Navigation Menu

  Background:
  Given the user is on the login page
    When the user logged in as "salesManager"

  Scenario: Navigating Fleet --> Vehicles
    And the user navigates to "Fleet", "Vehicles"
    Then the title should be "Car - Entities - System - Car - Entities - System"

  Scenario: Navigating Fleet --> Marketing
    And the user navigates to "Marketing", "Campaigns"
    Then the title should be "All - Campaigns - Marketing"