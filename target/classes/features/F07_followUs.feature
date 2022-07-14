@smoke
Feature: F07_followUs | users could open followUs links

  Scenario: user opens facebook link
  When user clicks on facebook logo
  Then "https://www.facebook.com/nopCommerce" is opened in new tab

  Scenario: user opens twitter link
    When  user click on twitter logo
    Then "https://twitter.com/nopCommerce" is opened in new tab

  Scenario: user opens rss link
    When  user click on rss logo
    Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

  Scenario: user opens youtube link
    When  user click on youtube logo
    Then "https://www.youtube.com/user/nopCommerce" is opened in new tab

