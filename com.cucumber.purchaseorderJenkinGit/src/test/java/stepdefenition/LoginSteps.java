package stepdefenition;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import pageObjects.Loginpage;

public class LoginSteps {
	
	WebDriver driver;
	  Loginpage loginpage;  
	  ConfigFileReader configFileReader;
	 TestContext testContext;

	 
	 public LoginSteps(TestContext context) {
		 testContext = context;
		 loginpage = testContext.getPageObjectManager().getLoginPage();
		 }

	

	
	 @Given("^Open chrome and start the dynamics web page$")
		public void open_chrome_and_start_the_dynamics_web_page() throws Throwable {
		
				loginpage.seturl();
		  
		}

		@When("^I enter valid \"(.*?)\" and click the ok button$")
		public void i_enter_valid_and_click_the_ok_button(String arg1) throws Throwable {
			
			loginpage.setusername();
		  
		}

		@Then("^I can enter the valid \"(.*?)\" and click the ok button$")
		public void i_can_enter_the_valid_and_click_the_ok_button(String arg1, DataTable arg2) throws Throwable {

			
			loginpage.setpassword();

		}

		@Then("^I clicked the clicked the signin button to enter the dashboard$")
		public void i_clicked_the_clicked_the_signin_button_to_enter_the_dashboard() throws Throwable {

			
			loginpage.reminderclick();
			
		}
}
