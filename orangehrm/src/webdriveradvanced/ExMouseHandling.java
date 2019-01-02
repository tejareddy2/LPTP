package webdriveradvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExMouseHandling {

	public static void main(String args[]) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");

		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");

		driver.findElement(By.id("btnLogin")).click();

		WebElement empInfo = driver.findElement(By.xpath(".//*[@id='employee-information']/a"));

		Actions actions = new Actions(driver);

		actions.moveToElement(empInfo).build().perform();

		WebElement tipMsg = driver.findElement(By.id("tiptip_content"));

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(tipMsg));

		String actualMsg = tipMsg.getText();

		if (actualMsg.equals("Hide Options")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}

	}
}
