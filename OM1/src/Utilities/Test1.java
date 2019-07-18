package Utilities;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 
{
public static void main(String[] args) throws Exception {
	 
	
	

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.makemytrip.com/");
	System.out.println(driver.getWindowHandle());
	driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).click();
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform(); // to select From city
	System.out.println(driver.getWindowHandle());
	driver.findElement(By.xpath("//td[@fare-date='1537381800000' and @data-month='8']")).click(); // To select dte 
	System.out.println(driver.getWindowHandle());
	driver.findElement(By.xpath("//input[@mt-id='returnDate']")).click(); 
	System.out.println(driver.getWindowHandle());
	
	driver.findElement(By.xpath("//td[@fare-date='1537554600000' and @data-month='8']"));
//	act.moveToElement(tar);
	//driver.findElement(By.xpath("//button[@id='searchBtn']")).click();
	Thread.sleep(10000);
	driver.quit();
	
}
}
