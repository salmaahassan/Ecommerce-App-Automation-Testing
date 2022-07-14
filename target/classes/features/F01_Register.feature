@smoke

Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When  user select gender type "Female"
    And   user enter first name "automation" and last name "tester"
    And   user enter date of birth "7"/"2"/"1998"
    And   user enter email "hassansalma19635@yahoo.com" field
    And   user fills Password fields "P@ssw0rd" "P@ssw0rd"
    And   user clicks on register button
    Then  success message is displayed



