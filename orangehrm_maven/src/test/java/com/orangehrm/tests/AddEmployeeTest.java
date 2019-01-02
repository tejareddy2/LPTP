package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.pages.AddEmployeePage;
import com.orangehrm.pages.EmployeeListPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utilities.Log;
import com.orangehrm.utilities.ReadFromExcel;

public class AddEmployeeTest extends BaseTest {

	@Test
	public void verifyAddEmployee() throws InterruptedException {
		
		
		AddEmployeePage addEmployeePage = new AddEmployeePage(getDriver());
		addEmployeePage.navigateToPim();
		addEmployeePage.navigateToAddEmployee();
		String expectedEmpId = addEmployeePage.addEmployeeDetails(ReadFromExcel.readData(1, 1),
				ReadFromExcel.readData(1, 2));
		EmployeeListPage employeeListpage = new EmployeeListPage(getDriver());
		employeeListpage.navigateToEmployeeList();
		String actualEmpId = employeeListpage.verifyEmployeeRecord(expectedEmpId);
		
		//Assert.assertEquals(status, true, "Emp record doesnot exist");
		Assert.assertEquals(actualEmpId, expectedEmpId,"Actual empId: ["+actualEmpId+"] is not matching with Expected EmpId: ["+expectedEmpId+"]");
		
	}

	
	@Test
	public void verifyAddEmployee1() throws InterruptedException {
		
		
		AddEmployeePage addEmployeePage = new AddEmployeePage(getDriver());
		addEmployeePage.navigateToPim();
		addEmployeePage.navigateToAddEmployee();
		String expectedEmpId = addEmployeePage.addEmployeeDetails(ReadFromExcel.readData(1, 1),
				ReadFromExcel.readData(1, 2));
		EmployeeListPage employeeListpage = new EmployeeListPage(getDriver());
		employeeListpage.navigateToEmployeeList();
		String actualEmpId = employeeListpage.verifyEmployeeRecord(expectedEmpId);		
		//Assert.assertEquals(status, true, "Emp record doesnot exist");
		Assert.assertEquals(actualEmpId, expectedEmpId,"Actual empId: ["+actualEmpId+"] is not matching with Expected EmpId: ["+expectedEmpId+"]");
		
	}
}
