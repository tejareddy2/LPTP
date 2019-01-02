package com.orangehrm.tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.utilities.Log;
import com.orangehrm.utilities.ReadFromExcel;
import com.orangehrm.utilities.ReadFromPropertyFile;

public class BaseTest {
	private WebDriver driver;
	
	
	
	@BeforeSuite
	public void initialize() throws IOException{
		
		ReadFromPropertyFile.setUp();
		ReadFromExcel.setupExcel(getProperty("excelPath"),getProperty("sheetName"));
		
		DOMConfigurator.configure("resources\\log4j.xml");
	}

	@BeforeMethod
	public void openApp(Method method){		
		String browserName = getProperty("browserName");
		if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver",getProperty("ieDriverPath"));

			driver = new InternetExplorerDriver();

		} else if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", getProperty("chromeDriverPath"));

			driver = new ChromeDriver();

		} else {
			System.out.println("Invalid Browser");
		}

		driver.manage().window().maximize();
		driver.get(getProperty("url"));
		Log.startTestCase(method.getName());
		Log.info("Successfully lauch the application");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
		Log.info("Successfully close the browser");
		Log.endTestCase();
	}
	
	@BeforeMethod(dependsOnMethods="openApp")
	public void login(){
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.login(getProperty("userName"), getProperty("password"));
	}

	@AfterMethod(dependsOnMethods="closeBrowser")
	public void logout(){
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.logout();
	}
	public WebDriver getDriver() {
		return driver;
	}
	
	public String getProperty(String key){
		return ReadFromPropertyFile.readProperty(key);
	}
	
	
}
