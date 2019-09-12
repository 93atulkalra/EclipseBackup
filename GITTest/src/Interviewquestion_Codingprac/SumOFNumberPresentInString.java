package Interviewquestion_Codingprac;

import com.gargoylesoftware.htmlunit.javascript.host.Symbol;

public class SumOFNumberPresentInString {

	
	public static void main(String[] args) {
		String inp ="ItisStringwith15a0snumber10";
		String Output = "160";
		String temp ="";
		int flag = 0;
		int sum=0;
		for(int i=0;i<inp.length();i++)
			
		{
			
	
			if(Character.isDigit(inp.charAt(i)))
			{
				temp = temp+inp.charAt(i);
				flag = 1;
				
			}
			
			
			 if((flag ==1 && Character.isAlphabetic(inp.charAt(i)) )|| i==inp.length()-1)
			{
				sum = sum + Integer.parseInt(temp);
				temp = "";
				flag =0;
				
			}
			
		
			
		} // For I ends
		
		
		System.out.println(sum);
	}
}
