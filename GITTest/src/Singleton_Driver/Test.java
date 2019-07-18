package Singleton_Driver;



 interface my {
	 
	 int yu=20;
 }
 

 public class Test implements my {
	 
	  int Test;
final int ty;
	  Test()
	  {
		  ty=20;
		  System.out.println(yu);
		//  yu =10;
		  System.out.println("Def Constrcutor");
		 
	  }
	  
	  
	  Test(int x)
	  {
		ty=20;
		  System.out.println("in parametr test");

		  
	  }
	  void Test()
	 {
		  
		 Test=10;
		 System.out.println(Test);
	 }
	 
	 
	 
public static void main(String[] args) {
	
	
	System.out.println("This Is jenkin test");
	Test Test = new Test();
	Test Testw = new Test(22);
	
}
}
