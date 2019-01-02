package com.orangehrm.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	private WebDriver driver;
	
	public BasePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void switchWindow(String title){
		String mainWindow = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();

		for (String currentWindow : allWindows) {
			if (!currentWindow.equals(mainWindow)) {
				driver.switchTo().window(currentWindow);
				if (driver.getTitle().equals(title)) {
					break;
				}
			}
		}
	}

}
