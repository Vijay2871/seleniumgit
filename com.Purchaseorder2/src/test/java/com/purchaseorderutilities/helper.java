package com.purchaseorderutilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class helper {

	public static void screenshot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src,new File("./Screenshot/Confirm.png"));
		} catch (IOException e) {
			System.out.println("screenshot failed "+e.getMessage());
		}
	
	}
}
