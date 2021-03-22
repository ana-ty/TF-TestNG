package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;


import page.ToDoPage;
import utill.BrowserFactory;

public class ToDoTest {
	
	WebDriver driver;

	@Test
	public void UserShouldBeAbleToAddCategory() {

		driver = BrowserFactory.init();
		
		
		
		
		ToDoPage toDoPage =  PageFactory.initElements(driver, ToDoPage.class);
		
		toDoPage.insertCategoryName("First");
		
		toDoPage.clickOnAddCategoryButton();
		
	//	assertion
		
	//  toDoPage.CategoryDisplayed();
		
            System.out.println("Aded Category Displayed Name : " + toDoPage.getCATEGORY_NAME());
		
		
		BrowserFactory.tearDown();
		
		}
	}
	
