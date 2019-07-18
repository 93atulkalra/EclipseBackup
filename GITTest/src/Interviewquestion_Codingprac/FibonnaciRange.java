package Interviewquestion_Codingprac;

import java.util.ArrayList;

import org.testng.internal.junit.ArrayAsserts;

public class FibonnaciRange {
	
	public static void main(String[] args) {
		
		
		int lowerlimit=100, upperlimit=300;
		int firstfib =0, secondfib=1;
		int sum=0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> resultC = new ArrayList<Integer>();
		resultC.add(firstfib);
		resultC.add(secondfib);
		sum = firstfib + secondfib;
		
		while(sum<upperlimit)
				{
			
			sum = firstfib + secondfib;
			resultC.add(sum);
		if(sum<upperlimit&&sum>lowerlimit)
			result.add(sum);
			
			
			firstfib=secondfib;
			secondfib = sum;
			
			
		} 
		
		System.out.println(resultC);
	System.out.println(result);
	
	
		
	}

}
