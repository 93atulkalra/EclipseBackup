package DSConcpt;

import java.util.Stack;

public class StackConcept extends RecurssionBacis {

	public static void main(String[] args) {
		
		Stack<Integer> stck = new Stack<Integer>();
		for(int i =0;i<5;i++)
		{
			stck.push(i);
		}
		
		System.out.println("Size" + stck.size());
		for(int i = 0; i < 5; i++) 
        { 
            Integer y = (Integer) stck.pop(); 
            System.out.println(y); 
        } 		
		
		System.out.println("Size" + stck.size());
	}
}
