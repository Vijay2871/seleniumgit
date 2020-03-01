package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	public  Loginpage(WebDriver ldriver) 
	{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
}
	@FindBy(name="loginfmt") WebElement txtuname;
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement uclick;
	@FindBy(name="passwd") WebElement txtpass;
	
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement loginbtn;
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement remclick;
	
	
	public void seturl() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://democontosodatadevaos.sandbox.ax.dynamics.com/?cmp=USMF&mi=DefaultDashboard");
	}
	
	public void setusername()  
	{
		txtuname.sendKeys("18030625@student.agi.ac.nz");
		uclick.click();
		
		
	}
	
	public void setpassword()  
	{
		txtpass.sendKeys("5t4rnc");
		
		loginbtn.click();
	}
	
	public void reminderclick()  
	{
		
		remclick.click();
		
	}
	public void loginAsValidUser() {
		seturl();
        setusername();
        setpassword();
        reminderclick();
    }
	
}