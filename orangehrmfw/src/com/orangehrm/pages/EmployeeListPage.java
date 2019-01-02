package com.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orangehrm.utilities.Log;

public class EmployeeListPage extends BasePage {
	
	

	@FindBy(linkText = "Employee List")
	private WebElement employeeListLink;
	
	@FindBy(xpath = ".//*[@id='resultTable']/tbody/tr/td[2]")
	private List<WebElement> empListColVal;
	
	public EmployeeListPage(WebDriver driver){
		super(driver);
	}
	
	
	public void navigateToEmployeeList() {
		employeeListLink.click();	
		Log.info("Successfully navigated to Employee List Page");
	}
	
	public String verifyEmployeeRecord(String expectedEmpId) {
		int i;
		String actualEmpId = null;

		for (i = 0; i < empListColVal.size(); i++) {

			actualEmpId = empListColVal.get(i).getText();

			if (actualEmpId.equals(expectedEmpId)) {

				break;
			}
		}
		return actualEmpId;

	}
	
}
