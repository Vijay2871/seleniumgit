Feature: Test oneday smoke test

  Scenario: Login check with valid credentials
    Given Open chrome and start one day web page
    When I enter valid credentials
    Then I can login succeessfully
