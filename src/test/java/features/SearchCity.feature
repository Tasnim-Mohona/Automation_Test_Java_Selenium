Feature: Search City

  Scenario: Search for a city and display its weather page

    Then I go to the main page
    When I consent to cookie
    And I input "New York" in the search field
    Then search results list is displayed
    And I click on the first search result
    Then The header should contain the city name "New York"
