package EXRPV;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestNGReportCustomizationClass.class)
public class TestcasesSample {

	@Test
	public void tc1()
	{
		System.out.println("this is tc1 pass");
	}
	

	@Test
	public void tc2()
	{
		System.out.println("this is tc2 fail");
		Assert.assertTrue(false);
	}
	
}
