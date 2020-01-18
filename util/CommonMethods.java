package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
	
	public static WebDriver driver;
	public static String url;
	
	/**
	 * use this method in need of opening browser and target URL
	 * @param browser The desired browser
	 * @param url The desired URL
	 */
	public static void setUp(String browser ,String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver/chromeDriver");
			 driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().fullscreen();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
			 driver = new FirefoxDriver();
			 driver.get(url);
			 driver.manage().window().fullscreen();
		}
	}
	
	
	 /* This method will take a screenshot
	 * @param screen
	 */
	public static void takeScreenshot(String screen) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File picture=ts.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(picture, new File("screenshots/HRMS/"+screen+".png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	

		
	}

}
