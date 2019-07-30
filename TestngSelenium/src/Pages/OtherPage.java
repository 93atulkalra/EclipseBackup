package Pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OtherPage {

	
	 WebDriver driver ;
	
 
	
	public OtherPage(WebDriver driver)
	{
		this.driver=driver;
		
		
	}
	
	
	public void enterUserName()
	{
		
	driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("abc");
		
	}
}
