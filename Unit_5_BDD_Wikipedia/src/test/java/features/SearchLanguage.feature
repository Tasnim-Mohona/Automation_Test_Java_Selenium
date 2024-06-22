Feature: Search Language

  Scenario: Input "Albert Einstein" text in the search field,
  Change search Language to Español and click submit button

    Then I am on the Main page of Wikipedia
    When I input "Albert Einstein" in the search field
    And I change search language to "Español"
    And I click submit button
    Then Information page for "Albert Einstein" article is displayed
