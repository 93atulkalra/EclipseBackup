package Interviewquestion_Codingprac;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

 abstract interface y{
	
}
  class StringNumberLargest {
	
	public static void main(String[] args) {
		
		LinkedList<String> input = new LinkedList<String>();
		input.add("582");
		input.add("60");
		input.add("99");
		
		
		
		Comparator<String> comref = new Comparator<String>()
				{

					@Override
					public int compare(String o1, String o2) {
					
						String xy = o1 +o2;
						String yx = o2+o1;
					
						o1.compareTo(o2);
						if(o1.compareTo(o2)>0)
							return -1;
						else return 1;
						
					}
			
				};
		
				Collections.sort(input, comref);
				System.out.println(input);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 
	

}
