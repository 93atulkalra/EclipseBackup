package TstNgV1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
                
                public static void main(String[] args) throws IOException, InterruptedException
                {
                               //                Thread.sleep(2000);
                                String filepath="C:\\Ankur Data\\ExcelBalnk.xlsx";
                                String sheetName="Sheet1";
                                File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        Workbook wbook = null;

        wbook = new XSSFWorkbook(inputStream);

        Sheet wSheet = wbook.getSheet(sheetName);
        
        int maxNumOfCells = wSheet.getRow(0).getLastCellNum();
        int maxNumOfRows= wSheet.getLastRowNum()+1;
        
        String arr[][] = new String[maxNumOfRows][maxNumOfCells];
        Row row=null;
        Cell cell;
        String value="";
        
        for(int i=0;i<maxNumOfRows;i++)
        {
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
                                value=row.getCell(j).getStringCellValue();
                                arr[i][j]=value;
                                System.out.println(arr[i][j]);       
                }
        }
                }

}
