package AutomationSrc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Scnner  {
	Scnner()
	{}
	
	int abc (int x)
	{
		System.out.println("in int");
		return 0;
	}
	
	int abc (String x)
	{
		System.out.println("in String");
		return 0;
	}
	public static void main(String[] args) {
		
//		Scanner inp = new Scanner(System.in);
//		System.out.println("enter value"); 
//		
//		int i =inp.nextInt();
//		System.out.println(i);
//		
//		
//		System.out.println("Enter string");
//		String po = inp.next();
//		System.out.println("strin was" + po);
//
		
	
		Scnner ui = new Scnner();
		ui.abc(10);
		ui.abc("y");
		
		
		
	}
	
	
}
