package org.ExcelReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcelUdemy {

	public static void main(String[] args) throws IOException {
		
		 String filepath="C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\Assign.xlsx";
	     String sheetName="ParamSheets_Maps";
		 FileInputStream fileinp = new FileInputStream("C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\Assign.xlsx");
		 XSSFWorkbook wrk = new XSSFWorkbook(fileinp);
	/*	 int number_sheets = wrk.getNumberOfSheets();
		 for (int i=0;i<number_sheets;i++)
		 {
			 
			 System.out.println(wrk.getSheetName(i));
		 }
		 
	*/
		 XSSFSheet sheet = wrk.getSheet("ParamSheets_Maps");
		 Iterator<Row> itr = sheet.iterator();
		 Row firstrow = itr.next();
		 Iterator<Cell> itrcell = firstrow.cellIterator();
		 int k=0,column=0;
		 while (itrcell.hasNext())
		 {
			 Cell value = itrcell.next();
			 
			 if(value.getStringCellValue().equalsIgnoreCase("TC_Name"))
			 {
				 column=k;
			 }
		k++;	 
		 }
		 
	while(itr.hasNext())
	{
	Row r= itr.next();
	if(r.getCell(column).getStringCellValue().equals("org.TestcaseAPI_TC_Get_Location_TC1_Maps"))
	{
		Iterator<Cell> cv= r.cellIterator();
		
		while(cv.hasNext())
		{		System.out.println(cv.next().getStringCellValue());
		}
	}
	}	 
		 		 
	
		 
			
	
		 
		 
		 
	}
	
	
}
