package org.tinder.driverinstiation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.tinder.loginpage.Login_SignupPage;

public class DriverInstaite {
	
	 public Properties prop_config;
	 public File file;
	 public FileInputStream fileInputStream;
	 public WebDriver driver ;
	 public Login_SignupPage loginPageObject;
	 public static int pageLoadtime=10;
	
	 @BeforeSuite
	public void openBrowser() throws InterruptedException
		{
		
		 prop_config = new Properties();
		 try {
		 fileInputStream = new FileInputStream(".\\PropertyFiles\\browserDetails.properties");
		 prop_config.load(fileInputStream);
		 }
		 catch(Exception e)
		 {
			 System.out.println("Property FIle for the laoding process not found, exiting the code as intial conition not met");
		 }
		 
		String hs=  prop_config.getProperty("BrowserName");
		System.out.println(hs);
	// To check if the browser you have selected is FIrefox
		if(prop_config.getProperty("BrowserName").toLowerCase().equals("firefox"))
				{
		System.setProperty("webdriver.gecko.driver", ".\\DriverObj\\geckodriver.exe");
		 driver = new FirefoxDriver();
				}
		
		String url=prop_config.getProperty("URL");
		driver.get(url);
		
		
		 loginPageObject = new Login_SignupPage(driver);
		
		
		
		//Thread.sleep(10000);
		//driver.quit();
		}
	 
	
		
		
	
	
	
}
