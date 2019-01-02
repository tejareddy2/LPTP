package webdriverbasics;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ExLaunchBrowserIE {
public static void main(String args[]) {
		
		System.setProperty("webdriver.ie.driver", "..\\orangehrm\\resources\\IEDriverServer.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
	}
}
