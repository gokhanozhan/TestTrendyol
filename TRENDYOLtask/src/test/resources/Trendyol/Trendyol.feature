

Feature: User Login

  Scenario: Test trendyol
    Given Open Trendyol
    When login trendyol
    And ensure
    And write"bilgisayar" in search 
    Then pick random one
    And add to cart
    And compare prices
    And Add more
    And empty cart
    And Close
