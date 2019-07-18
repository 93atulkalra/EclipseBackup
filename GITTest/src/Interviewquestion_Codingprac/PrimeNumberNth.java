package Interviewquestion_Codingprac;

public class PrimeNumberNth {
	
	
	public int primeNo(int n)
		{
	int flag =0;
		
	for(int i=2;i<n;i++)
				{
			if(n%i==0)
			{
				flag =0;
				break;
			}
				
				else 				flag =	1;
				}  // for ends
 			
	return flag;
		
		}

	
	public static void main(String[] args) {
		
		PrimeNumberNth prm = new PrimeNumberNth();
		
		
		int usernum=9;
		int count =1,n=2;
		
		while(count<usernum)
		{
			n=n+1;	
			
			if(prm.primeNo(n)==1)
			{
			count = count+1;	
			}
				
			
		
			System.out.println("N -> " + n + "Count" + count  );
			
		}
		
		System.out.println(n);
		
	}
	
}
