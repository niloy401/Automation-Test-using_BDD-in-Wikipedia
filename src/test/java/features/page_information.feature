Feature: Page Information

  Scenario: Testing Page Information
    Then Main Page is Displayed
    When I enter "Bengal tiger" in the search field and click submit button
    And  I click the tool menu button and Page Information button on the Article page
    Then I should see the Information page for the "Bengal tiger" is displayed successfully


