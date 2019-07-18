package AutomationSrc;


import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

 

public class GoogleSearchXpath {



    public static void main(String[] args){  


		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 	driver.get("http://www.google.com/");
        driver.findElement(By.xpath("//input[@type='text' and @title='Search']")).sendKeys("Testing");
       List<WebElement> lp= new ArrayList<WebElement>(); 
        lp =   driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbl1']"));
        
        System.out.println(lp.size());
        
        for (int i =0; i<lp.size();i++)
        {
        	System.out.println(lp.get(i).getText());
        	System.out.println(i);
        }
    
    }
    
}