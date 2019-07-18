package TestAnnotaions;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;


//@Listeners(TestAnnotaions.Listers.class)
public class TestAnno extends BeforeAfterAnn {
	
	
	

	TestAnno()
	{
		System.out.println("in Testanno cons");
		
	}
	
	@Test
	//@Parameters({"url","Browser"})
	public void TestFun()
	{
		
		//System.out.println(url + Browser);
		System.out.println("in test metd 0");
		Assert.assertTrue(false);
	
	
	
	}
	@Test
	public void TestFun1()
	{
		System.out.println("in test metd 1");
	}
	
	@Test
	public void TestFun4()
	{
		System.out.println("in test metd 4");
	}
}
