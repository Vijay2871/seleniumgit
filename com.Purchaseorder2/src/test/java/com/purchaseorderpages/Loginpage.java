package com.purchaseorderpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	WebDriver driver;
	
	public void LoginPage(WebDriver ldriver) 
	{
	this.driver=ldriver;
}
	@FindBy(name="loginfmt") WebElement uname;
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement uclick;
	@FindBy(name="passwd") WebElement pass;
	
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement loginbtn;
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement remclick;
	
	
	public void logindemocontosso(String unameapplication,String passapplication)  {
		
		uname.sendKeys(unameapplication);
		uclick.click();
		pass.sendKeys(passapplication);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		loginbtn.click();
		remclick.click();
		
	}
}