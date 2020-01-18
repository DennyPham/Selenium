package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.util.CommonMethods;
import com.util.Constant;

/*
 * Navigate to HRMS application
 * enter uid and pwd
 * clcik on login using mouse
 */

public class ActionClassDemo extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	setUp("Chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
	driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
	driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
	//to perform mouse or keyboard operation we need to have an Object on the Action
	Actions act= new Actions(driver);
	//identify an element on which to perform mouse click
	WebElement loginBtn=driver.findElement(By.cssSelector("input#btnLogin"));
	//to right click
	act.moveToElement(loginBtn).contextClick().perform();
	Thread.sleep(2000);
	//to click
	act.moveToElement(loginBtn).click().perform();
	//to perform double click
	//act.moveToElement(loginBtn).doubleClick().perform();
	
	//to hover over the element
	WebElement hover=driver.findElement(By.linkText("PIM"));
	act.moveToElement(hover).perform();
	WebElement add=driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]"));
	act.click(add).perform();
	Thread.sleep(2000);
	driver.quit();
	
}
}
