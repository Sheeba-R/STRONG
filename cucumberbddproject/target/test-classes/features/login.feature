
Feature: Login functionality

  Scenario: Valid login
    Given User is on the login page
    When User enters valid username and password
    Then User should be logged in successfully

  Scenario: Invalid login
    Given User is on the login page
    When User enters invalid username and password
    Then User should see login error message
