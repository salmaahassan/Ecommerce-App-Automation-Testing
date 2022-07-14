@smoke
Feature: F06_HmeSliders | user can click on any of the 2 sliders and should be redirected to the url of the product in slider
  Scenario: first slider is clickable on home page
    When user click on first slider
    Then relative product of first slider should be displayed

  Scenario: second slider is clickable on home page
    When user click on second slider
    Then relative product of second slider should be displayed


