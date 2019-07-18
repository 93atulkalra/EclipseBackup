package Interviewquestion_Codingprac;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RepetionLetterAscendingOrder {
	
	
	public static void main(String[] args) {
		
		String myTwo[][] = new String[5][2];
		String givenString="sunnywwkksk";
		String outputString="nwk";
		HashMap hashmp = new HashMap();
		
		
		
		int length = givenString.length();
		int count,max;
		
		for(int i=0;i<length;i++)
			
		{
			count =0;
			for(int j=0;j<length;j++)
				{
				if(givenString.charAt(i)==givenString.charAt(j))
					{
					count++;
				
					}
			
			
				}

			if(count>1)
			{
				
				hashmp.put(givenString.charAt(i),count);
			}
		}
		
		System.out.println(hashmp);
		
			Set ash = hashmp.entrySet();
			Iterator itr = ash.iterator();
			
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
