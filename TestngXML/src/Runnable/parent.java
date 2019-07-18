package Runnable;

 class Constr {
	
	
	 Constr() throws ArithmeticException
	{
		System.out.println("i const");
		
		int i = 10/0;
			
	}
			
	}



public class parent extends  Constr

{
	
	
	parent()
	{
		
		System.out.println("in oarnet");
		
	}
	public static void main(String[] args) {
		
		parent op = new parent();
		System.out.println("in cc");
		
	
		//	str[i]=(char)((int)str[i]+32);
		
		
	}
}


