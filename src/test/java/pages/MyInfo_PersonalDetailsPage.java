package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MyInfo_PersonalDetailsPage {
	
	public MyInfo_PersonalDetailsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//label[contains(text(),'Full Name')]")
	public WebElement empFullNameText;
	
	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstNameInput;
	
	@FindBy(xpath = "//input[@name='middleName']")
	public WebElement middleNameInput;
	
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastNameInput;
	
	@FindBy(xpath = "//label[contains(text(),'Nickname')]/parent::div/following-sibling::div/input")
	public WebElement nicknameInput;
	
	@FindBy(xpath = "//label[contains(text(),'Employee Id')]/parent::div/following-sibling::div/input")
	public WebElement empIdInput;
	
	@FindBy(xpath = "//label[contains(text(),'License Number')]/parent::div/following-sibling::div/input")
	public WebElement DLNumber;
	
	@FindBy(xpath = "//label[contains(text(),'Expiry')]/parent::div/following-sibling::div//input")
	public WebElement DLExpBox;
	
	@FindBy(xpath = "//li[@class='oxd-calendar-selector-month']")
	public WebElement calendarMonth;
	@FindBy(xpath = "//li[@class='oxd-calendar-dropdown--option']")
	public List <WebElement> months;
	@FindBy(xpath = "//li[@class='oxd-calendar-selector-year']")
	public WebElement calendarYear;
	@FindBy(xpath = "//li[@class='oxd-calendar-dropdown--option']")
	public List <WebElement> years;
	@FindBy(xpath = "//div[@class='oxd-calendar-date']")
	public List <WebElement> dates;
	@FindBy(xpath = "//div[@class='oxd-calendar-day']")
	public List<WebElement> days;
	
	@FindBy(xpath = "//label[contains(text(),'Nationality')]/parent::div/following-sibling::div//div[@class='oxd-select-text-input']")
	public WebElement nationalityBox;
	@FindBy(xpath = "//div[@class='oxd-select-option']/span")
	public List <WebElement> nationality;
	
	@FindBy(xpath = "//label[contains(text(),'Marital')]/parent::div/following-sibling::div//div[@class='oxd-select-text-input']")
	public WebElement maritalStatusBox;
	@FindBy(xpath = "//div[@class='oxd-select-option']/span")
	public List <WebElement> maritalStatus;
	
	@FindBy(xpath = "//label[contains(text(),'Birth')]/parent::div/following-sibling::div//input")
	public WebElement DOBBox;
	@FindBy(xpath = "//label[contains(text(),'Birth')]")
	public WebElement DOBText;
	
	@FindBy(xpath = "//label[contains(text(),'Military')]/parent::div/following-sibling::div/input")
	public WebElement militaryInput;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-form-hint']/parent::div/button")
	public WebElement save;
	
	@FindBy(xpath = "//div[@id='oxd-toaster_1']")
	public WebElement successPopup;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-title oxd-toast-content-text']")
	public WebElement successText;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
	public WebElement updatedText;
	
	
}
