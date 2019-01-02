package webdriverwithjava;

import org.testng.annotations.Test;

public class OrangeHRMMain extends OrangeHRMBase{

	@Test(priority=2)
	public void verifyAddEmployee() throws InterruptedException {

		// Add Employee

		
		AddEmployee addEmployee = new AddEmployee(getDriver());
		addEmployee.navigateToPim();
		addEmployee.navigateToAddEmployee();
		String expectedEmpId = addEmployee.addEmployeeDetails();
		addEmployee.navigateToEmployeeList();
		addEmployee.verifyEmployeeRecord(expectedEmpId);
	}

	//@Test(priority=1)
	/*public void verifyEditEmployee() throws InterruptedException {

		// Edit Employee

		AddEmployee addEmployee = new AddEmployee();
		addEmployee.navigateToPim();
		addEmployee.navigateToAddEmployee();
		String expectedEmpId = addEmployee.addEmployeeDetails();
		addEmployee.navigateToEmployeeList();
		addEmployee.verifyEmployeeRecord(expectedEmpId);

	}*/
}
