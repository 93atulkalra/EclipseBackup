package org.tinder.loginpage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tinder.driverinstiation.DriverInstaite;

public class Login_SignupPage  {
	
	static WebDriver driver;
	WebDriverWait wait;
	Set<String> allwindow;
	Iterator itr;
	

	
	public Login_SignupPage(WebDriver drv)
	{
		driver = drv;
		
	}

	
	  public void LoginviaFB() throws InterruptedException
	{
		
		Thread.sleep(10000);
		String tinderWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Log in with Facebook']")).click();
		
		
		
		 allwindow = new HashSet<String>();
		 allwindow=driver.getWindowHandles();
		 System.out.println(allwindow);
		 
		  itr = allwindow.iterator();
		 
		  for(String handle: allwindow)
		  			{
		System.out.println(driver.switchTo().window(handle).getCurrentUrl());
			  if(driver.switchTo().window(handle).getCurrentUrl().contains("about"))
			 {  
				 
				
				  driver.switchTo().window(handle);
			    WebDriverWait wait = new WebDriverWait(driver, 30);
			  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='loginbutton']")));
			  	driver.findElement(By.id("email")).sendKeys("atulkalraTestemail@yahoo.com");
			  	driver.findElement(By.id("pass")).sendKeys("TestPwd1!");
			  	driver.findElement(By.xpath("//*[@id='loginbutton']")).click();;
			  	
		  		
			  }
			  			}  // For each
		  
		 
		
		
		
		
	}
	
	
	
	
	

	
	

}
