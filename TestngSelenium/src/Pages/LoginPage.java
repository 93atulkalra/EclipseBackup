package Pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	WebDriver login_driver ;
	ResourceBundle label;
 
	
	public LoginPage(WebDriver driver)
	{
		login_driver=driver;
		 ResourceBundle rb = ResourceBundle.getBundle("Element");
		 label=rb;
		
	}
	
	
	public void enterUserName(String a)
	{
		
		System.out.println();
		System.out.println(label.getString("Loginpass"));
		login_driver.findElement(By.xpath("//input[@id='email']")).sendKeys(a);
		//login_driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("atul");
		
		
	}
	

}
