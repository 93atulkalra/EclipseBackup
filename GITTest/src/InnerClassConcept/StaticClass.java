package InnerClassConcept;

public class StaticClass {
	
	int x =20;
	static int y =10;
	
	void show()
	{
		System.out.println("outer show");
	}
	
static	void displ()
	{
		System.out.println("outer display");
	}
	
	static class innerstaticclass
		{
		
		int a =25;
		static int b =67;
		static int y=90;
		
		void show()
			{
			
			StaticClass.displ();
		//	StaticClass.show();   This is error
		
			
			System.out.println("in inner show");
			System.out.println(a+"Value" + b);
			
			}
		
		static void displ()
		{
			
			// 	StaticClass.show(); This is error
			
			StaticClass.displ();
		System.out.println("in inner Display");
		
		System.out.println(y);
		
		System.out.println(StaticClass.y);
		//System.out.println(x);
		
		
		}
		
		}  // Inner static class ends
	
	public static void main(String[] args) {
		
		StaticClass obj = new StaticClass();
		//obj.x=40;
	//	System.out.println(obj.x);
		
	//	StaticClass.y=50;
		//System.out.println(StaticClass.y);
		
		// Here we gonna make static inner class
		
		StaticClass.innerstaticclass.displ();
//		StaticClass.innerstaticclass.b=202;  This is valid 
		
		StaticClass.innerstaticclass objinner = new StaticClass.innerstaticclass();
		
		objinner.show();
//		objinner.a =90;  This is valid statement
		
		
		
		
		
	}
	
	

}
