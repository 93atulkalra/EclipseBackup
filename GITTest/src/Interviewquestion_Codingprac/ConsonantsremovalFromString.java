package Interviewquestion_Codingprac;

import java.io.IOException;
import java.util.Scanner;

class ConsonantsremovalFromString{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String str="atul";
				int len = str.length();
				
				for(int i =0;i<str.length();i++)
				{
				if((str.charAt(i)=='a')||(str.charAt(i)=='i')||(str.charAt(i)=='e')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))
				{
					
				}
				
				else
					str = str.replaceAll(str.charAt(i)+"", "");
				
					
				}
				
				
				System.out.println(str);
	}

}
