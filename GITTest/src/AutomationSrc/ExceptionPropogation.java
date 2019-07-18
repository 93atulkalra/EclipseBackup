package AutomationSrc;

public class ExceptionPropogation {
	void top()
	{
		System.out.println("in top before");
		int x=10/0;
		System.out.println("in top after");
	}

	void mid()
	{try {
		top();
	}
	catch(Exception e)
	{
		System.out.println("in mid before");
		e.printStackTrace();
		
	}
		System.out.println("in mid after");
		}

	void bottom()
	{
		try {
		mid();
		}
		catch(Exception ex)
		{
		System.out.println(ex);
			System.out.println("in bottom before");
		System.out.println("in bottom after");
	}	
	}
	
	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		ExceptionPropogation exc=	 new ExceptionPropogation();
		try {
		
			
			exc.bottom();
			System.out.println("Method exes");
		}
		
		catch(Throwable ae)
		{
			System.out.println(ae);
			ae.printStackTrace();
			
		}
		
		finally {
			System.out.println("In final ");
		}
		System.out.println("In End line");
		
	}

}
