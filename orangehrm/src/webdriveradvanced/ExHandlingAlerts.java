package webdriveradvanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExHandlingAlerts {

	public static void main(String args[]) {

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://server:8000/SIPS1.0/");

		driver.findElement(By.id("uname")).sendKeys("");

		driver.findElement(By.id("password")).sendKeys("");

		driver.findElement(By.id("button1")).click();

		Alert alert = driver.switchTo().alert();

		String msg = alert.getText();
		if (msg.equals("Fields Should Not Be Left Blank")) {
			System.out.println(msg + " -->Test Pass");
			alert.accept();
		} else {
			System.out.println("Test Fail");
			alert.accept();
		}

	}

}
