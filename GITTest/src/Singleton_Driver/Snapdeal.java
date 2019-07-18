package Singleton_Driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Snapdeal {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");  
	WebDriver	driver = new FirefoxDriver();
	
	driver.get("https://www.snapdeal.com/");
	driver.findElement(By.xpath("//div[@class='header_wrapper']//input")).sendKeys("Nike Shoes");
	driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
	List<WebElement> res = new ArrayList<WebElement>();
	res = driver.findElements(By.xpath("//div[@id='products']//img"));
	//*[@id='products']/section[@data-dppos='2']/div[1]/div[2]/a/picture
	Thread.sleep(1000);
	
	for(WebElement web: res)
	{
		
		System.out.println(web.getAttribute("title"));
	}
	
	
	
	
	
	
	
	}

}
