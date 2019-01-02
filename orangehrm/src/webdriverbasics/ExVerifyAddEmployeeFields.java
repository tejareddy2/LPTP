package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExVerifyAddEmployeeFields {

	public static void main(String args[]) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("Vishnu");

		driver.findElement(By.id("txtPassword")).sendKeys("Vishnu");

		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("Add Employee")).click();

		driver.findElement(By.id("firstName")).sendKeys("Rahul");

		driver.findElement(By.id("lastName")).sendKeys("Reddy");

		WebElement createLoginChkBox = driver.findElement(By.id("chkLogin"));

		createLoginChkBox.click();

		if (createLoginChkBox.isSelected()) {
			System.out.println("Check box is Selected-->Test Pass");

			WebElement userNameTxtBox = driver.findElement(By.id("user_name"));
			if (userNameTxtBox.isDisplayed()) {
				System.out.println("UserName Text  box is Displayed-->Test Pass");
				userNameTxtBox.sendKeys("Rahul");
				WebElement passwordTxtBox = driver.findElement(By.id("user_password"));
				if (passwordTxtBox.isDisplayed()) {
					System.out.println("Password Text  box is Displayed-->Test Pass");
					passwordTxtBox.sendKeys("Rahul1");
					WebElement repasswordTxtBox = driver.findElement(By.id("re_password"));
					if (repasswordTxtBox.isDisplayed()) {
						System.out.println("rePassword Text  box is Displayed-->Test Pass");
						repasswordTxtBox.sendKeys("Rahul1");
						WebElement statusDrpDwn = driver.findElement(By.id("status"));
						if (statusDrpDwn.isDisplayed()) {
							System.out.println("Status DropDown is Displayed-->Test Pass");
							Select dropDown = new Select(statusDrpDwn);
							dropDown.selectByVisibleText("Enabled");
							driver.findElement(By.id("btnSave")).click();
							System.out.println("Successfully Saved Emp Information-->Test Pass");

						} else {
							System.out.println("Status DropDown is not Displayed-->Test Fail");
						}
					} else {
						System.out.println("rePassword Text  box is not Displayed-->Test Fail");
					}
				} else {
					System.out.println("Password Text  box is not Displayed-->Test Fail");
				}

			} else {
				System.out.println("UserName Text  box is not Displayed-->Test Fail");

			}

		} else {
			System.out.println("Check box is not Selected-->Test Fail");
		}

	}
}