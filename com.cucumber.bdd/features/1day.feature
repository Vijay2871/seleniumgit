Feature: Test oneday smoke test

  Scenario Outline: Login check with valid credentials
    Given Open chrome and start one day web page
    When I enter valid <username> and valid <password>
    Then I can login succeessfully
    Then I can see the sucess message
    """
    You are successfully logged in 
    """
    

    Examples: 
      | username | password |
      | jmeter   | jmeter   |
      
