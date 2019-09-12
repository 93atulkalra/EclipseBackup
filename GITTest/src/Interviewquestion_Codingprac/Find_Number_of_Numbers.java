package Interviewquestion_Codingprac;

public class Find_Number_of_Numbers {
	
	public static void main(String[] args) {
		int Arr[]={11,12,13,14,15};
		char k ='1';
		
		int count =0;
		String temp="";
	
	
		for(int i =0;i<Arr.length;i++)
			
		{
		
				temp = String.valueOf(Arr[i]) + temp;
			} // Loops ends

	            // error, 4 bytes to 2 bytes
	 
	 
	  
for(int j =0;j<temp.length();j++)
			
		{
	if(temp.charAt(j)==k)
		count++;
		}

System.out.println(count);
//temp.trim();

StringBuffer s = new StringBuffer( "");
s.append("I Java");

System.out.println(s);
System.out.println(s.length());
System.out.println(s.capacity());
		
	}

}
