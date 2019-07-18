package org.ExcelReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class test2 {
	
	@Test
	void testcasetest() throws Exception
	{
	ArrayList lista = new ArrayList();
	 String filepath="C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\Assign.xlsx";
    String sheetName="ParamSheets_Maps";
	 FileInputStream fileinp = new FileInputStream("C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\Assign.xlsx");
	 XSSFWorkbook wrk = new XSSFWorkbook(fileinp);

	 XSSFSheet sheet = wrk.getSheet("ParamSheets_Maps");
	 
	 
	 	Iterator<Row> allrows = sheet.iterator();
	 	Iterator<Cell> allcells;
	 	Row rowvalue;Cell cellvalue;
	 	while(allrows.hasNext())
	 	{
	 		
	 		rowvalue = allrows.next();
	 		//	if(	rowvalue.getCell(0).getStringCellValue().equals("testcasetest"))
			{
				
					allcells = rowvalue.cellIterator();
					
					while(allcells.hasNext())
					{
						String cellstring = allcells.next().getStringCellValue();
					lista.add(cellstring)	;
						
			
					}
			}
	 	}
		
	 					System.out.println("List is ===>>>");
	 					System.out.println(lista);
	 	
	 	
}
}