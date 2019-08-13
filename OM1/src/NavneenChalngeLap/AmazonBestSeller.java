package NavneenChalngeLap;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonBestSeller {
	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
 
	
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("HeadPhones");

	String headphonescreen = driver.getWindowHandle();
	System.out.println(headphonescreen);
	driver.findElement(By.xpath("//input[@type='submit' and @value='Go']")).click();
	
	//*[contains(text(),'Headphones')]

	List<WebElement> Headphones = new ArrayList<WebElement>();
	
	Thread.sleep(5000);
	Headphones = driver.findElements(By.xpath("//div[contains(@data-cel-widget,'search_result')]//span[text()='Best seller']//following::div[8]"));
	
	System.out.println(Headphones);
	for(WebElement head : Headphones)
		
	{
		System.out.println(head);
		head.click();
		driver.switchTo().window(headphonescreen);
	}
	
	
}
}