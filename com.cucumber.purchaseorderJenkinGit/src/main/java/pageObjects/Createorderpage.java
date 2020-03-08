package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createorderpage {
WebDriver driver;
	
	public Createorderpage(WebDriver ldriver) 
	{
		this.driver=ldriver;
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//*[@aria-label=\"Show navigation pane\"]") 
	WebElement navigclick;
	@FindBy(xpath="//*[@data-dyn-title=\"Accounts payable\"]") 
	WebElement accpayclick;
	@FindBy(xpath="//*[@data-dyn-title=\"All purchase orders\"]")
	WebElement allpurchclick;
	@FindBy(xpath="//*[@id=\"purchtablelistpage_2_SystemDefinedNewButton_label\"]")
	WebElement neworderclick;
	
	
	public void navigationclk()  
	{
	
		navigclick.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void accountspay()  
	{
	
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accpayclick.click();
	}
	
	public void allpurchaseord()  
	{
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		allpurchclick.click();
	}
	
	public void neworder()  
	{
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		neworderclick.click();
	}
	
	public void creatingorders() {
		navigationclk();
		accountspay();
		allpurchaseord();
		
	}
}
