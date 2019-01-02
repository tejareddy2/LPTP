package webdriverwithjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AddEmployee extends OrangeHRMBase{

 	WebDriver driver;

	public AddEmployee(WebDriver driver){
		this.driver=driver;
	}
	
	public void navigateToPim() {

		driver.findElement(By.linkText("PIM")).click();
	}

	public void navigateToAddEmployee() {
		driver.findElement(By.linkText("Add Employee")).click();
	}

	public String addEmployeeDetails() {
		driver.findElement(By.id("firstName")).sendKeys("Ashok");
		driver.findElement(By.id("lastName")).sendKeys("Reddy");

		String expectedEmpId = driver.findElement(By.id("employeeId")).getAttribute("value");

		driver.findElement(By.id("btnSave")).click();
		return expectedEmpId;

		

	}

	public void navigateToEmployeeList() {
		driver.findElement(By.linkText("Employee List")).click();
	}

	public void verifyEmployeeRecord(String expectedEmpId) {
		
		List<WebElement> empList = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr/td[2]"));
		int i;
		String actualEmpId = null;
		boolean result = false;

		for (i = 0; i < empList.size(); i++) {

			actualEmpId = empList.get(i).getText();

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
