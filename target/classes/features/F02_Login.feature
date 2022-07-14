@smoke
Feature: F02_Login | users could use login functionality to use their accounts

Scenario: user could login with valid email and password
    Given user go to login page
    When  user login with valid "hassansalma19635@yahoo.com" and "P@ssw0rd"
    And   user press on login button
    Then  user could login to the system

Scenario: user could login with invalid email and password
    Given user go to login page
    When  user login with invalid "test@example.com" and "ssw0rd"
    And   user press on login button
    Then  user could not login to the system