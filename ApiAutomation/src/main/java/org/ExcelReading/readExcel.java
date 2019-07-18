package org.ExcelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	 File file;
	 FileInputStream inputStream;
	 XSSFWorkbook wbook;
	 XSSFSheet wSheet;
	 int maxNumOfRows;
	 Row row;
	 Cell cell;
	 int maxNumOfCells;

public void excelReadParamBody(String filepath,String sheetName) throws Exception
	{
     
	ArrayList arrlis = new ArrayList();
	
	String s ="hi hellp";
	
	
     file = new File(filepath);
     inputStream = new FileInputStream(file);
     wbook = null;
     wbook = new XSSFWorkbook(inputStream);
     wSheet = wbook.getSheet(sheetName);
     row=null;
     maxNumOfRows= wSheet.getLastRowNum()+1;


String value="";

for(int i=0;i<maxNumOfRows;i++)
		{
	maxNumOfCells = wSheet.getRow(i).getLastCellNum();

	row = wSheet.getRow(i);
for(int j=0;j<maxNumOfCells;j++)
{
    
    cell=row.getCell(j);
   // Section is cell is blank
    if(cell==null)
    {
                    cell=row.createCell(j);
                    cell.setCellValue("");
                    FileOutputStream fos=new FileOutputStream(filepath);
                                    wbook.write(fos);
                                    fos.close();                                                         
    }
    
    // Blank Section ends

    if(row.getCell(j).getCellTypeEnum()==CellType.NUMERIC)
    {
    	
    	 value = Double.toString(row.getCell(j).getNumericCellValue());
    }
    else {
    value=row.getCell(j).getStringCellValue();
    }
    
    arrlis.add(value);
    
    

}   // Cell loop by J ends
	
	
			} // Row loop by I ends

	
System.out.println(arrlis);



	} // Function ends
	
/*	public static void main(String[] args) throws Exception {
		readExcel obj = new readExcel();
		

		 String filepath="C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\Assign.xlsx";
	     String sheetName="ParamSheets_Maps";
		obj.excelReadParamBody(filepath,sheetName);
	}
	*/
}
