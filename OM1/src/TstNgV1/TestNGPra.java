package TstNgV1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGPra 

{
	@BeforeMethod(firstTimeOnly=true)
	public void BM()
		{
		System.out.println("Inside Before method");
		}
	@Test(invocationCount=2)
	
	public void Tc11()
			{
        long id = Thread.currentThread().getId();
		System.out.println("Test 11");
		 System.out.println("Simple test-method four. Thread id is: " + id);
			}
	
}
