package Interviewquestion_Codingprac;

 public class MysteryNumberSumReverse {
	
	static int reverse(int num)
	{
		
		//int num =129;
	int rem =0;
	int div=0;
	int rev =0;
	while(num>0)
	{
		rem = num%10;
		num = num/10;
		rev = rev*10 + rem;
		
		
		
		
	} // While Ends
	
	return rev;
	
	}
	
	
	public static void main(String[] args) {
		
		int num =121;
		int temp=num-1;
		System.out.println(reverse(num));
		
		for(int i =1;i<num;i++)
		{
				if(reverse(i)==temp)
				{
					System.out.println("Is Mystery Number");
					System.out.println("Two combinations are" + i +"...."+ temp);
					break;
					
					
				}
				
				temp--;
			
			
			
		}
		
		
		
		
	}

}
