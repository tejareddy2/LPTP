package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
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

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	public WebDriver getDriver() {
		return driver;
	}
}
