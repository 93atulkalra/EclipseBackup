package Utilities;

import java.util.Arrays;

public class Stringmatching 
{
	public static void main(String[] args)
	{
		
	Boolean Flag=false;
	String S1 = "Dormitory";
	String S2 = "Dirty room";
int count1[] = new int[9];
int count[] = new int[9];
	S2 = S2.replace(" ", "");
	

	
	for (int i=0;i<S1.length();i++)
{
	count[i] = S1.charAt(i);
	count1[i] = S2.charAt(i);
	for (int j=0;j<S2.length();j++)
	{ 
		
			if(	S1.charAt(i)==(S2.charAt(j)))
		{
				
			Flag = true;
			//System.out.println("Found");
			break;			
		}
		
		else 
			Flag = false;
			
	}
	if (Flag==false)
	break;
} // Loops ends
	
	System.out.println(Flag);
	
	Arrays.sort(count);
	Arrays.sort(count1);
	for ( int l=0;l<9;l++)
	{ 
		System.out.print(count[l]);
	}
	

	System.out.println();
	for ( int l1=0;l1<9;l1++)
	{ 
		System.out.print(count1[l1]);
	}
	
	}// Main Ends here 
	
	
}// Class Ends
