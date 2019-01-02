package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyFooterText {

	public static void main(String args[]) {
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		String actualFooterText = driver.findElement(By.id("spanCopyright")).getText();

		if (actualFooterText.equals("OrangeHRM ver 3.0.1 © OrangeHRM Inc. 2005 - 2018 All rights reserved.")) {
			System.out.println("Displaying Footer text as expected:" + actualFooterText + "-->Test Pass");
		} else {
			System.out.println("Displaying Footer text as not expected:" + actualFooterText + "-->Test Fail");
		}
	}
}
