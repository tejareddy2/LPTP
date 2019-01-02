package webdriveradvanced;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExHandlingWindowObjectUsingAutoIT {

	public static void main(String args[]) throws InterruptedException, IOException {
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");

		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");

		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("Add Employee")).click();

		driver.findElement(By.id("firstName")).sendKeys("Rahul");

		driver.findElement(By.id("lastName")).sendKeys("Reddy");

		driver.findElement(By.xpath(".//*[@id='photofile']")).click();
		

		Runtime.getRuntime().exec("..\\orangehrm\\resources\\FileUpload.exe");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("btnSave")).click();
	}
}
