package webdriveradvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExWindowHandling {

	public static void main(String args[]) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		String mainWindow = driver.getWindowHandle();

		driver.findElement(By.xpath(".//*[@id='spanSocialMedia']/a[1]")).click();

		Set<String> allWindows = driver.getWindowHandles();

		for (String currentWindow : allWindows) {
			if (!currentWindow.equals(mainWindow)) {
				driver.switchTo().window(currentWindow);
				if (driver.getTitle().equals("Sign Up | LinkedIn")) {
					driver.findElement(By.xpath(".//*[@id='first-name']")).sendKeys("Vishnu");
					driver.close();
				}
			}
		}
		driver.switchTo().window(mainWindow);
		driver.findElement(By.xpath(".//*[@id='spanSocialMedia']/a[2]")).click();
	}
}
