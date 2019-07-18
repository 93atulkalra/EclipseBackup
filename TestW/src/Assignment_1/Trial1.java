package Assignment_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Trial1
  {
	String Path;
	File objF; 
	FileInputStream inpf;
	XSSFWorkbook wrk ;
	
	Trial1 () throws Exception
	{
	 Path="C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\Assign.xlsx";
	 objF = new File(Path);
	 inpf = new FileInputStream(objF);
	 wrk = new XSSFWorkbook(inpf);
		
	}
	
	
	public  HashSet functionReturnValue(String SheetName,int rownum, int colnum)  
	{
		HashSet var = new HashSet();
			try {	
		
		
		XSSFSheet sht = wrk.getSheet(SheetName);
		XSSFRow rw = sht.getRow(rownum);
	XSSFCell col = rw.getCell(colnum);
	switch(col.getCellType())
			{
		case 1 : 
		{
			var.add(col.getStringCellValue());
			break;
		}
		
		case 0 : 
		{
			var.add(col.getNumericCellValue());
			break;
		}
		
		case 4 :
		{
			var.add(col.getBooleanCellValue());
			break;
		}
			} // Switch ends
	
	 } // Try block ends here 
	catch (Exception E)
	{
	 System.out.println("Reference entered for the cell is incorrect && it contains balnk value " + E);	
	} // Catch block ends here
	return var;
			
	}  // FunctionReturn values end here  
	
	public  HashSet functionReturRow(String SheetName,int rown)  
	{// System.out.println("hi");
		HashSet var2 = new HashSet();
			try {	
				  Runtime.getRuntime().exec("cmd /c taskkill /f /im excel.exe"); 
			             Thread.sleep(2000);
		XSSFSheet sht = wrk.getSheet(SheetName);
		XSSFRow rw = sht.getRow(rown);
		int colnum = rw.getPhysicalNumberOfCells();		
		// System.out.println(colnum);
	
		for (int i=0;i<colnum;i++)
		{
		Cell col = rw.getCell(i);
	
	
	    if(col==null)
        {
                        col=rw.createCell(i);
                        col.setCellValue("");
                        FileOutputStream fos=new FileOutputStream("C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\Assign.xlsx");
                                        wrk.write(fos);
                                        fos.close();                                                         
        }
		System.out.println(col.getStringCellValue());
		var2.add(col.getStringCellValue());
		
			}
			} // try ends
			
			catch ( Exception e)
			{
				System.out.println("Reference entered for the cell is incorrect && it contains balnk value " + e);	
	
			}
			return var2;
			
	} // Function ends
	

	public  HashSet functionReturColumn(String SheetName,int coln)  
	{// System.out.println("hi");
		int rown=0;
		HashSet var3 = new HashSet();
			try {	
		
		XSSFSheet sht = wrk.getSheet(SheetName);
		
		
		int rownumber = sht.getPhysicalNumberOfRows();		
		System.out.println(rownumber);
	
		for (int i=0;i<rownumber;i++)
		{
			XSSFRow rw = sht.getRow(i);
		XSSFCell col = rw.getCell(coln);
	/*
	if(col.getCellType()==Cell.CELL_TYPE_BLANK)
rw.createCell(i);
		*/
		switch(col.getCellType())
		{
		case 1 : 
	{
		var3.add((col.getStringCellValue()));
		break;
	}
	
	case 0 : 
	{
		var3.add(col.getNumericCellValue());
		break;
	}
	
	case 4 :
	{
		var3.add(col.getBooleanCellValue());
		break;
	}
		} // Switch ends

		}
			} // try ends
			
			catch ( Exception e)
			{
				System.out.println("Reference entered for the cell is incorrect && it contains balnk value " + e);	
	
			}
			return var3;
			
	} // Function ends

	public  HashSet functionReplaceCell(String SheetName,String OldValue, String NewValue)  
	{
		HashSet var2 = new HashSet();
	
		try {	
		
		XSSFSheet sht = wrk.getSheet(SheetName);
        int rownum = sht.getPhysicalNumberOfRows();
        Cell c = null;
		for(int i = 0; i<3;i++)
		{	
			XSSFRow rw = sht.getRow(i);
			for (int j=0;j<4;j++)
			{    XSSFCell cell = rw.getCell(j); 
			System.out.println(cell.getStringCellValue());
				if(cell.getStringCellValue().equals(OldValue))
						{
					c = sht.getRow(i).getCell(j);
					c.setCellValue(NewValue);
				//	System.out.println("Equal");
					cell.getStringCellValue().replace (OldValue,NewValue);
					
						}
			}
		}
			} // Try ends here
			
			catch(Exception e)
			{
				System.out.println(e);
			}
		return var2;
			
			
	} // function ends
	
	
	public static void main(String[] args) throws Exception 
    {
	
	Trial1 objFun = new Trial1();
	HashSet var1 = new HashSet();	
	
	// FUNCTION 1 
	//var1.add(objFun.functionReturnValue("Sheet1", 9, 5));
	//System.out.println(var1);

	// FUNCTION 2
	var1.add(objFun.functionReturRow("Sheet1",0));
	System.out.println(var1);
	
	//Function 3
//	var1.add(objFun.functionReturColumn("Sheet1",5));
//	System.out.println(var1);
	//objFun.functionReplaceCell("Sheet1","abc","Xyz");
    } // Main function ends here
  } // Class Ends

