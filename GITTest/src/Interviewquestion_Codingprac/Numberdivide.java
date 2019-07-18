package Interviewquestion_Codingprac;

  interface my
{
	
}


public  class Numberdivide {

	
	public static void main(String[] args) {
		
		int min=2000,max=5000;
		String output="";
		
		for(int j=2000;j<=2100;j++)
			
		{
			if((j%5==0) && (j%7!=0))
			
			{
				output= output +Integer.toString(j);
			output=output+",";
							
			}
			
		}
		
		output=output.substring(0, output.length()-1);
		System.out.println(output);
		
	}
}
