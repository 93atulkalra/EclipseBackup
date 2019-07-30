package CreateDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.OtherPage;

    public class DriverInstate {
	public static WebDriver driver;
	static public LoginPage loginpg;
	public static OtherPage op;
	public static Properties prop_config;
	public FileInputStream fileInputStream;
	
	@BeforeSuite
	public void DriverInstate() throws Exception
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");
		 driver = new FirefoxDriver();
	    
	 	driver.get("https://in.yahoo.com/");
	 	 loginpg = new LoginPage(driver);
	 	 op		 = new OtherPage(driver); 
	 	 
	 	 prop_config = new Properties();
		 fileInputStream = new FileInputStream("C:\\Users\\WZJS1251\\eclipse-workspace\\EclipseBackup\\TestngSelenium\\src\\Element.properties");
		 prop_config.load(fileInputStream);	 
		 
		   
	 	System.out.println("In Before Test, Driver instatited"); 	
		
	 	//SearchContext ser = new FirefoxDriver();
	 	
	}
}// Class Ends here