package Interviewquestion_Codingprac;

public class KthEllementConsecuetiveSum {
	
	public static void main(String[] args) {
		
		
		int arr[] = { 1, 4, 2, 10, 23, 3, 1, 0, 20 }; 
        int k = 4; 
        int n = arr.length;
        int sum =0;
        
        for(int i =0;i<n;i++)
        {
        	if(i<n-(k-1))
        	{
        	for(int j =i;j<i+4;j++)
        	{
        		
        		sum = sum + arr[j];
        		
        	}
        	System.out.println("I for "+ i +"   "+ sum);
        	sum=0;
        	}
        }
        
	}

}
