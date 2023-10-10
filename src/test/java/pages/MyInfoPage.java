package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MyInfoPage {
	
	public MyInfoPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//div[@class='orangehrm-tabs-wrapper']")
	public List <WebElement> myInfoTabItem;
	
	@FindBy(xpath = "//h6[contains(.,'Personal Details')]")
	public WebElement personalDetailsText;

}
