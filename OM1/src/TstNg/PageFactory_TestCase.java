/*package TstNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.support.PageFactory;
 
import org.testng.annotations.Test;
 
import org.testng.annotations.BeforeMethod;
 
import org.testng.annotations.AfterMethod;
 
public class PageFactory_TestCase {
 
	static WebDriver driver;
 
	Home_PG_POF HomePage;
 
	LogIn_PG_POF LoginPage;
 
  @BeforeMethod
 
  public void beforeMethod() {
 
	  driver = new FirefoxDriver();
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      driver.get("http://www.store.demoqa.com");
 
      HomePage = PageFactory.initElements(driver, Home_PG_POF.class);
 System.out.println(HomePage);
      LoginPage = PageFactory.initElements(driver, LogIn_PG_POF.class);
      WebElement e = driver.findElement(By.xpath("//[@id='email']"));
      e.getAttribute()
 
  }
 
  @Test
 
  public void test() {
 
      HomePage.lnk_MyAccount.click();
 
      LoginPage.LogIn_Action("testuser_1", "Test@123");
 
      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
 
      HomePage.lnk_LogOut.click();
 
  }
 
  @AfterMethod
 
  public void afterMethod() {
 
	  driver.quit();
 
  }
 
}*/