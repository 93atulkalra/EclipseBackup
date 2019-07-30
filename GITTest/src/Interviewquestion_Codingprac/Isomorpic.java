package Interviewquestion_Codingprac;

public class Isomorpic {

	
	public static void main(String[] args) {
		
		String str1 = "aba";
		String str2 = "cbc";
		
		boolean flag = false;
		
		for (int i=0;i<str1.length()-1;i++)
		{
			
			if(str1.charAt(i)==str1.charAt(i+1)&&(str2.charAt(i)==str2.charAt(i+1)))
			{
				System.out.println("match");
				flag = true;
			}
			
			else if(str1.charAt(i)!=str1.charAt(i+1)&&(str2.charAt(i)!=str2.charAt(i+1)))
			{
				System.out.println("match");
				flag = true;
			}
			
			else {flag=false;break;}
		}
		
		System.out.println(flag);
		
	}
}
