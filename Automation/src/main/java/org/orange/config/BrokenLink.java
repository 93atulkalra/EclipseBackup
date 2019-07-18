package org.orange.config;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink {

	
	public static int isbrowk(URL url) throws Exception {
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.connect();
		int res = con.getResponseCode();
		con.disconnect();
		System.out.println(res);
		
		
		
		return 0;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allList = driver.findElements(By.xpath("//a"));
		
		for(WebElement ele : allList)
		{
			isbrowk(new URL(ele.getAttribute("href")));
			
			
		}
		
		
	}
}
