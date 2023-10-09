package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LandingPage {
	
//	you can have multiple constructors, but they can't have the same signature
	public LandingPage() {
		
//		first parameter is instance of driver, this = instance of page object
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	public WebElement profile;
	
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li")
	public List<WebElement> profileDropdown;	
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	public WebElement profileDropdownTab; 
	
	
	
	
}
