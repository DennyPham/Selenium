package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.util.CommonMethods;

public class AlertDemo1 extends CommonMethods {

public static final String SYNTAX_URL="http://166.62.36.207/syntaxpractice/index.html";
		
public static void main(String[] args) throws InterruptedException {
	
	CommonMethods.setUp("Chrome", SYNTAX_URL);
	Thread.sleep(1000);
	//find the element Alert and Modals and clicking on it
	driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
	//finding Javascript Alerts and clicking on it
	driver.findElement(By.linkText("Javascript Alerts")).click();
	//finding the button and clicking on it
	driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
	Thread.sleep(1000);
	
	Alert alert=driver.switchTo().alert();
	Thread.sleep(1000);
	//get the text from alert box before you hand the alert
	System.out.println("Alert text: "+alert.getText());
	//accept alert any positive action it can be OK, or Yes, etc
	alert.accept();
	Thread.sleep(2000);
	
	
	//get the text from the UI or main window
	String text=driver.findElement(By.xpath("//p[text()='Click the button to display an alertbox:']")).getText();
	System.out.println(text);
	
	}

}
