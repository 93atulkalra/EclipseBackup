package AutomationSrc;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DescendantConcept {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();

driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

driver.get("file:///C:/Users/WZJS1251/Desktop/test%20(2).html");

List<WebElement> lp= new ArrayList<WebElement>(); 
lp =   driver.findElements(By.xpath("//tbody/tr/descendant::td/a"));
for (int i=0;i<lp.size();i++)
{
	String str= lp.get(i).getText();
	if(str.equalsIgnoreCase("Google"))
	{
		lp.get(i).click();
		
	}
	
	}



}
}