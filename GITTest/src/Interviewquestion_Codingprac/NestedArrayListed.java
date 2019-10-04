package Interviewquestion_Codingprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class NestedArrayListed {
	
	//MinimumStepsforproductofArrayMinimumStepsforproductofArray
	public static void main(String[] args) {
		
		
		
		
		ArrayList<ArrayList> ls  = new ArrayList<ArrayList>();
		
		ArrayList ls1  = new ArrayList();
		ls1.add(1);
		ls1.add(2);
		ls1.add(3);
		ArrayList ls2 = new ArrayList();
		ls2.add(4);
		ls2.add(6);
		ls2.add(5);
		
		System.out.println("list 1 ->" + ls1);
		System.out.println("list 2 ->" + ls2);
		
		ls.add(ls1);
		ls.add(ls2);
		System.out.println("Final list  ->" + ls);
		
		Iterator itr = ls.iterator();
		
		
			for(int i =0;i<ls.size();i++)
			{	
				for(int j=0;j<ls.get(i).size();j++)
				{	
				
				System.out.println(ls.get(i).get(j));
				}
				
			}
		
		
		
			}  // Main Method ends here
	

}
