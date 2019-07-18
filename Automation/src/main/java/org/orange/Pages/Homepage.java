package org.orange.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.orange.testbase.TestBase;
import org.testng.annotations.Test;

public class Homepage  extends TestBase {
	
	WebDriver driverh;
	
	public Homepage(WebDriver drv)
	{
		System.out.println(drv);
		System.out.println("in Homepage cons");
		driverh = drv;
		PageFactory.initElements(driver,this);
		System.out.println(prop.getProperty("pageloadtime"));
			}
	
public void clickLogin() throws Exception
	{
System.out.println("In click login");
	System.out.println(driver.getCurrentUrl());

	Robot rob = new Robot();
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_CAPS_LOCK);
	rob.mousePress(InputEvent.BUTTON1_MASK);
	rob.mouseWheel(10);
	
	
	
	}



}



