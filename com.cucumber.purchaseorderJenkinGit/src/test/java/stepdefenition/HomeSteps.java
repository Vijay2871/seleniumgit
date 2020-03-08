package stepdefenition;

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
	
	
	@Then("^Click the navigation panel and accounts payable and all purchase order$")
	public void click_the_navigation_panel_and_accounts_payable_and_all_purchase_order() throws Throwable {
		
		createorderpage.creatingorders();
		
	}

	@Then("^click the new purchase order$")
	public void click_the_new_purchase_order() throws Throwable {
		
		createorderpage.neworder();
}
}
