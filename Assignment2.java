package webdriverbasics;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {
	public static void main(String[] args){
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/div[2]/input")).sendKeys("Vishnu");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/div[3]/input")).sendKeys("Vishnu");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/div[5]/input")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/ul/li/a/b")).click();
		driver.findElement(By.xpath("//*[@id='menu_admin_Job']")).click();
		driver.findElement(By.xpath("//*[@id='menu_admin_viewJobTitleList']")).click();
		driver.findElement(By.xpath("//*[@id='btnAdd']")).click();
		driver.findElement(By.xpath("//*[@id='jobTitle_jobTitle']")).sendKeys("employee");
		driver.findElement(By.xpath("//*[@id='jobTitle_jobDescription']")).sendKeys("Description");
		driver.findElement(By.xpath("//*[@id='jobTitle_note']")).sendKeys("note");
		driver.findElement(By.xpath("//*[@id='btnSave']")).click();
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]")).click();
		
	
		
		


		
		
	}

}
