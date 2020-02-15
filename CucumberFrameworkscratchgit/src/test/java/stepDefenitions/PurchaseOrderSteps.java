package stepDefenitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import pageObjects.Confirmorder;

public class PurchaseOrderSteps {
	WebDriver driver;
	Confirmorder con;
	
	
	@Then("^I enter the <vendorname> and (\\d+) of the purchase order$")
	public void i_enter_the_vendorname_and_of_the_purchase_order(int arg1) throws Throwable {
	   con.setvendor("1001");
	   con.setsite("1");
	}

	@Then("^I click the ok button$")
	public void i_click_the_ok_button() throws Throwable {
	    
	    con.confirmorder();
	    
	}
	
}
