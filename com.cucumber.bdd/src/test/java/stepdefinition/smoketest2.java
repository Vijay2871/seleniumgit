package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smoketest2 {
	
	WebDriver driver;
	
	@Given("^Open chrome and start one day web page$")
	public void open_chrome_and_start_one_day_web_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver\\chromedriver.exe");	
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.1-day.co.nz/orderlist.do");
	driver.findElement(By.xpath("//button[@type='button' and @id='cboxClose']")).click();
	Thread.sleep(5000);
	
}

	@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_and_valid(String arg1, String arg2) throws Throwable {
driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("jmeter");
driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("jmeter");
driver.findElement(By.xpath("//button[@type='submit' and @class='loginButton btn-login']")).click();

}

	@Then("^I can login succeessfully$")
	public void i_can_login_succeessfully() throws Throwable {
driver.quit();
}
}

