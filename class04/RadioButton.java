package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.CommonMethods;

public class RadioButton extends CommonMethods{

public static final String SYNTAX_PRACTICE_URL="http://166.62.36.207/syntaxpractice/index.html";
		
public static void main(String[] args) throws InterruptedException {
			
		
		CommonMethods.setUp("Chrome", SYNTAX_PRACTICE_URL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		Thread.sleep(2000);
		WebElement radioButton=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
		System.out.println(radioButton.isSelected());
		radioButton.click();
		System.out.println(radioButton.isSelected());
		System.out.println("-----------------------");
		
		
		List<WebElement>radioButtons=driver.findElements(By.name("optradio"));
		for (int i=0; i<radioButtons.size();i++) {
			boolean isSelected=radioButtons.get(i).isSelected();
			System.out.println(isSelected);
			if (!isSelected) {
				radioButtons.get(i).click();
			}
		}
		driver.close();
	}

}
