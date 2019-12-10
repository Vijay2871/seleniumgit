package com.purchaseorderpages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.purchaseorderutilities.BrowserFactory;
import com.purchaseorderutilities.Configdataprovider;
import com.purchaseorderutilities.Exceldataprovider;
import com.purchaseorderutilities.helper;

public class Baseclass {
	
	public WebDriver driver;
	public Exceldataprovider excel;
	public Configdataprovider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	
	@BeforeSuite
	public void setupsuite() {
		 excel=new Exceldataprovider();	
		 config=new Configdataprovider();
		 ExtentHtmlReporter extent=new ExtentHtmlReporter(new File("user.dir")+"Report/Purchaseorder.html");
		 report=new ExtentReports();
		 report.attachReporter(extent);
		 
	}
	
	@BeforeClass
	public void setup() {
		driver=BrowserFactory.startapplication(driver, config.getbrowser(), config.getstagingurl());	
	}
	@AfterClass
	public void teardown() {
	BrowserFactory.quitbrowser(driver);
	}
	
	@AfterMethod
	public void teardownmethod(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
		helper.screenshot(driver);
		}
		report.flush();
	}
	
	
}
