package Interviewquestion_Codingprac;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String inputString = "i.like.this.program.very.much";
		//String outputString = "much.very.program.this.like.i";
		String result="";
		
		for(String sub : inputString.split("\\."))
		{
		
			if(result.length()!=inputString.length())
			result = sub + "."+result;
		
			
			
		} // For ech loops
		
		System.out.println(result);
	} // main ends
}
