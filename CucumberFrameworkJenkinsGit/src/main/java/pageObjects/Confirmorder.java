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

	
	
	
	
	public void setvendor()  
	{
		vendor.sendKeys("1001");
			
		
	}
	
	public void setsite()  
	{
		site.sendKeys("1");
			
		
	}
	
	public void confirmorder()  
	{
		
		confirm.click();
		
	}
	
	
	
	public void confirmingorders() {
		
		setvendor();
		setsite();
		confirmorder();
		
	}
	
}