package com.crmtestcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crmpages.Baseclass;
import com.crmpages.Loginpage;
import com.crmutilities.helper;

public class logintest extends Baseclass {



	@Test
	public void login() {
		
	logger=report.createTest("Login to CRM");
		Loginpage loginpage=PageFactory.initElements(driver, Loginpage.class);
		
		logger.info("Application started");
		loginpage.logincrm(excel.getstringdata("Login", 0, 0), excel.getstringdata("Login", 0, 1));
		logger.pass("Login successfull");
		helper.screenshot(driver);
	}
	
	
	

}
