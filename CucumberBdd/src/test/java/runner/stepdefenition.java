package runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefenition {
	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
	 
	}

	@When("^I enter username as\"([^\"]*)\" and password as\"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
	 
	}

	@When("^I submit the login page$")
	public void i_submit_the_login_page() throws Throwable {
	   
	}

	@Then("^I redirect to dashboard$")
	public void i_redirect_to_dashboard() throws Throwable {
	   
	}
}
