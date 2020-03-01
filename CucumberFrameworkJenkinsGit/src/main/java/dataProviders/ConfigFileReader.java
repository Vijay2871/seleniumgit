package dataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

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
	
	
public String getImplicitlyWait() {
	
	String implicit=pro.getProperty("implicitilyWait");
	return implicit;
		
	}

public String getApplicationUrl() {
	String appurl=pro.getProperty("url");
	return appurl;
}

}
