package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExAnnotations {

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before method will execute every @Test method before");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After method will execute every @Test method after");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test will execute every Test Tag before which is mentioned in XML");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After Test will execute every Test Tag After which is mentioned in XML");
	}
	
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class will execute every class before");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("After class will execute every class after");
	}
	
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite will execute only once i.e before suite tag from XML");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite will execute only once i.e After suite tag from XML");
	}
	
	
}
