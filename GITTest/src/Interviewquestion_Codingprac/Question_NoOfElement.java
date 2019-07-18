package Interviewquestion_Codingprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Question_NoOfElement {
	
	private static int x=10;
	
	public static void main(String[] args) {
		int count=0;
		
		System.out.println(x);
		
		List<String> al = new ArrayList<String>();
		al.add("l");
		al.add("i");
		al.add("s");
		al.add("t");
		al.add("e");
		al.add("n");
		
		System.out.println(al);
		
		System.out.println(al.size());
		Hashtable<String,Integer> mp = new Hashtable<String,Integer>();
		for(int i=0;i<al.size();i++)
		{   count=0;
		
		
		
		
	if((mp.containsKey(al.get(i)))==false )
{
		for(int j=0;j<al.size();j++)
			{
			
				if(al.get(i)==al.get(j))
					count++;
			
			} // Inner loop ends
			
			mp.put(al.get(i),count); 
}
		} // Outer loop ends
		
		
		System.out.println(mp);
		System.out.println(mp.hashCode());
		
		
		
		
		//655
	}


}
