Feature: Search Language

  Scenario: Testing Search Language
    Then Main Page is Displayed
    When I enter "García Márquez" in the search field, change search language to "SPANISH" and click submit button
    Then Article page for the "García Márquez" name is opened successfully
