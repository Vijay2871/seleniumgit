package cucumber;

import org.openqa.selenium.WebDriver;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	private WebDriverManager webDriverManager;
	 private PageObjectManager pageObjectManager;
	 private WebDriver driver;
	 
	 public TestContext(){
		
		 pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	 }


	public PageObjectManager getPageObjectManager() {
		 return pageObjectManager;
		 }
	 
}
