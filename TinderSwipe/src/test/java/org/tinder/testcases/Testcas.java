package org.tinder.testcases;

import org.testng.annotations.Test;
import org.tinder.driverinstiation.DriverInstaite;
import org.tinder.loginpage.Login_SignupPage;

public class Testcas extends DriverInstaite {
			
				@Test()
			public void tc1() throws InterruptedException {
					loginPageObject.LoginviaFB();
				
			}
}
