package Interviewquestion_Codingprac;

public class SubarraySum {

	public static void main(String[] args) {
		//1 2 3 4 5 6 7 8 9 10
		int inputArray[] = {1,2,3,4,5,6,7,8,9,10};
		int desiredSum = 15;
		int flag =0;
	
		for (int i =0;i<inputArray.length-1;i++)
		{
		 
						
			int sum =inputArray[i];
				for (int j =i+1;j<inputArray.length;j++)
				{
					sum = sum + inputArray[j];
					
					if(sum==desiredSum)
					{ i=i+1;
					  j=j+1;	
						System.out.println("Index i" +i +" Index j" + j);
						flag = 1;
						break;
					}
				} // Loop for j ends
			
				if(flag ==1)
					break;
		} // Loop for i ends
		
	} 	// Main ends

} // Class ends
