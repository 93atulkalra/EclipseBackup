package org.ExcelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadAllValue {

	@Test(dataProvider="dataprv1")
	public void TC1(String arg1, String arg2,String arg3,String arg4)
	{
		
		System.out.println("Value of arg1 =>"+arg1);
		System.out.println("Value of arg1 =>"+arg2);
		
		System.out.println("Value of arg1 =>"+arg3);
		System.out.println("Value of arg1 =>"+arg4);
		

		
		
	}
	
	@DataProvider(name = "dataprv1")
	public Object[][] dataFunc() throws Exception
	{

		Object arr[][] = new Object[3][4];
		
		 String filepath="C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\Assign.xlsx";
		    String sheetName="ParamSheets_Maps";
			
		    File file = new File(filepath);
		    FileInputStream fin = new FileInputStream(file);
		    XSSFWorkbook wrk= new XSSFWorkbook(fin);
		    XSSFSheet sht = wrk.getSheet(sheetName);
		    
		    Iterator<Row> allrows = sht.iterator();
		    allrows.next();
		    
		    int i=0,j=0;
		    while(allrows.hasNext())
		    {
		    	Row currow = allrows.next();
		    	Iterator<Cell> allcells =  currow.cellIterator();
		   j=0;
		    	while(allcells.hasNext())
		    	{
		    		Cell curcel = allcells.next();
		    		System.out.println(curcel.getStringCellValue());
		    		arr[i][j]=curcel.getStringCellValue();
		    		j++;
		    	} // While allcells ends
		    	 i++;
		    	
		    } // While ends allrows
		
		
		
		
		
		
		
		
		return arr;
		
	}
	
	
	/*public static void main(String[] args) throws IOException {
		
		 
		
	}  */
}
