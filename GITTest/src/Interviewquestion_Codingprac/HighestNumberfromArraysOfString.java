package Interviewquestion_Codingprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HighestNumberfromArraysOfString {
	
	public static void main(String[] args) {
		
		String arr[] = {"548","60"};
		
		ArrayList<String> lis = new ArrayList<String>();
		lis.add("548");
		lis.add("60");
		
		Comparator<String> col = new Comparator<String>() {

			public int compare(String a , String b) {
				// TODO Auto-generated method stub
				//return 0;
			
			String xy = a+b;
			String yx = b+a;
			
			if(xy.compareTo(yx)>0)
				return -1;
			
			else if (yx.compareTo(xy)<-1)
				return 1;
			
			else return 0;
				
			}

			
			
		};
		
		Collections.sort(lis,col);
		
		System.out.println(lis);
		
	
		
	}

}
