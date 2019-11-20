package com.crmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	WebDriver driver;
	
	public void LoginPage(WebDriver ldriver) 
	{
	this.driver=ldriver;
}
	@FindBy(name="email") WebElement uname;
	@FindBy(name="password") WebElement pass;
	@FindBy(xpath="//*[@class=\"ui fluid large blue submit button\"]") WebElement loginbtn;
	
	public void logincrm(String unameapplication,String passapplication)  {
		
		uname.sendKeys(unameapplication);
		pass.sendKeys(passapplication);
		loginbtn.click();
		
	}
}