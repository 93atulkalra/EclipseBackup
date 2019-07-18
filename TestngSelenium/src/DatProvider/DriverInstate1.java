package DatProvider;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPage;

    public class DriverInstate1 {
	public WebDriver driver;
	public LoginPage loginpg;
	
	
	@BeforeTest
	public void generateDriver()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    
	 	driver.get("https://www.facebook.com/");
	 	   
	 	System.out.println("In Before Test, Driver instatited"); 	
		
	}
}// Class Ends here