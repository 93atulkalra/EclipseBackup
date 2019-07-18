package Interviewquestion_Codingprac;

import java.util.Arrays;

public class max2Values {

	public static void main(String[] args) throws Exception {

		int arry[] = {1,2,3,4,5};
		
		int max=arry[0];
		int smax=arry[0];		
		for(int i=0;i<5;i++)
			
		{
			if(max<arry[i])
				{
				smax=max;
				max=arry[i];
				}
			
				
	}
			
			
	
		System.out.println(max + "valyue " +smax);
		
		
	}
}