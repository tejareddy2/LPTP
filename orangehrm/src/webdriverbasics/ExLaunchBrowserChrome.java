package webdriverbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExLaunchBrowserChrome {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "..\\orangehrm\\resources\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
	}
}
