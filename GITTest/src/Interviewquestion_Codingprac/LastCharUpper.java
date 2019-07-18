package Interviewquestion_Codingprac;

import java.util.ArrayList;
import java.util.Iterator;

public class LastCharUpper {
	
	public static void main(String[] args) {
		
		String abc ="this ss Test tode";
		
		String result="";
		for(String r: abc.split(" "))
		{
		
			int len = r.length()-1;
			r=r.replace(r.charAt(len),Character.toUpperCase(r.charAt(len)));
			result= result+" " + r;
	//result.concat(str);
	//System.out.println(ch);
			 
		
		}
	System.out.println(result);
		System.out.println("==================NEW==================");
		System.out.println("");
		
		
		abc=abc.toUpperCase();
	System.out.println(abc);
	
	result="";
	for(String r: abc.split(" "))
	{
		int l=r.length();
	String fir =r.substring(0,l-1).toLowerCase();
	String sec = r.substring(l-1);
	 r = fir.concat(sec);
	result= result+ fir.concat(sec)+" ";
	 System.out.println(r);
	
	
	}
	System.out.println(result);

	



	

		


	} // Main ends

	private static String substring(int l, int l2) {
		// TODO Auto-generated method stub
		return null;
	}

} // Class ends
