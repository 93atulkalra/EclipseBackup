package Interviewquestion_Codingprac;

public class FunctionOverload {

	public int func(int a)
	{
		System.out.println("In Integre");
		return 0;
	}
	
	public String func(String a)
	{
		System.out.println("String");
		return null;
	}
	
	
	
	public static void main(String[] args) {
	
		
//		FunctionOverload ui = new FunctionOverload();
//		ui.func(10);
//		
		String t = "atul";
		String q = new String("atul");
		
		
		System.out.println(t.hashCode());
		System.out.println(q.hashCode());
		
		
		if(t.equals(q))	
		System.out.println("equyals");
		
		if (t==q)
			System.out.println("==");
		
		if(t.hashCode()==q.hashCode())
		System.out.println("hascode");
			
	
	
	}
	
	
}
