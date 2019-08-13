package Interviewquestion_Codingprac;

public class HighestProductIteger {

	public static void main(String[] args) {
		
		int[] ar = {1,4,-9,10,-10};
		int maxpr=1,p=1;
		int fp=0,lp=0;
		for(int i =0;i<ar.length;i++)
		{
			
			for(int j=0;j<ar.length;j++)
				
				
			{
				if(i!=j)
				{
				p=ar[i]*ar[j];
				//System.out.println(p);
				if(p>=maxpr)
					
				{
					
					maxpr=p;
					fp=ar[i];
					lp=ar[j];
				}
				}
			}
		}
		
		System.out.println(maxpr);
		System.out.println(fp+"Pair"+ lp);
		
		
		
	}
}
