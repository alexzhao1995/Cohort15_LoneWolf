package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CommonPage {

	public CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);

	}

	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li")
	public List<WebElement> leftMenuBarItem;

	@FindBy(xpath = "//*[contains(@class,'oxd-topbar-body-nav-tab-item')]")
	public List<WebElement> PimTopBar;

	@FindBy(xpath = "//a[contains(@class,'oxd-topbar-body-nav-tab-link')]")
	public List<WebElement> PimConfiguration;

	@FindBy(xpath = "//a[@class='orangehrm-tabs-item']")
	public List<WebElement> PimEmployeeList;
	
	@FindBy(xpath = "//ul[@class = 'oxd-main-menu']/li")
	public List<WebElement> leftTabOptionsMenu;

}
