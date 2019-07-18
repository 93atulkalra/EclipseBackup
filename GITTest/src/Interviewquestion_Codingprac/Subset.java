package Interviewquestion_Codingprac;

import java.util.ArrayList;
import java.util.Iterator;

public class Subset {

	public static void main(String[] args) {
		
			
		ArrayList set1 = new ArrayList();
		ArrayList set2 = new ArrayList();
		ArrayList set3 = new ArrayList();
		
		set1.add(1);		set1.add(5);		set1.add(4);		set1.add(6);		set1.add(8);		set1.add(2);		
		set2.add(5);		set2.add(8);		set2.add(7); 
		set3.add(5);		set3.add(8);		set3.add(2);		set3.add(7);
		
		// Set 2 = {5,8,2,9} is a subset of set 1 and set 3
		// set 1 = {1,5,4,6,8,2}	
		// set 3 = {5,8,2,7}
		
		boolean res=false,res1=false;
		for(int i=0;i<set2.size();i++)
			{
				 res = set1.contains(set2.get(i));
				res1 = set3.contains(set2.get(i));
				if(res==false || res1==false)
					break;
				
			}
		
		System.out.println("Set 1 subset result -> "+ res);
		System.out.println("Set 1 subset result -> "+ res1);
		
		//while ()
		
		
	}
	
}
