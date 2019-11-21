package com.purchaseorderutilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configdataprovider {

	Properties pro;
	public Configdataprovider() 
	{
		File src=new File("./Config/Config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			
			System.out.println("Not able to load the configfile"+e.getMessage());
		} 
	}
	
	public String getdatafromconfig(String keysearch)
	{
		return pro.getProperty(keysearch);
	}
	
	public String getbrowser()
	{
		return pro.getProperty("Browser");
	}
	public String getstagingurl()
	{
		return pro.getProperty("qaUrl");
	}
	
	
	
	
}
