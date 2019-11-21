package com.purchaseorderpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Printreciept {
WebDriver driver;
	
	public Printreciept(WebDriver ldriver) 
	{
	this.driver=ldriver;
}
	
	@FindBy(xpath="//*[@id=\"purchtablelistpage_3_buttonConfirm_label\" and @for=\"purchtablelistpage_3_buttonConfirm\"]") WebElement confirmpurchasebtn;	
	@FindBy(xpath="//*[@id=\"purchtablelistpage_2_buttonConfirm_label\"]") WebElement recptbtn;
	
	public void printdetails() {
		
		confirmpurchasebtn.click();	
		recptbtn.click();
	}
	}

