package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import CreateDriver.DriverInstate;
import Pages.LoginPage;

public class TestId1 extends DriverInstate {
	
	@Test(dataProvider="SampleData")
	public void tcase1(String a,String b)
	{
		loginpg.enterUserName(a);
	}


@DataProvider(name="SampleData")
public Object [][] testData()

{
	Object[][] arr = {{"Abc"},{"def"}}; 
	return arr; 
}


}

