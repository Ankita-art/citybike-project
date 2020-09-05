Feature: User verify that city Frankfurt in Germany

  Scenario: As a user I want to verify that the city Frankfurt is in Germany and return their corresponded latitude and longitude
    When I send a GET request to the networks with visa-frankfurt
    Then I verify that id "visa-frankfurt" is in Germany
    And in return i get corresponded latitude and longitude









