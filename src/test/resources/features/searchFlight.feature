@searchFlight
Feature: Search flight using clear-trip site
  As a User
  I want to search flight from source to destination location
  So that user can plan travel and do booking

  Scenario Outline: Search flight using clear-trip site
    Given User launch application with <URL>
    When User select the trip type as <tripType>
    When User search flight using <sourceLocation> and <destinationLocation> location
    Then User can confirm booking

    Examples:
      | URL                               | tripType   | sourceLocation | destinationLocation |
      | https://www.cleartrip.com/flights | Round trip | Mumbai         | Pune                |