Feature: Dashboard operation

  Background: 
    Given Open the browser and launch the Dynamics url
    Then I entered the valid credentials
    And I can see the dashboard page

  @RegressionTesting
  Scenario: Steps done in dashboardpage
    Then I click the navigation panel
    And I click the accounts payable
    And I click the all purchase orders
    Then I can see the purchase order page
