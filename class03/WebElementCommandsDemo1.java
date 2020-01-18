package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsDemo1 {
	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("Admin");
		// it will clear the text box or text area
		userName.clear();
		userName.sendKeys("Helen");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("helen@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		//will return true or false
		System.out.println(errorMessage.isDisplayed());
		
		String errorMsg=errorMessage.getText();
		System.out.println(errorMsg);
		
		//checking if the error message is displayed
		if(errorMessage.isDisplayed()) {
			String message=errorMessage.getText();
			//compare the text with expected
			if(message.equals("Invalid credentials")) {
				System.out.println("Correct Error Message is Displayed");
			}else {
				System.err.println("Incorrect Error Message is Displayed");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
