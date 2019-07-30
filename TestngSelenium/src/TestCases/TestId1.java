package TestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import CreateDriver.DriverInstate;
import Pages.LoginPage;

public class TestId1 extends DriverInstate {
	
	
	@Test()
	public void tcase1()
	{
		
		driver.getTitle();
		loginpg.clickSignIn();
	}


}

