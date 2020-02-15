package stepDefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import pageObjects.Createorderpage;

public class DashboardSteps {
	WebDriver driver;
	Createorderpage co;
	
	@Then("^I click the navigation panel$")
	public void i_click_the_navigation_panel() throws Throwable {
	   co=new Createorderpage(driver);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   co.navigationclk();
	   
	}

	@Then("^I click the accounts payable$")
	public void i_click_the_accounts_payable() throws Throwable {
		co.accountspay();
	}

	@Then("^I click the all purchase orders$")
	public void i_click_the_all_purchase_orders() throws Throwable {
		co.allpurchaseord();
	  
	}

	@Then("^I can see the purchase order page$")
	public void i_can_see_the_purchase_order_page() throws Throwable {
	   co.neworder();
	}

}
