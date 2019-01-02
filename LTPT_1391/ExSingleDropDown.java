package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExSingleDropDown {

	
	public static void main(String args[]) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).clear();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");
		
		driver.findElement(By.id("btnLogin")).click();		
		
	
		
		Select jobTitleDrpDwn=new Select(driver.findElement(By.xpath(".//*[@id='empsearch_job_title']")));
		
		
		jobTitleDrpDwn.selectByVisibleText("Architect");
		
		
		//jobTitleDrpDwn.selectByValue("15");
		
		
		//jobTitleDrpDwn.selectByIndex(6);
			
		
		
		
	}
}
