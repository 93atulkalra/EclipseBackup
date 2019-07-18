package Pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OtherPage {

	
	WebDriver login_driver ;
	ResourceBundle label;
 
	
	public OtherPage(WebDriver driver)
	{
		login_driver=driver;
		 ResourceBundle rb = ResourceBundle.getBundle("Element");
		 label=rb;
		
	}
	
	
	public void enterUserName(String a)
	{
		
		System.out.println();
	//	login_driver.findElement(By.xpath("//input[@id='email']")).sendKeys(a);
		login_driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("atul");
		
		
	}
}
