package com.purchaseordertestcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.purchaseorderpages.Baseclass;
import com.purchaseorderpages.Confirmorder;
import com.purchaseorderpages.Createorderpage;
import com.purchaseorderpages.Loginpage;
import com.purchaseorderutilities.helper;

public class logintest extends Baseclass {



	@Test(priority=0)
	public void login() {
		
	    logger=report.createTest("Login to Finance operations");
		Loginpage loginpage=PageFactory.initElements(driver, Loginpage.class);
		
		
		logger.info("Application started");
		loginpage.logindemocontosso(excel.getstringdata("Login", 0, 0), excel.getstringdata("Login", 0, 1));
				
		logger.pass("Login successfull");
		helper.screenshot(driver);
	}
	
	@Test(priority=1)
	public void createpurchase() {
		Createorderpage createorderpage=PageFactory.initElements(driver, Createorderpage.class);
		createorderpage.purchaseorder();
		logger.info("Order created");
		helper.screenshot(driver);
		logger.pass("Order created successfull");
	}
	
	@Test(priority=2)
	public void confirmpurchase() {
		Confirmorder confirmorder=PageFactory.initElements(driver, Confirmorder.class);
		confirmorder.confirmdetails("1001","1","1000");
		logger.info("Purchase order created");
		helper.screenshot(driver);
		logger.pass("Purchase created successfull");
	}
	
	
	
}
