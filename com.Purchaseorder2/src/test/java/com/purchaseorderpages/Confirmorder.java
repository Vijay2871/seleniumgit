package com.purchaseorderpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Confirmorder {
WebDriver driver;
	
	public Confirmorder(WebDriver ldriver) 
	{
	this.driver=ldriver;
}
	
	@FindBy(xpath="//*[@name=\"PurchTable_OrderAccount\"]") WebElement vendor;
	@FindBy(xpath="//*[@name=\"PurchTable_InventSiteId\"]") WebElement site;
	@FindBy(xpath="//*[@id=\"PurchCreateOrder_3_OK_label\"]") WebElement confirm;
	@FindBy(xpath="//*[@name=\"PurchLine_ItemId\"]") WebElement item;	

	@FindBy(xpath="//*[@id=\"purchtablelistpage_2_SystemDefinedSaveButton_label\"]") WebElement save;
	@FindBy(xpath="//*[@id=\"purchtablelistpage_2_buttonConfirm_label\"]") WebElement trial;
	
	public void confirmdetails(String vendorname,String sitename,String itemname)  {
		vendor.sendKeys(vendorname);
		site.sendKeys(sitename);
		confirm.click();
		
		item.sendKeys(itemname);
		
		
		
		save.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		trial.click();
}
}