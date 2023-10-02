package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginPage {
	
//	you can have multiple constructors, but they can't have the same signature
	public LoginPage() {
		
//		first parameter is instance of driver, this = instance of page object
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement usernameInput;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement passwordInput;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement login;
	
	@FindBy(xpath = "//div[@class='oxd-alert-content oxd-alert-content--error']/p")
	public WebElement invalidCredentialsText;
	
	
	public void loginToHrm(String username, String password) {
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		login.click();
	}

}
