@Google
Feature: Feature to test google search

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box and hits enter
    Then user is navigated to search result
