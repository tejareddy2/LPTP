package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.utilities.Log;

public class AddEmployeePage extends BasePage {
	
	

	private WebDriver driver;

	@FindBy(linkText = "PIM")
	private WebElement pimLink;

	@FindBy(id = "firstName")
	private WebElement firstNameTxt;

	@FindBy(id = "lastName")
	private WebElement lastNameTxt;

	@FindBy(id = "employeeId")
	private WebElement employeeIdTxt;

	@FindBy(id = "btnSave")
	private WebElement saveBtn;

	@FindBy(linkText = "Add Employee")
	private WebElement addEmployeeLink;

	public AddEmployeePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void navigateToPim() {
		pimLink.click();
		Log.info("Successfully navigated to PIM Page");
	}

	public void navigateToAddEmployee() {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addEmployeeLink));
		addEmployeeLink.click();
		Log.info("Successfully navigated to addEmployee Page");
	}

	public String addEmployeeDetails(String fname, String lname) {
		String expectedEmpId = null;
		firstNameTxt.sendKeys(fname);
		lastNameTxt.sendKeys(lname);
		expectedEmpId = employeeIdTxt.getAttribute("value");
		saveBtn.click();
		Log.info("Successfully saved emploee record");
		return expectedEmpId;
	}

}
