package com.class04;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.CommonMethods;


public class CheckBoxDemo extends CommonMethods {
	public static final String HRMS_URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		
		CommonMethods.setUp("chrome",HRMS_URL);
		driver.manage().window().fullscreen();
		
		driver.findElement(By.linkText("Input Forms")).click();
		
		driver.findElement(By.linkText("Checkbox Demo")).click();
		
		WebElement ageCheckBox=driver.findElement(By.id("isAgeSelected"));
		ageCheckBox.click();
		
		if(!ageCheckBox.isSelected()) {
			ageCheckBox.click();
		}
		Thread.sleep(1000);
		ageCheckBox.click();
		
		System.out.println("------Group of Check Boxes---------");
		List<WebElement>groupCheckBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		if(!groupCheckBox.isEmpty()) {
			Iterator<WebElement>it=groupCheckBox.iterator();
			while(it.hasNext()) {
				it.next().click();
			}
		}else {
			System.err.println("List is Empty, Check your xpath");
		}
		Thread.sleep(2000);
		
		
		
		driver.close();
	}

}
