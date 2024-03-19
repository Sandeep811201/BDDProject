Feature: Sauce Demo login

  @SauceDemo
  Scenario: Open Sauce Demo UI page and verify login
    Given when Sauce Demo Page
    When Enter username and password
    And click on login button
    Then home page should display
