package webdriveradvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String args[]) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://server:8000/SIPS1.0/");

		driver.findElement(By.id("uname")).sendKeys("admin14");

		driver.findElement(By.id("password")).sendKeys("admin14");

		driver.findElement(By.id("button1")).click();

		driver.switchTo().frame("main");

		driver.findElement(By.linkText("Add Agent")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("header");
		
		driver.findElement(By.linkText("Logout")).click();
	}
}
