package stepDefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import pageObjects.Loginpage;

public class LoginSteps {

	WebDriver driver;
	Loginpage lp;
	ConfigFileReader configFileReader;
	
	@Given("^Open the browser and launch the Dynamics url$")
	public void open_the_browser_and_launch_the_Dynamics_url() throws Throwable {
		configFileReader=new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver",configFileReader.getDriverPath());
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://democontosodatadevaos.sandbox.ax.dynamics.com/?cmp=USMF&mi=DefaultDashboard");
	 
	}

	@Then("^I entered the valid credentials$")
	public void i_entered_the_valid_credentials() throws Throwable {
		 lp = new Loginpage(driver);
		lp.setusername(configFileReader.getUsername());
		lp.setpassword(configFileReader.getPassword());
		lp.reminderclick();
		
	   
	}

	@Then("^I can see the dashboard page$")
	public void i_can_see_the_dashboard_page() throws Throwable {
		String x=driver.getTitle();
		System.out.println("Title is "+x);
		
		System.out.println("Reached Dashboard page");
	}
}
