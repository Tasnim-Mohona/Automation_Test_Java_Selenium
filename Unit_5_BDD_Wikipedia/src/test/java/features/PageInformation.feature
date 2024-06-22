Feature: Page Information

  Scenario: Search "Albert Einstein" , click submit, Click Tool menu button
  and Page information button on the Article page

    Then I am on the Main page of Wikipedia
    When I input "Albert Einstein" in the search field and submit
    And I click the Tool menu button on the Article page
    And I click the Page information button on the Article page
    Then Information page for "Albert Einstein" article is displayed
