package Interviewquestion_Codingprac;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {
//Write code to sort the list of strings using Java collection?
	public static void main(String[] args) {
		
		
		String[] inputList = { "Jan", "Feb", "Mar", "apr", "May", "Jun", "Jul",
				"Aug", "Sep", "Oct", "Nov", "Dec" };
		ArrayList<String> arl = new ArrayList<String>();
		for(String str :inputList )
		{
			arl.add(str);
						
		}
		
		Collections.sort(arl);
	System.out.println(arl);
	}
	
	
	
}
