package com.orangehrm.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orangehrm.utilities.Log;

public class LoginPage extends BasePage {
	


	@FindBy(id = "txtUsername")
	private WebElement userNameTxtBox;

	@FindBy(id = "txtPassword")
	private WebElement passwordTxtBox;

	@FindBy(id = "btnLogin")
	private WebElement loginBtn;

	@FindBy(partialLinkText = "Welcome")
	private WebElement welcomeLink;

	@FindBy(linkText = "Logout")
	private WebElement logoutLink;
	
	
	public LoginPage(WebDriver driver){
		super(driver);
	}

	public void login(String uname,String pwd ) {
		try{
			userNameTxtBox.sendKeys(uname);
			passwordTxtBox.sendKeys(pwd);
			loginBtn.click();		
			Log.info("Successfully login into the application");
		}
		catch(NoSuchElementException e){
			Log.error("Failed to identify the locator.Please cross check the locator for any changes "+e.getMessage() );
		}
		catch(Exception e){
			Log.error("Failed to Login "+e.getMessage() );
		}
		
	}

	public void logout() {   		
		try{
			welcomeLink.click();		
			logoutLink.click();
			Log.info("Successfully logout  from the application");
		}
		catch(NoSuchElementException e){
			Log.error("Failed to identify the locator.Please cross check the locator for any changes "+e.getMessage() );
		}
		catch(Exception e){
			Log.error("Failed to Logout "+e.getMessage() );
		}

	}
	
	public void verifyLinks(){
		
	}
	
}
