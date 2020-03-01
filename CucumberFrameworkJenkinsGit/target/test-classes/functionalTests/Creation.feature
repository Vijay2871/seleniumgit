Feature: Purchaseorder operations

  Background:
    Given Open the browser and launch the Dynamics url
    Then I entered the valid credentials
    And I can see the dashboard page

  @RegressionTesting
  Scenario Outline: Filling mandatory details in purchase order
    Then I fill the vendor <vendorname> and  site <site> of the purchase order
    And I click the ok button

    Examples:
      |vendorname|site|
      |1000|   1 |
