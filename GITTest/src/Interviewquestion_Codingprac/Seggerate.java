package Interviewquestion_Codingprac;

public class Seggerate {
	
	public static void main(String[] args) {
		
		int inp[] = {0,1,1,0,0,1,1};
		
		int count=0;
		System.out.println(count);
		for(int i=0;i<inp.length;i++)
			
		{
			if (inp[i]==0)
				count=count +1;
		}
		
		System.out.println(count);
		
		int one = inp.length - count;
		
		System.out.println(one);
		
		for (int k = 0; k<inp.length; k++)
		{
			if(k < count )
				inp[k]=0;
			
			else inp[k]=1;
				
			
		}
			
		for (int u = 0; u<inp.length; u++)
		{
			System.out.print(inp[u]);
				
			
		}
		
	}

}
