package dataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	
	Properties pro;
	
	public ConfigFileReader() {
	
		try {
			File src=new File("./configs/Configuration.properties");
			FileInputStream fis=new FileInputStream(src);
			 pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage() );
			
		} 
		
	}

	
	public String getDriverPath() {
		String dpath=pro.getProperty("driverpath");
		return dpath;
	}
	
	
	public long getImplicitlyWait() { 
		 String implicitlyWait = pro.getProperty("implicitlyWait");
		 if(implicitlyWait != null) {
		 try{
		 return Long.parseLong(implicitlyWait);
		 }catch(NumberFormatException e) {
		 throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
		 }
		 }
		 return 30; 
		 }

public String getApplicationUrl() {
	String appurl=pro.getProperty("url");
	return appurl;
}

public DriverType getBrowser() {
String browserName = pro.getProperty("browser");
if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
}

public EnvironmentType getEnvironment() {
String environmentName = pro.getProperty("environment");
if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
}

public Boolean getBrowserWindowSize() {
String windowSize = pro.getProperty("windowMaximize");
if(windowSize != null) return Boolean.valueOf(windowSize);
return true;
}

}
