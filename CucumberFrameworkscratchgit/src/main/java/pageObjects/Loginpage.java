package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	public Loginpage(WebDriver ldriver) 
	{
	this.driver=ldriver;
	 PageFactory.initElements(driver, this);
}
	@FindBy(name="loginfmt") WebElement txtuname;
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement uclick;
	@FindBy(name="passwd") WebElement txtpass;
	
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement loginbtn;
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement remclick;
	
	
	public void setusername(String uname)  
	{
		txtuname.sendKeys(uname);
		uclick.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Error message is "+e.getMessage());
		}
		
	}
	
	public void setpassword(String pwd)  
	{
		txtpass.sendKeys(pwd);
		
		loginbtn.click();
	}
	
	public void reminderclick()  
	{
		
		remclick.click();
		
		
	}
	
}