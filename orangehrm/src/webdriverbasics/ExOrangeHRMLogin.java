package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExOrangeHRMLogin {

	public static void main(String args[]) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).clear();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");
		//driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
		
		
	}
}
