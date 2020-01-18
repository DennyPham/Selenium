package com.class10;

import org.openqa.selenium.By;

import com.util.CommonMethods;

public class Task extends CommonMethods{

	public static void main(String[] args) {
		
		setUp("Chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	}

}
