package Interviewquestion_Codingprac;

public class MinimumCostinMultiDimAraay {

	
	
	public static void main(String[] args) {
		
		int arr[][]= {{1,1,4},{2,3,1},{1,4,2}};
		
		int i=3,j=3;
		
		for(i=0;i<3;i++)
				{
		
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			
					System.out.println("");
				}
		
		
		
		int temp[]= {arr[0][0],arr[0][1],arr[0][2]};
		
		
		
		for(j =0;j<3;j++)
		{
			for(i=0;i<3;i++)
				
			{
				if(temp[j]>arr[i][j]  )
				
				{	
				
						temp[j]=arr[i][j];
					
				}
			}
		}
		
		
		System.out.println("The output array is");
		
		for(i=0;i<3;i++)
			System.out.println(temp[i]);
		
		
		
		
		
		
	}
	
}
