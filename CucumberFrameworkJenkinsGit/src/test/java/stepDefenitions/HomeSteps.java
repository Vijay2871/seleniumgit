package stepDefenitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pageObjects.Createorderpage;

public class HomeSteps {
	
	
	 TestContext testContext;
	 Createorderpage createorderpage;
	
	public HomeSteps(TestContext context) {
		 testContext = context;
		 createorderpage = testContext.getPageObjectManager().getCreateorderPage();
		 }
	
	
	
	@Then("^I click the navigation panel$")
	public void i_click_the_navigation_panel() throws Throwable {
	  
	}

	@Then("^I click the accounts payable$")
	public void i_click_the_accounts_payable() throws Throwable {
	 
	}

	@Then("^I click the all purchase orders$")
	public void i_click_the_all_purchase_orders() throws Throwable {
	    
	}

	@Then("^I can see the purchase order page$")
	public void i_can_see_the_purchase_order_page() throws Throwable {
	   
	}
}
