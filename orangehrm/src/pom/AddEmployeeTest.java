package pom;

import org.testng.annotations.Test;

public class AddEmployeeTest extends BaseTest {

	@Test
	public void verifyAddEmployee() throws InterruptedException {

		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.login();
		AddEmployeePage addEmployeePage = new AddEmployeePage(getDriver());
		addEmployeePage.navigateToPim();
		addEmployeePage.navigateToAddEmployee();
		String expectedEmpId = addEmployeePage.addEmployeeDetails();
		EmployeeListPage employeeListpage = new EmployeeListPage(getDriver());
		employeeListpage.navigateToEmployeeList();
		employeeListpage.verifyEmployeeRecord(expectedEmpId);
		loginPage.logout();
	}

}
