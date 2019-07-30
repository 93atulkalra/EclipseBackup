package Interviewquestion_Codingprac;

import java.io.File;
import java.util.Scanner;

public class ReadFromCSV {
	public static void main(String[] args) throws Exception {
		
		
		String filename ="C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\Worksheet.csv";
		File file = new File(filename);
		Scanner scn = new Scanner(file);
		while(scn.hasNext())
		{
		String data = scn.next();
		System.out.println(data);
		
		}
		
		scn.close();
		
		
		
		
	}

}
