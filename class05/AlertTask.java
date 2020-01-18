package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.util.CommonMethods;

public class AlertTask extends CommonMethods {
		public static final String SYNTAX_URL = "http://166.62.36.207/syntaxpractice/index.html";

		public static void main(String[] args) throws InterruptedException {

			CommonMethods.setUp("Chrome", SYNTAX_URL);
			Thread.sleep(1000);
			// find the element Alert and Modals and clicking on it
			driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
			// finding Javascript Alerts and clicking on it
			driver.findElement(By.linkText("Javascript Alerts")).click();
			driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
			
			Alert alert=driver.switchTo().alert();
			System.out.println("Alert text is: "+alert.getText());
			alert.accept();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
			Alert alert1=driver.switchTo().alert();
			System.out.println(alert1.getText());
			alert1.accept();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();;
			Thread.sleep(1000);
			Alert alert2=driver.switchTo().alert();
			
			alert2.sendKeys("JAVA");
			alert2.accept();
			Thread.sleep(4000);
			driver.close();
			
			
			
			
			
			
			
			
			
	}

}
