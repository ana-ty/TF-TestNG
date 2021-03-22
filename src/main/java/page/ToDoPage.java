package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToDoPage  extends BasePage {

	WebDriver driver;
	
	public ToDoPage(WebDriver driver) {
		this.driver = driver;
		
		
		
	}
	
	
	
	@FindBy(how = How.NAME, using ="categorydata") WebElement CATEGORY_NAME_LOCATOR;
	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/input[2]")  WebElement CATEGORY_NAME_SUBMIT_BUTTON;
	@FindBy(how = How.XPATH, using="//span[text()='First']")
	private WebElement CATEGORY_NAME;
	@FindBy(how= How.LINK_TEXT, using="Yes") WebElement DELETE_CATEGORY_BUTTON;
	
	public void insertCategoryName(String name) {
		CATEGORY_NAME_LOCATOR.sendKeys(name);
		
	}
	
	public void clickOnAddCategoryButton() {
		
		CATEGORY_NAME_SUBMIT_BUTTON.click();
		
	}
	
	
	/*public boolean CategoryDisplayed() {
		getCATEGORY_NAME().isDisplayed();
		waitForElement(driver,15,getCATEGORY_NAME() );
	System.out.println("Category Is Displayed!" +    getCATEGORY_NAME().getText() );
	return true;
		
			
	}*/
		 
	
	
	
	
	public void DeleteDisplayedCategory(){
		getCATEGORY_NAME().click();
		DELETE_CATEGORY_BUTTON.click();
		
	}

	public WebElement getCATEGORY_NAME() {
		return CATEGORY_NAME;
	}

	public void setCATEGORY_NAME(WebElement cATEGORY_NAME) {
		CATEGORY_NAME = cATEGORY_NAME;
	}
	
}


