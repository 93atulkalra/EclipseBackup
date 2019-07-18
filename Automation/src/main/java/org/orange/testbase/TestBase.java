package org.orange.testbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.orange.Pages.Homepage;
import org.orange.Pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	static public Properties prop; 
	static public WebDriver driver;
	public LoginPage objLp;
	public Homepage  objhp;
 	
	@BeforeSuite
	 public void TestBaseBeforeMethod()
		{
		try {
		 prop = new Properties();
		 FileInputStream fp = new FileInputStream("C:\\Users\\WZJS1251\\eclipse-workspace\\Automation\\src\\main\\java\\org\\orange\\utility\\config.properties");
		 prop.load(fp);
		// System.out.println(prop.getProperty("url"));
					} // tr y ends
	
	catch(Exception e)
	{
		System.out.println(e);
	} // ends catch block
	
		if(prop.getProperty("browser").equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");  
				driver = new FirefoxDriver();
				driver.get(prop.getProperty("url"));
				//return driver;
				driver.findElement(By.linkText("Create a Page")).click();
			}
			
			
			//driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("pageloadtime")), TimeUnit.SECONDS);
			//System.out.println(driver.getTitle());
			objLp = new LoginPage(driver);
			objhp = new Homepage(driver);
			 
		} // Before function ends	

	@AfterSuite
	public void AfterM()
	{
		System.out.println("Driver Ends");
		
	}
	
}// class ends