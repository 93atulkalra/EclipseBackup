package Interviewquestion_Codingprac;

import java.io.IOException;
import java.util.Scanner;
abstract class  parent{
	
	int x =20;
	 void func()
	{System.out.println("Parent");}
	 parent()
	 {
		 System.out.println("in Abstarct");
		 
	 }
	 
	 abstract void dis();
	 
}
class ConsonantsremovalFromString extends parent{
 int x=90;
int y=20;
	private int r=10;
	
	void dis()
	{
		
	}
//	
final	void func() {System.out.println("Final");}
////	
////	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p =new ConsonantsremovalFromString ();
		p.func();
		//ConsonantsremovalFromString c = new parent();
		System.out.println(p.x);
				String str="Atul";
				
	}

}
