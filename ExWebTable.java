package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExWebTable {

	public static void main(String args[]) {

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");

		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");

		driver.findElement(By.id("btnLogin")).click();

		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));

		System.out.println(rows.size());

		for (int i = 1; i <= rows.size(); i++) {

			List<WebElement> cols = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr[" + i + "]/td"));
			for (int j = 1; j <= cols.size(); j++) {
				String cellData = driver
						.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr[" + i + "]/td[" + j + "]")).getText();

				System.out.print(cellData  + "   ");
			}
			System.out.println();

		}

	}
}
