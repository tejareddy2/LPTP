package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage {

	@FindBy(linkText = "Employee List")
	private WebElement employeeListLink;
	
	@FindBy(xpath = ".//*[@id='resultTable']/tbody/tr/td[2]")
	private List<WebElement> empListColVal;
	
	public EmployeeListPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	public void navigateToEmployeeList() {
		employeeListLink.click();		
	}
	
	public void verifyEmployeeRecord(String expectedEmpId) {		
		int i;
		String actualEmpId = null;
		boolean result = false;

		for (i = 0; i < empListColVal.size(); i++) {

			actualEmpId = empListColVal.get(i).getText();

			if (actualEmpId.equals(expectedEmpId)) {
				result = true;
				break;
			}
		}

		if (result) {

			System.out.println(actualEmpId + " is matching with " + expectedEmpId + "-->Test Pass");

		} else {

			System.out.println(actualEmpId + " is not matching with " + expectedEmpId + "-->Test Fail");

		}
	}
	
}
