package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ValidateAllMonths{
	
  WebDriver driver;
   
  public ValidateAllMonths(WebDriver driver) {
	   this.driver = driver;
	   
   }

//@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	//WebElement USERNAME_FIELD_LOCATOR;
  
  
  
  @FindBy(how = How.NAME, using ="due_month") WebElement MONTHS_LOCATOR;

  public void clickOnDueDt() {
	
	  MONTHS_LOCATOR.click();

  }

public void monthsDropDown() {
	
	Select select = new Select(MONTHS_LOCATOR);
	
	List actual = new ArrayList();
	for(WebElement element: select.getOptions()) {
		
	//System.out.println(element.getText());
		
		actual.add(element.getText());
	}
	
	 List expected = new ArrayList();
	 expected.add("None");
	 expected.add("Jan");
	 expected.add("Feb");
	 expected.add("Mar");
	 expected.add("Apr");
	 expected.add("May");
	 expected.add("Jun");
	 expected.add("Jul");
	 expected.add("Aug");
	 expected.add("Sep");
	 expected.add("Oct");
	 expected.add("Nov");
	 expected.add("Dec");
	 
	 for(int i=0; i < actual.size(); i++ ) {
		 
		 System.out.println("Actual-List : " +actual.get(i)+  "& " +   "expected List: " +expected.get(i));
		  Assert.assertTrue(actual.get(i).equals(expected.get(i)));
	  
	 }
}

}