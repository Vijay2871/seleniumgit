package stepDefenitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pageObjects.Confirmorder;

public class CreationSteps {
	
	 TestContext testContext;
	 Confirmorder confirmorder;
	
	public CreationSteps(TestContext context) {
		 testContext = context;
		 confirmorder = testContext.getPageObjectManager().getconfirmorder();
		 }
	
	@Then("^I fill the vendor (\\d+) and  site (\\d+) of the purchase order$")
	public void i_fill_the_vendor_and_site_of_the_purchase_order(int arg1, int arg2) throws Throwable {
		confirmorder.setvendor();
		confirmorder.setsite();
	}

	@Then("^I click the ok button$")
	public void i_click_the_ok_button() throws Throwable {
		confirmorder.confirmingorders();
	}
}
