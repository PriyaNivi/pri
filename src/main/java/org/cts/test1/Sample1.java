package org.cts.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample1 {
	public static void main(String[] args) throws IOException {
		File excel=new File("C:\\Users\\hp\\eclipse-workspace\\MavenClass\\excel\\data1.xlsx");
		FileInputStream st=new FileInputStream(excel);
		Workbook w=new XSSFWorkbook(st);
		Sheet s1=w.getSheet("Sheet1");
		//row
		Row r=s1.getRow(4);
		//cell
		Cell c=r.getCell(3);
		System.out.println(c);
		//How to find the row
		int c1=s1.getPhysicalNumberOfRows();
		System.out.println(c1);
		//How to find cell
		Row r1=s1.getRow(5);
		int c2=r1.getPhysicalNumberOfCells();
		System.out.println(c2);
		//How to find particular cell
		Row r2=s1.getRow(2);
		for(int i=0;i<r.getPhysicalNumberOfCells();i++)
		{
			Cell c3=r2.getCell(i);
			System.out.println(c3);
		}
		//How to find particular row and cell
		for(int i=0;i<s1.getPhysicalNumberOfRows();i++)
		{
			Row r3=s1.getRow(i);
			for(int j=0;j<r3.getPhysicalNumberOfCells();j++)
			{
				Cell c4=r3.getCell(j);
				System.out.println(c4);
			}
		}
		
		
	}

}