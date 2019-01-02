package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExMultiDropDown {
	public static void main(String args[]) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).clear();

		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");

		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");

		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']")).click();

		driver.findElement(By.xpath(".//*[@id='menu_admin_Job']")).click();

		driver.findElement(By.xpath(".//*[@id='menu_admin_workShift']")).click();

		driver.findElement(By.xpath(".//*[@id='btnAdd']")).click();

		driver.findElement(By.id("workShift_name")).sendKeys("Night");

		driver.findElement(By.id("workShift_hours")).sendKeys("8");
		
		
		Select availEmp=new Select(driver.findElement(By.id("workShift_availableEmp")));
		
		
		
		availEmp.selectByVisibleText("Harish Reddy");
		
		availEmp.selectByValue("259");
		
		
		//availEmp.deselectByValue("259");
		
		
		//availEmp.deselectAll();
		
		//availEmp.isMultiple();
		
		
		
		
		

	}
}
