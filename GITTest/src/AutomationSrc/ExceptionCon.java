package AutomationSrc;

public class ExceptionCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
int x = 1;
			System.out.println("Before exception");
		if(x==1)
			throw new ArithmeticException();
		
			
			System.out.println("After exception");
			
			}
		
		catch(Exception e)
		{
			System.out.println("In before catch block");
		//main("args");	
		System.out.println("In after catch block");
		}
		
		finally {
			System.out.println("In fianl");
		}

		
		
	}


}
