package Interviewquestion_Codingprac;

import java.util.ArrayList;
import java.util.HashSet;

public class DivisiblityCheck {

	public static void main(String[] args) {
		
		int arr[] = {1,2,1};
		
		HashSet<Integer> res  = new HashSet<Integer>();  
		
		int n = arr.length;
		System.out.println(n);
		for (int i =0;i<n;i++)
		{
			int count =0;
			for (int j =0;j<n;j++)
			{
				
				if(arr[i] % arr[j] ==0)
					
				{
					count++;
					if(count > 1)
						res.add(arr[i]);
				} // if ends
				
				
			} // For inner j ends
		
		} // For outer i ends
		
		
		System.out.println(res);
		
	}
}
