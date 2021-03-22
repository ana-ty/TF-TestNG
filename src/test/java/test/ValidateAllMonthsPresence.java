package test;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;


import org.testng.annotations.Test;

import page.ValidateAllMonths;
import utill.BrowserFactory;

@Test
public class ValidateAllMonthsPresence {

	WebDriver driver;
	
	public void validateAllMonthsPresence() {
		
		driver = BrowserFactory.init();
		
		 ValidateAllMonths validate_all_months =  PageFactory.initElements(driver , ValidateAllMonths.class );
		
		 validate_all_months.clickOnDueDt();
		 
		// varify all months are there
		 
		 validate_all_months.monthsDropDown();
		 
		 BrowserFactory.tearDown();
	}
	
	
	}



