package Interviewquestion_Codingprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Palindrome {
	
	public boolean pal(String str)
	{
		
		
		boolean result=false;
		String com="";

		
		for(int j=str.length()-1;j>=0;j--)
			{
				com=com+str.charAt(j);
				
			}


			if(str.equalsIgnoreCase(com))
				result =true;
			return result;
	}
	
	public static void main(String[] args) {
		
		String input = "abbaeae";
		Palindrome ui = new Palindrome();
		LinkedHashSet arr = new LinkedHashSet();
		
		for(int j=input.length();j>0;j--)
		{
		for (int i=0;i<j;i++)
			{
			String ty = input.substring(i,j);
						
			if(ui.pal(input.substring(i,j))==true && (input.substring(i,j).length()>2) )
						
							arr.add(input.substring(i,j));
			
				
			}
		
		}
		System.out.println(arr);
		
		
		
		
	}

}
