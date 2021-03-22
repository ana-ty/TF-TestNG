package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.ToDoPage;
import page.ValidateCategoryExist;
import utill.BrowserFactory;

public class ValidateCategoryExistTest {
	
	
	WebDriver driver;

	@Test
	public void UserShouldNotBeAbleToAddExistingCategory() {

		driver = BrowserFactory.init();
		
		
		
		
		ValidateCategoryExist validate_categoryExist =  PageFactory.initElements(driver, ValidateCategoryExist.class);
		
        ToDoPage toDoPage =  PageFactory.initElements(driver, ToDoPage.class);
        
        
		toDoPage.insertCategoryName("Second");
		
		toDoPage.clickOnAddCategoryButton();
		
	 //assert
		 
		 String text = validate_categoryExist.elementExist();
	 
		  //System.out.println(text);
		if(  text == "The category you want to add already exists") {
			
			Assert.assertEquals(text, "The category you want to add already exists");
			
		}
		
		
		 System.out.println("The category you want to add already exists: <duplicated category name>");
		
		BrowserFactory.tearDown();
		
		
	
	}

}

