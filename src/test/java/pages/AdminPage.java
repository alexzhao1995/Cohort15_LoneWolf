package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class AdminPage {
	
	public AdminPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//h6[contains(.,'Admin')]")
	public WebElement adminText;
	
	@FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab --parent']")
	public List <WebElement> adminTabsDrop;
	
	@FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab']")
	public List <WebElement> adminTabsNoDrop;
	
	@FindBy(xpath = "//a[@class='oxd-topbar-body-nav-tab-link']")
	public List <WebElement> qualificationsList;
	
	@FindBy(xpath = "//a[contains(text(),'Skills')]")
	public WebElement skillsButton;

}
