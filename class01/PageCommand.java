package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommand {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");

		final String expectedTitle = "Google";
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("I'm on the right page");
		} else {
			System.out.println();
			System.out.println();
			System.err.println("Wrong");
		}
		System.out.println("------------------");
		
		
		String expectedURL = "https://google.com/?gws_rd=ssl";
		String actualURL = driver.getCurrentUrl();
		
		
		if (expectedURL.equals(actualURL)) {
			System.out.println("Both URL matches");
		} else {
			System.err.println("Actual and Extected do not match");
		}

		driver.close();
	}

}
