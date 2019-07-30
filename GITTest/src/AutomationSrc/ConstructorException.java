package AutomationSrc;

class abc
{
void fun()

{
	
int a =10/0;
}

}

public class ConstructorException extends abc {
	
	ConstructorException() throws Exception
	{
		
		System.out.println("In constructor");
	//	int c =10/0;
		System.out.println("After exception");
		System.out.println("Constrcor execute");
	}
	
	
	void show()	
			{
				System.out.println("in show");
				
			}
	
	public static void main(String[] args) throws Exception {
		
		ConstructorException obj=null;
		try { obj = new ConstructorException();}
		catch(Exception e)
		{
			
		}
		
		System.out.println("After constriutcor, main methdo execute");
		obj.show();
		obj.fun();

		
	}

}
