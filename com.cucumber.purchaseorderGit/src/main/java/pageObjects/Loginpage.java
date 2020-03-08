package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;
import managers.FileReaderManager;

public class Loginpage {

	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public  Loginpage(WebDriver ldriver) 
	{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	configFileReader= new ConfigFileReader();
}
	@FindBy(name="loginfmt") WebElement txtuname;
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement uclick;
	@FindBy(name="passwd") WebElement txtpass;
	
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement loginbtn;
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement remclick;
	
	
	public void seturl() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationurl());
	}
	
	public void setusername() throws InterruptedException  
	{
		txtuname.sendKeys(FileReaderManager.getInstance().getConfigReader().getUsername());
		Thread.sleep(4000);
		uclick.click();
		
		
	}
	
	public void setpassword()  
	{
		txtpass.sendKeys(FileReaderManager.getInstance().getConfigReader().getPassword());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginbtn.click();
	}
	
	public void reminderclick()  
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		remclick.click();
		driver.manage().window().maximize(); 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void loginAsValidUser() {
		
        try {
			setusername();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        setpassword();
        
    }
	
}