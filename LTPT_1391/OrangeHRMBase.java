package webdriverwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OrangeHRMBase {

	private WebDriver driver;
	
		
	@BeforeMethod
	public void openApp() {
		String browserName = "chrome";
		if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "..\\orangehrm\\resources\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();

		} else if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "..\\orangehrm\\resources\\chromedriver.exe");

			driver = new ChromeDriver();

		} else {
			System.out.println("Invalid Browser");
		}

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
	}
	

	@BeforeMethod(dependsOnMethods="openApp")
	public void login() {

		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");

		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");

		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("Welcome")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Logout")).click();

	}

	@AfterMethod(dependsOnMethods="logout")
	public void closeBrowser() {
		driver.close();
	}
	
	public WebDriver getDriver(){
		return driver;
	}

}
