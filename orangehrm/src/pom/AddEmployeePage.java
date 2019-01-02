package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

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
	
	public AddEmployeePage(WebDriver driver){
		PageFactory.initElements(driver, this);	
	}
	

	public void navigateToPim() {

		pimLink.click();
	}

	public void navigateToAddEmployee() {
		addEmployeeLink.click();
	}

	public String addEmployeeDetails() {
		String expectedEmpId = null;
		firstNameTxt.sendKeys("Ashok");
		lastNameTxt.sendKeys("Reddy");
		expectedEmpId = employeeIdTxt.getAttribute("value");
		saveBtn.click();
		return expectedEmpId;
	}
	
}
