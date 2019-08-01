package org.cts.test1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Samp2 extends BaseCls {
	public static void main(String[] args) throws IOException, InterruptedException {
		getDriver();
		loadurl("http://www.adactin.com/HotelApp/");
		WebElement user=driver.findElement(By.id("username"));
		type(user,getData(1,0));
		WebElement pass=driver.findElement(By.id("password"));
		type(pass,getData(1,1));
		WebElement btn=driver.findElement(By.xpath("//input[@value='Login']"));
		btn.click();
		
		WebElement tloc = driver.findElement(By.xpath("//select[@name=\"location\"]"));
		DropText(tloc,getData(1, 3));

		WebElement thot = driver.findElement(By.id("hotels"));
		DropText(thot,getData(1, 4));

		WebElement troom = driver.findElement(By.id("room_type"));
		DropText(troom,getData(1, 5));

		WebElement troomc = driver.findElement(By.id("room_nos"));
		DropText(troomc,getData(1, 6));

		
		WebElement tdatein = driver.findElement(By.id("datepick_in"));
		type(tdatein,getData(1, 7));
		System.out.println(tdatein);

		WebElement tdateout = driver.findElement(By.id("datepick_out"));
		type(tdateout,getData(1, 8));
		   
		WebElement tAdu = driver.findElement(By.id("adult_room"));
		DropText(tAdu,getData(1, 9));

		WebElement tch = driver.findElement(By.id("child_room"));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		DropText(tch,getData(1, 10));

		WebElement tsub = driver.findElement(By.id("Submit"));
		click(tsub);
		
		WebElement trd=driver.findElement(By.id("radiobutton_0"));
		click(trd);
		
		WebElement con=driver.findElement(By.id("continue"));
		click(con);
		
		WebElement tfirst = driver.findElement(By.id("first_name"));
		type(tfirst,getData(1, 12));
		
		WebElement tlast = driver.findElement(By.id("last_name"));
		type(tlast,getData(1, 13));

		WebElement tadd = driver.findElement(By.id("address"));
		type(tadd,getData(1, 14));

		WebElement tcredit = driver.findElement(By.id("cc_num"));
		type(tcredit,getData(1, 15));

		WebElement tcard = driver.findElement(By.id("cc_type"));
		DropText(tcard,getData(1, 16));
		                                
		WebElement tmon = driver.findElement(By.id("cc_exp_month"));
		DropText(tmon,getData(1, 17));

		Thread.sleep(2000);
		
		WebElement tyear = driver.findElement(By.id("cc_exp_year"));
DropText(tyear,getData(1,18));	

		WebElement tcvc = driver.findElement(By.id("cc_cvv"));
		type(tcvc,getData(1, 19));

		WebElement tbok = driver.findElement(By.id("book_now"));
		click(tbok);
		
		WebElement w22 = driver.findElement(By.id("order_no"));
		order(1, 21, w22.getAttribute("value"));
		String text = w22.getText();
		System.out.println(text);

	}
}
