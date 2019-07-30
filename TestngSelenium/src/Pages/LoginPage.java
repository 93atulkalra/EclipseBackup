package Pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CreateDriver.DriverInstate;

public class LoginPage  {
	
	 WebDriver driver ;
	public LoginPage(WebDriver driver)
	{
this.driver=driver;
		
		
	}
	
	
	public void clickSignIn()
	
	{
		
		
	driver.findElement(By.xpath(DriverInstate.prop_config.getProperty("signin"))).click();
		
		
	}
	

}
