package Interviewquestion_Codingprac;

import java.util.Arrays;

public class MinimumNumberOfPlatform {
	
	public static void main(String[] args) {
		
		
		int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
	    int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
	    int n = arr.length; 
	    
	    int result[] = new int[n];
	    int i =0,j=0;
	    
	    for(i=0;i<n;i++)
	    { 
	    	
	    	
	    	for(j=0;j<n;j++)
	    	{
	    		
	    		if((arr[i]<arr[j])&&(dep[i]>arr[j]))
	    		{
	    			result[i]++;
	    		}
	    		
	    		
	    	} // j loop ends
	    	
	    	
	    } // i loop ends
	    
	    
	    
Arrays.sort(result);	    
	    System.out.println(result[n-1]+1);
	} 
	

}
