Feature: Smoke test of 1-day app

  Scenario: Login credentials check for 1-day website
    Given I am on login page
    When I enter username as"jmeter" and password as"jmeter"
    And I submit the login page
    Then I redirect to dashboard
