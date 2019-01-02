package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage {

	
	@FindBy(xpath=".//*[@id='menu_admin_viewAdminModule']")
	private WebElement adminLink;
	
	@FindBy(xpath=".//*[@id='menu_admin_UserManagement']")
	private WebElement useMgmtLink;
	

	@FindBy(xpath=".//*[@id='menu_admin_viewSystemUsers']")
	private WebElement usersLink;
	
	@FindBy(xpath=".//*[@id='btnAdd']")
	private WebElement addBtn;
	
	@FindBy(xpath=".//*[@id='systemUser_userType']")
	private WebElement userRoleDrpDwn;
	
	@FindBy(xpath=".//*[@id='systemUser_employeeName_empName']")
	private WebElement empNameTxtBox;
	
	@FindBy(xpath=".//*[@id='systemUser_userName']")
	private WebElement userNameTxtBox;
	
	@FindBy(xpath=".//*[@id='systemUser_status']")
	private WebElement statusDrpDwn;
	
	@FindBy(xpath=".//*[@id='systemUser_password']")
	private WebElement passwordTxtBox;
	
	@FindBy(xpath=".//*[@id='systemUser_confirmPassword']")
	private WebElement confirmPasswordTxtBox;
	
	@FindBy(xpath=".//*[@id='btnSave']")
	private WebElement saveBtn;
	
	

	
}
