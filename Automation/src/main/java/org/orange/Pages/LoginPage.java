package org.orange.Pages;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.orange.testbase.TestBase;
import org.seleniumhq.jetty9.util.annotation.Name;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import okhttp3.Interceptor;

interface my{
	
	 int x=10;
	
}

public class LoginPage extends TestBase implements IMethodInterceptor{
	WebDriver driver;
	

@FindBy(xpath="//input[@id='email']")
WebElement userName;


@FindBys({
		
			@FindBy(xpath="//input[@id='email']"),
			@FindBy(xpath="//input[@id= 'pass']")
		
		})
 List <WebElement> arrr = new ArrayList<WebElement>();





	public LoginPage(WebDriver drv)
	{	System.out.println(my.x);

		driver = drv;
		PageFactory.initElements(driver,this);
		FluentWait flw = new FluentWait(driver);

		

		
	}
	
public void userName()
	{
	System.out.println(arrr.size());
	System.out.println("in suername");
	System.out.println(driver.getTitle());
	Actions act = new Actions(driver);
	act.click();
//	File ghl;
	
//File f = driver.getScreenShotAs(OutputType.FILE);
	}
	

public void userNameDP(String a , String b)
{
System.out.println("in suername");
System.out.println(driver.getTitle());
userName.sendKeys(a);


}

public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
	// TODO Auto-generated method stub
	return null;
}

	
	
}
