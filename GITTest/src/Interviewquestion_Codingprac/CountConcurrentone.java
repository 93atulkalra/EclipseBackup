package Interviewquestion_Codingprac;

import java.util.HashMap;

public class CountConcurrentone {

	public static void main(String[] args) {
	
		int values[] = {0,0,1,1,1,1,1,0,0,1,1,1,1};
		
		 int maxLength = 0;
	        int tempLength = 0;

	        int intial=0,count =0; 
	        for (int i = 0; i < values.length; i++) {

	            if (values[i] == 1) {
	                tempLength++;
	                
	                if(tempLength==1)
	                	intial=i;
	               
	                
	               
	                	
	            } else {
	                tempLength = 0;
	                intial=0;
	                
	                }

	            if (tempLength > maxLength) {
	                maxLength = tempLength;
	                count =intial;
	            }
	        }

	        System.out.println(maxLength);
	        System.out.println(count+1);
		
	
	
}
}
