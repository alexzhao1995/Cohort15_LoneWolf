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

}
