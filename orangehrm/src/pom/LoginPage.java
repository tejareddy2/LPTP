package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	

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
		PageFactory.initElements(driver, this);
	}

	public void login() {
		userNameTxtBox.sendKeys("Vishnu");
		passwordTxtBox.sendKeys("Vishnu");
		loginBtn.click();
	}

	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		welcomeLink.click();
		Thread.sleep(2000);
		logoutLink.click();

	}
}
