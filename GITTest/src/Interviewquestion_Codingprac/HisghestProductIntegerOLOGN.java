package Interviewquestion_Codingprac;

import java.util.Arrays;

public class HisghestProductIntegerOLOGN {

	public static void main(String[] args) {
		
		
		int[] ar = {1,4,-9,10,-10,13};
		
		int max1,max2,min1,min2;
		
		Arrays.sort(ar);
		
		min1=ar[0];
		min2=ar[1];
		max1=ar[ar.length-1];
		max2=ar[ar.length-2];
		
		
		if(min1*min2 > max1*max2)
		{
			System.out.println("MIN PAIR WINS   "+ min1 +"," + min2);
		}
				
		else
			System.out.println("Max PAIR WINS   "+max1 + ","+ max2);
		
	}
}
