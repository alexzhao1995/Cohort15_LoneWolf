package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class AdminQualificationsSkillsPage {
	
	public AdminQualificationsSkillsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//h6[contains(.,'Skills')]")
	public WebElement skillsText;

}
