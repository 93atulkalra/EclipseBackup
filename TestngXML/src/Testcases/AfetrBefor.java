package Testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AfetrBefor {
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("This is before suite");
	}

	
	@AfterSuite
	public void asuite()
	{
		System.out.println("This is After suite");
	}
}
