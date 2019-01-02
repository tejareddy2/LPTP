package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExVerifyAddEmployeeRecordInWT {
	public static void main(String args[]) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");

		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");

		driver.findElement(By.id("btnLogin")).click();

		/*driver.findElement(By.linkText("Add Employee")).click();

		driver.findElement(By.id("firstName")).sendKeys("Rahul");

		driver.findElement(By.id("lastName")).sendKeys("Reddy");*/

		//String expectedEmpId = driver.findElement(By.xpath(".//*[@id='employeeId']")).getAttribute("value");

		String expectedEmpId = "0274";
		
		/*driver.findElement(By.id("btnSave")).click();*/

		driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']")).click();

		List<WebElement> empIds = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr/td[2]"));

		String actualEmpId = null;

		boolean status = false;

		for (WebElement empId:empIds) {

			actualEmpId = empId.getText();
			if (actualEmpId.equals(expectedEmpId)) {
				status = true;
				break;
			}

		}

		if (status) {
			System.out.println("Actual EmpId: " + actualEmpId + " is matching with Expected EmpId: " + expectedEmpId
					+ "-->Test Pass");
		} else {
			System.out.println("Actual EmpId: " + actualEmpId + " is not matching with Expected EmpId: " + expectedEmpId
					+ "-->Test Fail");
		}
	}
}
