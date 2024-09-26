Feature: Download PDF

  Scenario: Testing Download PDF
    Then Main Page is Displayed
    When I enter "Albert Einstein" in the search field and click submit button
    And  I click the tool menu button and Download as PDF button on the Article page
    And  I click on the download button from Download as PDF page
    Then I should see the PDF file is downloaded successfully








