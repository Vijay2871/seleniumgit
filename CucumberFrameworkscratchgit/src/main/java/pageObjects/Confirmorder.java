package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmorder {
WebDriver driver;
	
	public Confirmorder(WebDriver ldriver) 
	{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//*[@name=\"PurchTable_OrderAccount\"]") WebElement vendor;
	@FindBy(xpath="//*[@name=\"PurchTable_InventSiteId\"]") WebElement site;
	@FindBy(xpath="//*[@id=\"PurchCreateOrder_3_OK_label\"]") WebElement confirm;
	@FindBy(xpath="//*[@name=\"PurchLine_ItemId\"]") WebElement item;	

	@FindBy(xpath="//*[@id=\"purchtablelistpage_2_SystemDefinedSaveButton_label\"]") WebElement save;
	@FindBy(xpath="//*[@id=\"purchtablelistpage_2_buttonConfirm_label\"]") WebElement confirmfinal;
	
	
	
	
	public void setvendor(String vendorname)  
	{
		vendor.sendKeys(vendorname);
			
		
	}
	
	public void setsite(String sitename)  
	{
		site.sendKeys(sitename);
			
		
	}
	
	public void confirmorder()  
	{
		
		confirm.click();
		
	}
	
	public void setitemnumber(String itemname)  
	{
		
		item.sendKeys(itemname);
		
	}
	
	public void savemorder()  
	{
		
		save.click();
		
	}
	
	public void clickconfirmfinal()  
	{
		
		confirmfinal.click();
		
	}
	
}