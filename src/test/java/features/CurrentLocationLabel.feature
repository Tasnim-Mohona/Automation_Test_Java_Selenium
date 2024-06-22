Feature: Current Location Label

  Scenario: Verify current location label in search results

    Then I go to the main page
    When I consent to cookie
    And I click the search field
    Then Use your current location label is displayed
