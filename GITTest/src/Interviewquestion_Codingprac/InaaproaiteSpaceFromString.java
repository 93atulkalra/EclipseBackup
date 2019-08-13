package Interviewquestion_Codingprac;

public class InaaproaiteSpaceFromString {

	public static void main(String[] args) {
		
		
			String s="   Hello Geeks  Welcome   to  GeeksforGeeks   .    ";
		
		//String s="Geeksfor  Geeks . ";
		System.out.println("The Input String->"+ s);
		//s.replace(' ','');
		s=s.trim();int c=0,jc=0;
		System.out.println("After Trim" +s);

		
		
		String result ="";
		for(int i =0;i<s.length();i++)
			{
			
			if(s.charAt(i)==' ')
			{
				if(s.charAt(i+1)=='.')
				{
					//result = result +s.charAt(i);
				}
				
			}
	
			 if(s.charAt(i)==' ')
				{
					if(s.charAt(i+1)!=' '&&s.charAt(i+1)!='.')
					{
						result = result +s.charAt(i);
					}
					
				}
			
			if(s.charAt(i)!=' ')
		{
			result = result + s.charAt(i);
			
		}
		

		
			} // i ends
			
			
			
		System.out.println(result);
		
	}
}
