package stepDefenitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.Loginpage;

public class LoginSteps {
	

	 TestContext testContext;
	  Loginpage loginpage;
	 
	 public LoginSteps(TestContext context) {
		 testContext = context;
		 loginpage = testContext.getPageObjectManager().getLoginPage();
		 }



	@Given("^Open the browser and launch the Dynamics url$")
	public void open_the_browser_and_launch_the_Dynamics_url() throws Throwable {
		loginpage.seturl();
		
	}

	@Then("^I entered the valid credentials$")
	public void i_entered_the_valid_credentials() throws Throwable {
		loginpage.loginAsValidUser();  
	}

	@Then("^I can see the dashboard page$")
	public void i_can_see_the_dashboard_page() throws Throwable {
	  
	}
}
