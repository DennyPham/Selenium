package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.util.CommonMethods;

public class AlertDemo2 extends CommonMethods {

	public static final String SYNTAX_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("Chrome", SYNTAX_URL);
		Thread.sleep(1000);
		// find the element Alert and Modals and clicking on it
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		// finding Javascript Alerts and clicking on it
		driver.findElement(By.linkText("Javascript Alerts")).click();
		// finding the second alert button and clicking on it
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();;
		Thread.sleep(1000);

		
		//handle the alert.
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Denny");
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(2000);
		
		
		
		
		//to dismiss or cancel the alert, any negative action will be performed
//		alert.dismiss();
//		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
		
		
	}

}
