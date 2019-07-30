package Interviewquestion_Codingprac;

public class Amstrom {
public static void main(String[] args) {
	
	int r,sum=0,temp;    
	  int n=371;//It is the number variable to be checked for palindrome  
	  int am=1,prod=0;
	  temp=n;    
	  while(n>0){    
	   r=n%10;  //getting remainder  
	   am = r*r*r;
	   prod = am+prod;
	   
	   System.out.println(r);
	   sum=(sum*10)+r;    
//System.out.println(sum);
	   n=n/10;    
	//   System.out.println(n);
	   
	   
	  }    

//System.out.println(sum);
System.out.println(prod);

	
	
}
}
