package Interviewquestion_Codingprac;

import java.util.HashMap;

public class NoOfReptitionWords {

	public static void main(String[] args) {
		
		String inp ="I love java progmram i java love";
		HashMap hs = new HashMap();
		String str[] = inp.split(" ");
		for(int i=0;i<str.length;i++)
		{
		int count =0;
			
			
				for(int j=0;j<str.length;j++)
				{
			if(str[i].equalsIgnoreCase((str[j])))
				count++;
									
			}
		if(count>1)
				hs.put(str[i], count)	;
		}
		
	
	System.out.println(hs);
	}
}
