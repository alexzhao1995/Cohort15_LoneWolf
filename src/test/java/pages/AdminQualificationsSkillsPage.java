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
	
	@FindBy(xpath = "//div[text()='Java']/parent::div/preceding-sibling::div//span")
	public WebElement javaCheckbox;
	
	@FindBy(xpath = "//span[text()='(1) Record Selected']")
	public WebElement recordSelecteText;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")
	public WebElement deleteSelectedButton;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--card-title']")
	//p[text()='Are you Sure?']
	public WebElement areYouSureText;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--card-body']")
	public WebElement areYouSureMessage;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	public WebElement yesDeleteButton;
	
	@FindBy(xpath = "//div[@id='oxd-toaster_1']")
	public WebElement successPopup;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-title oxd-toast-content-text']")
	public WebElement successText;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
	public WebElement deletedText;
	
}
