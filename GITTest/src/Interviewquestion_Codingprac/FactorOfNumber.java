package Interviewquestion_Codingprac;

import java.util.ArrayList;
import java.util.List;

public class FactorOfNumber {
	
	public static void main(String[] args) {
		
		
		List<Integer> arrlis = new ArrayList<Integer>();
		int number =20;
		for(int i=1;i<number; i++)
		{
			if(number%i==0)
				arrlis.add(i);
				
		}
		
		System.out.println(arrlis);
		
	} // Main ends

}
