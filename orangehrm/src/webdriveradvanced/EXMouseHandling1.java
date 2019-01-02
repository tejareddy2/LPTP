package webdriveradvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EXMouseHandling1 {
	public static void main(String args[]) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");

		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");

		driver.findElement(By.id("btnLogin")).click();

		WebElement adminLink = driver.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']"));

		WebElement jobLink = driver.findElement(By.xpath(".//*[@id='menu_admin_Job']"));

		WebElement jobTitleLink = driver.findElement(By.xpath(".//*[@id='menu_admin_viewJobTitleList']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(adminLink).moveToElement(jobLink).moveToElement(jobTitleLink).click().build().perform();

	}
}
