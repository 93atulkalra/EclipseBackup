package org.TestcaseAPI;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class TestExceptiopon {

	
	
	@Test
	public void tc22()
	{
		
		System.out.println("This is TC 22");
	}
	
	@Test
	public void tc23()
	{
		
		System.out.println("This is TC 23");
		
			int i =10/0;
		
			
		
	
			System.out.println("this is 23 cathc ");
		
		
		Assert.assertTrue(true);
		
		
	}
	
	@Test
	public void tc24()
	{
		
		System.out.println("This is TC 24");
	}
	
}
