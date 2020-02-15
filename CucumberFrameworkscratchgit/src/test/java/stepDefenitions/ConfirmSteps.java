package stepDefenitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import pageObjects.Confirmorder;

public class ConfirmSteps {
	
	WebDriver driver;
	Confirmorder con;
	
	
	@Then("^I enter the (\\d+) of the purchase order$")
	public void i_enter_the_of_the_purchase_order(int arg1) throws Throwable {
	   con.setitemnumber("1000");
	}

	@Then("^I save the purchase order$")
	public void i_save_the_purchase_order() throws Throwable {
	    con.savemorder();
	}

	@Then("^I confirm the order$")
	public void i_confirm_the_order() throws Throwable {
	    con.clickconfirmfinal();
	}

}
