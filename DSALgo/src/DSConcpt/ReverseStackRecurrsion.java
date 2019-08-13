package DSConcpt;

import java.util.Stack;

public class ReverseStackRecurrsion {

static	int sizest;
	static void reverseStack(Stack<Integer> stc)
	{
		if(sizest>0)
		{
		Integer y = (Integer) stc.pop();
		stc.push(y);
		sizest = sizest-1;
		reverseStack(stc);
		}
		
		
		else
		{
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Stack<Integer> stck = new Stack<Integer>();
		for(int i =1;i<6;i++)
		{
			stck.push(i);
		}
		
		
		
		sizest = stck.size();
		System.out.println("The reversal of Sack is as follow");
		
		reverseStack(stck);
		
		
		for(int i = 1; i < 6; i++) 
        { 
            Integer y = (Integer) stck.pop(); 
            System.out.println(y); 
        } 		
		
		
		
		
		
		
		
	}
	
}
