package Interviewquestion_Codingprac;

import java.util.Scanner;

public class Power2N {

	
	public static void main(String[] args) {
		double x =128;double value=0;
		
		
		
		
		int flag=0;
		for(double i=1;i<Math.sqrt(x);i++)
		{
			double y =Math.pow(2, i);
		
		if(x==y)
			{
			
			flag =1;
			value=i;
			break;
		}	
		
		else flag=0;
		
		
		}
		
		if(flag ==1)
		System.out.println("Found at " + (int)value);
		else
			System.out.println("Not found");
	}
}
