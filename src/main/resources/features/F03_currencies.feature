@smoke
Feature: F03_currencies | user could change the currency
  Scenario: user could change the currency from the drop list in homepage
    When    user changes the currency to euro
    Then    Euro Symbol "€" is shown on the 4 products displayed in Home page
