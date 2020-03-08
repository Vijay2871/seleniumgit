Feature: Purchase order creation

  Scenario: Login check with valid credentials
    Given Open chrome and start the dynamics web page
    When I enter valid "<username>" and click the ok button
    Then I can enter the valid "<password>" and click the ok button
      | username                   | password |
      | 18030625@student.agi.ac.nz | 5t4rncVB |
    And I clicked the clicked the signin button to enter the dashboard
    Then Click the navigation panel and accounts payable and all purchase order
    Then click the new purchase order
    Then enter "<vendor account>"  and "<site>"
      | vendor account | site |
      |           1001 |    1 |
    Then click the ok button
    And enter the item number
    Then save and confirm the purchase order

   
    
    