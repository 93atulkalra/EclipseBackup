package TestBaseIntialise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeSuite;

public class BaseSetupIntial {
	
	  String filepath;
	  String sheetName;
	  File file;
	  
	@BeforeSuite
	public void setupResource() throws Exception
	{
		 
					filepath="C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\Assign.xlsx";
	                 sheetName="Sheet1";
	               file = new File(filepath);
	        FileInputStream inputStream = new FileInputStream(file);
	  
	        XSSFWorkbook wbook = null;

	        wbook = new XSSFWorkbook(inputStream);

	        XSSFSheet wSheet = wbook.getSheet(sheetName);
	        
	        int maxNumOfRows= wSheet.getLastRowNum()+1;
	        
	    
	        Row row=null;
	        Cell cell;
	        String value="";
	        
	        for(int i=0;i<maxNumOfRows;i++)
	        {
	        	 int maxNumOfCells = wSheet.getRow(i).getLastCellNum();
	             
	                row = wSheet.getRow(i);
	                for(int j=0;j<maxNumOfCells;j++)
	                {
	                                
	                                cell=row.getCell(j);
	                                if(cell==null)
	                                {
	                                                cell=row.createCell(j);
	                                                cell.setCellValue("");
	                                                FileOutputStream fos=new FileOutputStream(filepath);
	                                                                wbook.write(fos);
	                                                                fos.close();                                                         
	                                }

	                                 String arr[][] = new String[maxNumOfRows][maxNumOfCells];
	                                value=row.getCell(j).getStringCellValue();
	                                arr[i][j]=value;
	                                System.out.println(arr[i][j]);       
	                }
	        }
	             
		
	}

}
