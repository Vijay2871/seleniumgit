package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finalsave {
WebDriver driver;
	
	public Finalsave(WebDriver ldriver) 
	{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//*[@name=\"PurchLine_ItemId\"]") WebElement item;	

	@FindBy(xpath="//*[@id=\"purchtablelistpage_2_SystemDefinedSaveButton_label\"]") WebElement save;
	@FindBy(xpath="//*[@id=\"purchtablelistpage_2_buttonConfirm_label\"]") WebElement confirmfinal;
	
	public void setitemnumber()  
	{
		
		item.sendKeys("1000");
		
	}
	
	public void savemorder()  
	{
		
		save.click();
		
	}
	
	public void clickconfirmfinal()  
	{
		
		confirmfinal.click();
		
	}
	
	public void setconfirm() {
		setitemnumber();
		savemorder();
		clickconfirmfinal();
	}
}
