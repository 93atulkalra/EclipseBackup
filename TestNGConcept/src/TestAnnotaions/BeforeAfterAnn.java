package TestAnnotaions;

import java.lang.reflect.Method;

import org.testng.annotations.*;

public class BeforeAfterAnn {

	
	public  static void screen(Method meth)
	
	{
		System.out.println("in screen Mthod Ref");
	}
	
	
	BeforeAfterAnn()
			{
		System.out.println("in BeforeAfterAnn cons");
			}
	@BeforeMethod(alwaysRun=true)
	public void bm()
	{
		System.out.println("in before");
		
		
	}
	@BeforeSuite(alwaysRun=true)
	public void bm2()
	{
		System.out.println("in before m2");
		
		
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void AF()
	{
		System.out.println("in after");
	}
	
	public static void Screenshot(Method Met) {
		System.out.println("Screenshot code");
	}
	
	
}
