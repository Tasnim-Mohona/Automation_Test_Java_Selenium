Feature: Download PDF

  Scenario: Download PDF of "Albert Einstein" Article

    Then I am on the Main page of Wikipedia
    When I input "Albert Einstein" in the search field and submit
    And I click the Tool menu button on the Article page
    And I click the Download as PDF button in Tools
    And Download file from Download as PDF page
    Then the file with the name provided on the Download as PDF page is downloaded
