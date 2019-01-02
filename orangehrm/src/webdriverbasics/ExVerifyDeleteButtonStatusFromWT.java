package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExVerifyDeleteButtonStatusFromWT {

	public static void main(String args[]) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");

		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");

		driver.findElement(By.id("btnLogin")).click();

		List<WebElement> chkboxes = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr/td[1]"));
		int count=0;

		for (WebElement chkbox:chkboxes) {
			if (chkbox.isSelected()) {
				count++;
			}
		}

		if (count==0) {
			boolean btnStatus = driver.findElement(By.xpath(".//*[@id='btnDelete']")).isEnabled();

			if (!btnStatus) {
				System.out.println("Button is Disabled-->Test Pass");
			} else {
				System.out.println("Button is Enabled-->Test Fail");
			}
		}

	}
}
