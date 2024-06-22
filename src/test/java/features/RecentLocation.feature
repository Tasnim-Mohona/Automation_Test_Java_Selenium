Feature: Recent Location

  Scenario: Check if the city name from recent locations is displayed in the city weather page header

    Then I go to the main page
    When I consent to cookie
    And I input "London" in the search field
    And I click on the first search result
    And I go back to the previous page
    Then the main page is opened
    When I choose the first city in Recent locations
    Then The header should contain the city name "London"
