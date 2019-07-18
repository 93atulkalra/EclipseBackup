package org.orange.Testcases;

import org.orange.testbase.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.orange.utility.ListnersClass.class)
public class TestHoempage extends TestBase{

	@Test 
	public void TC1(String a , String b)
	{
			System.out.println("in tc1");
	}
	
	
	public void TC2() throws Exception
	{
		System.out.println("in tc2");
	
	}

	
	
	
	
}
