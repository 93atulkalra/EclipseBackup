package Interviewquestion_Codingprac;

public class ReverseInteger_MainAsClassName {
	
		public static void main(String[] args) {
			
			int r,sum=0,temp;    
			  int n=453;//It is the number variable to be checked for palindrome  
			  
			  temp=n;    
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   
			 //  System.out.println(r);
			   sum=(sum*10)+r;    
		System.out.println(sum);
			   n=n/10;    
			   System.out.println(n);
			   
			   
			  }    

		System.out.println(sum);
		
		}


}
