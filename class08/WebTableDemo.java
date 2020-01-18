package com.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.CommonMethods;

public class WebTableDemo extends CommonMethods{
public static void main(String[] args) {
	setUp("Chrome", "http://166.62.36.207/syntaxpractice/index.html");
	//Navigate to the table we need
	driver.findElement(By.linkText("Table")).click();
	driver.findElement(By.linkText("Table Data Search")).click();
	
	//Find how many rows of data table has
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
	System.out.println("Numbers of rows in the table is = " +rows.size());
	
	System.out.println("Printing row data --------------------------");
	Iterator<WebElement> it=rows.iterator();
	while (it.hasNext()) {
		String rowData=it.next().getText();
		System.out.println(rowData);
	}
	
	
	//Numbers of Collums
	List<WebElement> cols=driver.findElements(By.xpath("//table[@id='task_table']/thead/tr/th"));
	System.out.println("Numbers od collums in the table is = "+ cols.size());
	System.out.println("Printing columns headers--------------------------");
	
	for(WebElement col:cols) {
		System.out.println(col.getText());
	}
	
	driver.close();
	
	
}
}
