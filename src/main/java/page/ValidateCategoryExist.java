package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateCategoryExist {

WebDriver driver;
	
	public ValidateCategoryExist (WebDriver driver) {
		this.driver = driver;
		
		
		}
	
	@FindBy(how = How.XPATH, using = "/html/body[contains(text(),'The category you want to add already exists: ')]") 
	WebElement ELEMENT_EXIST_LOCATOR;
	

			  
		
			public String elementExist() {
				return ELEMENT_EXIST_LOCATOR.getText();
			}
			
		
	
}
