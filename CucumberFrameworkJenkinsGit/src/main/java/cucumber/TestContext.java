package cucumber;

import org.openqa.selenium.WebDriver;

import managers.PageObjectManager;

public class TestContext {
	//private WebDriverManager webDriverManager;
	 private PageObjectManager pageObjectManager;
	 private WebDriver driver;
	 
	 public TestContext(){
		
		 pageObjectManager = new PageObjectManager(driver);
	 }


	public PageObjectManager getPageObjectManager() {
		 return pageObjectManager;
		 }
	 
}
