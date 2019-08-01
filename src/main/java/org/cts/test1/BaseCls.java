package org.cts.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseCls {
	static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\MavenClass\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	
		return driver;
	}
	
	public static void loadurl(String url) {
		driver.get(url);
	}
	public static void type(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static void btnclick(WebElement element) {
		element.click();
	}
	public static void click(WebElement name) {
		name.click();
		}

		public static void DropText(WebElement a, String b) {
		new Select(a).selectByVisibleText(b);
		}

		public static void DropValue(WebElement c, String d) {
		new Select(c).selectByValue(d);
		}

		public static void DropIndex(WebElement f, int g) {
		new Select(f).selectByIndex(g);
		}
		
		public static String getData(int rowNo,int CellNo) throws IOException
		{
			File loc=new File("C:\\Users\\hp\\eclipse-workspace\\MavenClass\\excel\\adactin.xlsx");
			FileInputStream st=new FileInputStream(loc);
			Workbook w=new XSSFWorkbook(st);
			Sheet s=w.getSheet("Sheet1");
			Row r=s.getRow(rowNo);
			Cell c=r.getCell(CellNo);
			int type=c.getCellType();
			String name=null;
			if(type==1)
			{
				 name=c.getStringCellValue();
			}		
			if(type==0) {
				if(DateUtil.isCellDateFormatted(c)) {
					Date dt=c.getDateCellValue();
					SimpleDateFormat fr=new SimpleDateFormat("dd-MMM-yy");
					name=fr.format(dt);
					}
				else
				{
					
					double d=c.getNumericCellValue();
					// double into long 
					long on=(long) d;
					//long into string
					name=String.valueOf(on);
					return name;
					
				}
			}
			
			return name;			
		}
		public static void order(int rowNo, int cellNo, String OrderNo) throws IOException {
			File f=new File("C:\\Users\\hp\\eclipse-workspace\\MavenClass\\excel\\adactin.xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sh=wb.getSheet("Sheet1");
			Row rr = sh.getRow(rowNo);
			Cell cc = rr.createCell(cellNo);
			cc.setCellValue(OrderNo);
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			
		}
		public static String getDat(int rowN, int cellN) throws IOException {
			
			File f = new File("C:\\Users\\hp\\eclipse-workspace\\MavenClass\\excel\\adactin.xlsx");
			FileInputStream stream = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(stream);
			Sheet s = w.getSheet("Sheet1");
			
			return null;
	
		}
}
