package stepdefenition;

import cucumber.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import pageObjects.Confirmorder;

public class CreationSteps {
	
	 TestContext testContext;
	 Confirmorder confirmorder;
	
	public CreationSteps(TestContext context) {
		 testContext = context;
		 confirmorder = testContext.getPageObjectManager().getconfirmorder();
		 }
	
	@Then("^enter \"(.*?)\"  and \"(.*?)\"$")
	public void enter_and(String arg1, String arg2, DataTable arg3) throws Throwable {
		
		confirmorder.confirmingorders();
		
	}

	@Then("^click the ok button$")
	public void click_the_ok_button() throws Throwable {
		
		confirmorder.confirmok1();
	}
}
