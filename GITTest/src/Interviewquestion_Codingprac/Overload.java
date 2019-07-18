package Interviewquestion_Codingprac;

import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.yaml.snakeyaml.nodes.MappingNode;

 
abstract class Testintercept {
	
	public  abstract   void abc() ;
	public static void def()
	{
		System.out.println("This is ab func");
		
	}
	
	


}

public  class Overload extends Testintercept  {
	

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("in abc");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("in output");
		Testintercept.def();
		Overload obj = new Overload();
		obj.abc();
		
	
	
	
	}
	
}
