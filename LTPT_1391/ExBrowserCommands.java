package webdriverbasics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ExBrowserCommands {

	public static void main(String args[])
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		//driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		
		driver.navigate().to("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		driver.navigate().refresh();
		
		//driver.navigate().back();
		
		
		
		
		driver.close();
		
		//driver.quit();
		
		
		
		
		
	}
}
