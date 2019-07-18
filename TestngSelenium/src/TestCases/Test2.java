package TestCases;

import org.testng.annotations.Test;

import CreateDriver.DriverInstate;

public class Test2 extends DriverInstate {

	
	@Test()
	public void tc2()
	{
		System.out.println("In test 2");
			loginpg.enterUserName("Abc");


	}
	
	
}
