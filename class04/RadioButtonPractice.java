package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.CommonMethods;

public class RadioButtonPractice extends CommonMethods{
public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("Chrome", URL);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		Thread.sleep(2000);
		WebElement maleButton=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
		maleButton.click();
		Thread.sleep(1000);
		boolean isSelected=maleButton.isSelected();
		System.out.println("is the male button selcted? : "+isSelected);
		driver.close();
		
	}

}
