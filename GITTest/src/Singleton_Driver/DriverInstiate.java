package Singleton_Driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class DriverInstiate {

	private static DriverInstiate DriverInstiateRef = null; 
public static	WebDriver driver;
	public static DriverInstiate driverGetInstance()
	{
		if(DriverInstiateRef==null)
			DriverInstiateRef = new DriverInstiate();
		
		return DriverInstiateRef;	
	}
	
	public WebDriver openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");  
		driver = new FirefoxDriver();
		return driver;
	}
	private DriverInstiate()
	{
		
	}
		
		
	} // Class ends
