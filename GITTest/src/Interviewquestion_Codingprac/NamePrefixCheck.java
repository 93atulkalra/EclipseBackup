package Interviewquestion_Codingprac;

import java.util.Collections;
import java.util.LinkedList;

public class NamePrefixCheck {
public static void main(String[] args) {
	
	LinkedList<String> arr = new LinkedList<String>() ;
	arr.add("John");
	arr.add("Tom");
	arr.add("Alas");
	arr.add("John");
	arr.add("Alas");
	arr.add("John");
	
	LinkedList<String> opt = new LinkedList<String>() ;
	
	int i,j,count=0;
	int prefix =1;
	
	
	for(i=0;i<arr.size();i++)
	{
		count =0;prefix=1;
		if(Collections.frequency(arr,arr.get(i))>1)
		{
			
			for(j=0;j<arr.size();j++)
			{
				if(arr.get(i)==arr.get(j))
				{
					count ++;
					
					if(count>1)
					{
						arr.set(j,arr.get(j).concat(String.valueOf(prefix)));
						prefix++;
					} // Count ends
					
				}  // if == ends
				
				
			}  // j ends
			
			
			
		}  // if frequency ends 
		
		opt.add(arr.get(i));
		
	}
	
	System.out.println(opt);
	
	
	
	
	
}
}
