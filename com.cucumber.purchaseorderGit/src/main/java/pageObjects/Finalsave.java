package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;
import managers.FileReaderManager;

public class Finalsave {
WebDriver driver;
ConfigFileReader configFileReader;
	public Finalsave(WebDriver ldriver) 
	{
		this.driver=ldriver;
	PageFactory.initElements(driver, this);
	configFileReader= new ConfigFileReader();
}
	
		
	@FindBy(xpath="//*[@name='PurchLine_ItemId']") WebElement item;	
	@FindBy(xpath="//*[@id=\"purchtablelistpage_2_SystemDefinedSaveButton_label\"]") WebElement save;
	@FindBy(xpath="//*[@id=\"purchtablelistpage_2_buttonConfirm_label\"]") WebElement confirmfinal;
	
	public void setitemnumber()  
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		item.sendKeys(FileReaderManager.getInstance().getConfigReader().getItemnumber());
		
	}
	
	public void savemorder()  
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		save.click();
		
	}
	
	public void clickconfirmfinal()  
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		confirmfinal.click();
		
	}
	
	public void setconfirm() {
		
		savemorder();
		clickconfirmfinal();
	}
}
