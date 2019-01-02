package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExVerifyDeleteButtonStatus {

	public static void main(String args[]) {
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");

		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");

		driver.findElement(By.id("btnLogin")).click();

		boolean btnStatus = driver.findElement(By.id("btnDelete")).isEnabled();

		if (btnStatus) {
			System.out.println("Button Enabled");
		} else {
			System.out.println("Button Disabled");
		}
	}
}
