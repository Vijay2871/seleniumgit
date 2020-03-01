package stepDefenitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pageObjects.Finalsave;

public class ConfirmSteps {
	
	 TestContext testContext;
	 Finalsave finalsave;
	
	public ConfirmSteps(TestContext context) {
		 testContext = context;
		 finalsave = testContext.getPageObjectManager().getfinalsave();
		 }
	
	@Then("^I enter the (\\d+) of the purchase order$")
	public void i_enter_the_of_the_purchase_order(int arg1) throws Throwable {
	    
	}

	@Then("^I save the purchase order$")
	public void i_save_the_purchase_order() throws Throwable {
	   
	}

	@Then("^I confirm the order$")
	public void i_confirm_the_order() throws Throwable {
	   
	}
}
