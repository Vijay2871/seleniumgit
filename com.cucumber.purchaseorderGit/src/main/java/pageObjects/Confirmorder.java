package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;
import managers.FileReaderManager;

public class Confirmorder {
WebDriver driver;
ConfigFileReader configFileReader;
	
	public Confirmorder(WebDriver ldriver) 
	{
		this.driver=ldriver;
	PageFactory.initElements(driver, this);
	configFileReader= new ConfigFileReader();
}
	
	@FindBy(xpath="//*[@name=\"PurchTable_OrderAccount\"]") WebElement vendor;
	@FindBy(xpath="//*[@name=\"PurchTable_InventSiteId\"]") WebElement site;
	@FindBy(xpath="//*[@id=\"PurchCreateOrder_3_OK_label\"]") WebElement confirm;

	
	public void setvendor()  
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vendor.sendKeys(FileReaderManager.getInstance().getConfigReader().getVendor());
			
		
	}
	
	public void setsite()  
	{
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		site.sendKeys(FileReaderManager.getInstance().getConfigReader().getSite());
			
		
	}
	
		
	
	public void confirmingorders() {
		
		setvendor();
		setsite();
		
		
	}

	public void confirmok1() {

		confirm.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}