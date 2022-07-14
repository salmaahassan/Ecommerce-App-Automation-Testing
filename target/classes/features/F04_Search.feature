@smoke
Feature: F04_Search | user could search for any product
 Scenario Outline: user could search using product name
   When user enters "<product>" in the search field
   And  user enters search button
   Then user should be directed to another url
   And  user could find relative results for "<product>"

   Examples:
      |product|
      |book|
      |laptop|
      |nike|

  Scenario Outline: user could search using sku name
    When user enters "<sku>" in the search field
    And  user enters search button
    And  user clicks on the product in search result
    Then "<sku>" is displayed


    Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|