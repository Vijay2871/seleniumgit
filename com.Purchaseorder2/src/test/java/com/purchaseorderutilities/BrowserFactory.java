package com.purchaseorderutilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BrowserFactory {

	
	public static WebDriver startapplication(WebDriver driver,String browsername,String appurl) {
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver\\chromedriver_win32\\geckodriver.exe");	
			driver = new FirefoxDriver();
			
		}
		else if(browsername.equals("ie"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver\\chromedriver_win32\\IEDriverServer.exe");	
			driver = new InternetExplorerDriver();
			
		}
		else 
			System.out.println("Invalid browser");
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	
	}
	
	public static void quitbrowser(WebDriver driver) {
		driver.quit();
	}
}
