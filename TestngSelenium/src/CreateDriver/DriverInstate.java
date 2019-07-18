package CreateDriver;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.OtherPage;

    public class DriverInstate {
	public WebDriver driver;
	public LoginPage loginpg;
	public OtherPage op;
	
	
	@BeforeTest
	public void generateDriver()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    
	 	driver.get("https://www.facebook.com/");
	 	 loginpg = new LoginPage(driver);
	 	 op		 = new OtherPage(driver); 
		   
	 	System.out.println("In Before Test, Driver instatited"); 	
		
	 	//SearchContext ser = new FirefoxDriver();
	 	
	}
}// Class Ends here