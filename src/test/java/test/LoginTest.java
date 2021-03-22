package test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utill.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	@Test
	public void loginTest() {
		
	    driver = BrowserFactory.init();
		BrowserFactory.tearDown();
		
	}
	
	public void tearDown() {
		
		
	}

}
