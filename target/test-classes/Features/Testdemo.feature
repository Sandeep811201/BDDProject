Feature: Search Iphone and Add to kart.

  @flipDemo
  Scenario: Open flipkart and add a mobile phone to kart
    Given when navigate to flipkart
    When Search mobile phone
    And select a Iphone
    Then Add phone to kart
