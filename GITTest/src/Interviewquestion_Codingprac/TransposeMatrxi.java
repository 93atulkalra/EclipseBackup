package Interviewquestion_Codingprac;

public class TransposeMatrxi {
	
	public static void main(String[] args) {
		int inputmatrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int outputmatrix[][] = new int[3][3];
		
	int i,j;
	
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		
			System.out.print(inputmatrix[i][j]+ " ");
			
		}
		System.out.println("");
	}
		
		System.out.println("");
	
	System.out.println("The transpose");
	
		
	System.out.println("");
		
	
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		
			outputmatrix[j][i] = inputmatrix[i][j];
			
		}
		
	}
		
		
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		
			System.out.print(outputmatrix[i][j]+ " ");
			
		}
		System.out.println("");
	}
		
		
		
	}

}
