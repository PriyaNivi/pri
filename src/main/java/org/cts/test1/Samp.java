package org.cts.test1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Samp extends BaseCls {

	public static void main(String[] args) throws IOException {
		getDriver();
		loadurl("http://www.adactin.com/HotelApp/");
		WebElement user=driver.findElement(By.id("username"));
		type(user,getData(1,0));
		WebElement pass=driver.findElement(By.id("password"));
		type(pass,getData(1,1));
		WebElement btn=driver.findElement(By.xpath("//input[@value='Login']"));
		btn.click();
		
		
		
		
	}

}
