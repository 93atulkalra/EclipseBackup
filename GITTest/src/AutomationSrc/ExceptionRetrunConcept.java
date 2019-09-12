package AutomationSrc;

import java.io.FileInputStream;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class ExceptionRetrunConcept {
	
	int func() 
	{
		try { 
			//java.io.File f = new java.io.File("");
		//FileInputStream fs = new FileInputStream(f);
			return 9;
		
		}
		
		catch(Exception e)
		{
			System.out.println("in catch");
		//	return 10;
		}
		
		
		finally {
		System.out.println("resuming");
	//	return 0;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		ExceptionRetrunConcept ob = new ExceptionRetrunConcept();
		 System.out.println(ob.func());
	//	System.out.println(y);
		
		
	}

}
