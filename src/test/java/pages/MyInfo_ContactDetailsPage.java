package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MyInfo_ContactDetailsPage {
	
	public MyInfo_ContactDetailsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//h6[contains(.,'Contact Details')]")
	public WebElement contactDetailsText;

	@FindBy(xpath = "//label[contains(text(),'Home')]/parent::div/following-sibling::div/input")
	public WebElement homeNumInput;
	@FindBy(xpath = "//label[contains(text(),'Home')]/parent::div/following-sibling::span")
	public WebElement homeNumErrorText;
	
	@FindBy(xpath = "//label[contains(text(),'Mobile')]/parent::div/following-sibling::div/input")
	public WebElement mobileNumInput; 
	@FindBy(xpath = "//label[contains(text(),'Mobile')]/parent::div/following-sibling::span")
	public WebElement mobileNumErrorText;
	
	@FindBy(xpath = "//h6[contains(.,'Telephone')]/following-sibling::div//div[3]//input")
	public WebElement workNumInput;
	@FindBy(xpath = "//h6[contains(.,'Telephone')]/following-sibling::div//div[3]//span")
	public WebElement workNumErrorText;
	
	@FindBy(xpath = "//label[contains(text(),'Work Email')]/parent::div/following-sibling::div/input")
	public WebElement workEmailInput;
	@FindBy(xpath = "//label[contains(text(),'Work Email')]/parent::div/following-sibling::span")
	public WebElement workEmailErrorText;

	@FindBy(xpath = "//label[contains(text(),'Other Email')]/parent::div/following-sibling::div/input")
	public WebElement otherEmailInput;
	@FindBy(xpath = "//label[contains(text(),'Other Email')]/parent::div/following-sibling::span")
	public WebElement otherEmailErrorText;
}
