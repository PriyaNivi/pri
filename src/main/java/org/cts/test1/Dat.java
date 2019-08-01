package org.cts.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Dat {
public static void main(String[] args) throws IOException {
	File loc=new File("C:\\Users\\hp\\eclipse-workspace\\MavenClass\\excel\\data1.xlsx");
	FileInputStream st=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(st);
	Sheet s=w.getSheet("Sheet1");
	for(int i=0;i<s.getPhysicalNumberOfRows();i++)
	{
		Row r=s.getRow(i);
		for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
			Cell c=r.getCell(j);
			//1-text,0-number,date
			int type=c.getCellType();
			if(type==1)
			{
				String name=c.getStringCellValue();
				System.out.println(name);
			}
			if(type==0) {
				if(DateUtil.isCellDateFormatted(c)) {
					Date dt=c.getDateCellValue();
					SimpleDateFormat fr=new SimpleDateFormat("dd-MMM-yy");
					String name=fr.format(dt);
					System.out.println(name);
					}
				else
				{
					
					double d=c.getNumericCellValue();
					// double into long 
					long on=(long) d;
					//long into string
					//String name=String.valueOf(0);
					//System.out.println(name);
					
				}
			}			
		}
	}

	
}
}
