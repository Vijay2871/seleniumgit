Feature: Test oneday smoke test

  Scenario Outline: Login check with valid credentials
    Given Open chrome and start one day web page
    When I enter valid "<username>" and valid "<password>"
    Then I can login succeessfully

    Examples: 
      | username | password |
      | jmeter   | jmeter   |
      
