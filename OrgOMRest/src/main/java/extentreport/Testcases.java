package extentreport;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ExtenentVersion2.class)
public class Testcases {
	
	
	@Test
	public void TC1_Pass()
	{
		System.out.println("This is passed case");
		
	}
	
	@Test
	public void TC3_Pass()
	{
		System.out.println("This is passed case");
		
	}
	
	

	@Test
	public void TC2_Fail()
	{
		System.out.println("This is failed case");
		Assert.assertTrue(false);
		
		
	}

}
