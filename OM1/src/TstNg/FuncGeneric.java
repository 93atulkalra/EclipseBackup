package TstNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FuncGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	 
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Men shoes");
		
		driver.findElement(By.xpath("//input[@type='submit' and @value='Go']")).click();
		
		
		//
		
/*		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
		wait.withTimeout(2, TimeUnit.SECONDS);
		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>()
		{

			@Override
			public Boolean apply(WebDriver input)
			{
				// TODO Auto-generated method stub
				return null;
			}
	
		} ;
		
		wait.until(function);
	
		
		//
	*/	
	}
}
