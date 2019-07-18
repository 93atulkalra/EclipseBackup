package Singleton_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
	WebDriver driver;
	
	

	@BeforeSuite
	public void BeforeM()
	{
		
		System.out.println("in before suite");
		DriverInstiate drv = DriverInstiate.driverGetInstance();
	driver=	drv.openBrowser();	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath(""));
	}
	
	
	@Test(groups= {"Gr1,Gr2"})
	public void TestGr()
	{
		System.out.println("in Test Groups");
	}
	
	
		
	

}
