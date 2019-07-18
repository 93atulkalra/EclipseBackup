package org.firstcry;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginHandling {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.firstcry.com/");
	Set str = new HashSet();
	
		 str= 	driver.getWindowHandles();
		 
		 Iterator itr = str.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		
	driver.findElement(By.xpath("//div[contains(@class,'welcome_right_close')]//div")).click();
		
		
	    
	}
}
