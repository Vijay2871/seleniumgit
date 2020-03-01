package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.Confirmorder;
import pageObjects.Createorderpage;
import pageObjects.Finalsave;
import pageObjects.Loginpage;

public class PageObjectManager {
	 private WebDriver driver;

	 private Loginpage loginpage;
	 private Createorderpage createorderpage;
	 private Confirmorder confirmorder;
	 private Finalsave finalsave;
	 
	 public PageObjectManager(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
		 
		public Loginpage getLoginPage(){
		 
		 return (loginpage == null) ? loginpage = new Loginpage(driver) : loginpage;
		 
		 }
		 
		 public Createorderpage getCreateorderPage(){
			 
			 return (createorderpage == null) ? createorderpage = new Createorderpage(driver) : createorderpage;
			 
			 }
		 
         public Confirmorder getconfirmorder(){
			 
			 return (confirmorder == null) ? confirmorder = new Confirmorder(driver) : confirmorder;
			 
			 }
         
  public Finalsave getfinalsave(){
			 
			 return (finalsave == null) ? finalsave = new Finalsave(driver) : finalsave;
			 
			 }
  
}
