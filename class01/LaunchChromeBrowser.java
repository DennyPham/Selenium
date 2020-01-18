package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// System is a class. setProperty(); is static method

										// key 				//value
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		// hhtp: Hypertext transfer protocol s
		driver.get("https://www.google.com");
		Thread.sleep(1000);

		// will navigate to a given url
		driver.navigate().to("https://syntaxtechs.com");
		driver.navigate().back();
		driver.navigate().forward();

		driver.close();
		
	}
	
}
