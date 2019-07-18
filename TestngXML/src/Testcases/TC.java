package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC extends AfetrBefor  {
	
	@BeforeMethod
	public void before()
	{
		System.out.println("This is Before");
		
	}
	
	@AfterMethod
	public void after()
	{
		System.out.println("This is after");
		
	}
	
	@Test
	public void tc1()
	{
		System.out.println("This is case 1");
	}
	
	
	
	@Test
	public void tc2()
	{
		System.out.println("This is case 2");
	}
	
	
	@Test
	public void tc3()
	{
		System.out.println("This is case 3");
	}

}
