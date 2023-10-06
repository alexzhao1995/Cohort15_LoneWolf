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
	
	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstNameInput;
	//div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input[@name='firstName']
	//input[@name='firstName']
	
	@FindBy(xpath = "//input[@name='middleName']")
	public WebElement middleNameInput;
	
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastNameInput;
	
	@FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[2]//div[1]//div[1]//div[2]//input[1]")
	public WebElement nicknameInput;
//	(//div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input[@class='oxd-input oxd-input--active'])[1]
	//label[contains(text(),'Nickname')]
//	(//input[@class='oxd-input oxd-input--active'])[1]
//	(//input[@class='oxd-input oxd-input--active'])[2]
	//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[2]//div[1]//div[1]//div[2]//input[1]
	
//	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
//	public WebElement nicknameInput;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]\n")
	public WebElement empIdInput;
//	(//input[@class='oxd-input oxd-input--active'])[3]
	//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	public WebElement focus;
	
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
	public WebElement DLNumber;
	//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]
//	(//input[@class='oxd-input oxd-input--active'])[5]
	
	@FindBy(xpath = "//label[contains(text(),'License Expiry Date')]")
	public WebElement DLExpiryText;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")
	public WebElement DLExpiryCalendar;
	
	@FindBy(xpath = "//li[@class='oxd-calendar-selector-month']")
	public WebElement calendarMonth;
	//div[@class='oxd-calendar-selector-month-selected']
	
	@FindBy(xpath = "//li[@class='oxd-calendar-dropdown--option']")
	public List <WebElement> months;
//	always select today's month
	//li[@class='oxd-calendar-dropdown--option --selected']
	
	@FindBy(xpath = "//li[@class='oxd-calendar-selector-year']")
	public WebElement calendarYear;
	//div[@class='oxd-calendar-selector-year-selected']
	
	@FindBy(xpath = "//li[@class='oxd-calendar-dropdown--option']")
	public List <WebElement> years;
//	always select today's year
	//li[@class='oxd-calendar-dropdown--option --selected']
	
	@FindBy(xpath = "//div[@class='oxd-calendar-date']")
	public List <WebElement> days;
//	always select today's day
	//div[@class='oxd-calendar-date --selected --today']
	
	@FindBy(xpath = "//label[contains(text(),'Nationality')]//parent::div//following-sibling::div/div")
	public WebElement nationalityDropdown;
	
	@FindBy(xpath = "//div[@class='oxd-select-option']/span")
	public List <WebElement> countries;
	
	@FindBy(xpath = "//label[contains(text(),'Marital Status')]//parent::div//following-sibling::div/div")
	public WebElement maritalStatusDropdown;
	
	
	
	
	
}
