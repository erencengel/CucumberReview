Feature: Contacts page
  @navigation
  Scenario: Menu Options Driver
    Given the user is on the login page
    Given the user logged in as "driver"
    Then the user should see following options
    |Fleet|
    |Customers|
    |Activities|
    |System|

  @navigation1
  Scenario: login as a given user
    Given the user is on the login page
    Given the user logs in using following credentials
      |username||user10|
      |password||UserUser123|
      |firstname||Brenden|
      |lastname||Schneider|
    Then the user should able to login
