package AutomationSrc;

interface mys {
	
	 static final int x=10;
}

abstract class Parent implements mys{
	
	
	Parent()
	{
		
		System.out.println("in parentcons");
		
	}
	
	
	   void show()
	{
		System.out.println("In show-parent");
	}
	  
	  void display()
		{
			System.out.println("In display aprent");
		}
public static void main(String[] args) {
	System.out.println("in manin");
}

}

public class Child extends Parent  {
	
	
	final int x;
	
	Child()
	{
		x=10;
	}
	public static void def() {
		
		System.out.println("in def inter-class");
	}
	
	
		void show()
	{   
		System.out.println("In show-Child");
		
	}
		
		
		

	public static void main(String[] args) {

		
		Parent ch = new Child();
	
	ch.show();
		ch.display();
		
	}

}
