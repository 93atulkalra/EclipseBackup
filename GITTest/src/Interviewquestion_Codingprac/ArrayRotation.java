package Interviewquestion_Codingprac;

public class ArrayRotation {

	
	public static void main(String[] args) {
		
			int arr[] = {1,2,3,4,5,6,7};
			char ch [] = {'a','b','c'};
			
			int temp;int n = arr.length;
		int num =2;
			while(num>0)
			{
			for(int i =0;i<n-1;i++)
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
			
			num--;
			}
			
			
		//	for(int j =0;j<n;j++)
				//System.out.print(arr[j]+ "  ");
	
	char ct ; int l =ch.length;
	
int y =3;
	while(y>0)
	{
		for(int k =0;k<l-1;k++)

	{
		ct = ch[k];
		ch[k]=ch[k+1];
		ch[k+1]= ct;
		
		
		
	}
		y--;
	}
	
for(int p =0;p<l;p++)
System.out.print(ch[p]+ "  ");
	
	} 
	
}
