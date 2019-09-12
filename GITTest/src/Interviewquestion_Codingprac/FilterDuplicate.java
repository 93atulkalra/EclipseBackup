package Interviewquestion_Codingprac;

import java.util.ArrayList;

import org.testng.internal.junit.ArrayAsserts;

import com.google.common.base.Function;

import AutomationSrc.ClassClassConcept;
import AutomationSrc.Testbase;

public class FilterDuplicate {
	
	public static void main(String[] args) {
		
		

		
	
	//- Write code to filter duplicate elements from an array and print as a list?
		
		int arr[] = {1,2,3,3,2,4,1,5};  // 3,4
		
		ArrayList<Integer> arrl = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[j]==arr[i])
					{
						flag++;
					}
				}
				
				if((flag>1)&&(!(arrl.contains(arr[i]))))
					arrl.add(arr[i]);
		}
		
		System.out.println(arrl);
		
		
		
		
	

		
		
	}

}
