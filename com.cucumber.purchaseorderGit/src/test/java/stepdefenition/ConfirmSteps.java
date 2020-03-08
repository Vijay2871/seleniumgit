package stepdefenition;

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
	
	@Then("^enter the item number$")
	public void enter_the_item_number() throws Throwable {
		
		finalsave.setitemnumber();
		
		
	}

	@Then("^save and confirm the purchase order$")
	public void save_and_confirm_the_purchase_order() throws Throwable {
		
		
		finalsave.clickconfirmfinal();
		
	}
}
