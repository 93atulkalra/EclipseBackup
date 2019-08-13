package AutomationSrc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassConcecpt {

	void sum()
	{}
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");  
	WebDriver	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Robot rob = new Robot();
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_T);
	Actions act = new Actions(driver);
	
	//driver.switchTo().activeElement();
	
	act.sendKeys("https://www.youtube.com/");
	driver.close();rob.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	driver.close();
	driver.close();
	
	
	}
}
