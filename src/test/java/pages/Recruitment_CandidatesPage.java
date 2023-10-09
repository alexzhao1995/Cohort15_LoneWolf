package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class Recruitment_CandidatesPage {
	
	public Recruitment_CandidatesPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement addButton;
	
	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstNameInputField;
	
	@FindBy(xpath = "//input[@name='middleName']")
	public WebElement middleNameInputField;
	
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastNameInputField;
	
	@FindBy(xpath = "//div[@class='oxd-select-text--after']")
	public WebElement dropdownArrow;
	
	@FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
	public WebElement emailInputField;
	
	@FindBy(xpath = "(//input[@placeholder='Type here'])[2]")
	public WebElement contactNumberInputField;
	
	@FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
	public WebElement keywordsInputField;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	public WebElement calendarIcon;
	
	@FindBy(xpath = "//textarea")
	public WebElement notesInputField;
	
	@FindBy(xpath = "//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']")
	public WebElement checkBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement saveButton;
	
	@FindBy(xpath = "//button[text()=' Shortlist ']")
	public WebElement shortListButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--danger']")
	public WebElement rejectButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--success']")
	public WebElement scheduleInterviewButton;
	
	@FindBy(xpath = "//h6[text()='Application Stage']")
	public WebElement applicationStageTitle;
	
	@FindBy(xpath = "//h6[text()='Reject Candidate']")
	public WebElement rejectCandidateTitle;
	
	@FindBy(xpath = "//div[@class='oxd-table-card']/div/div[2]/div")
	public WebElement descriptionText;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	public WebElement confirmDeleteButton;
	
	public void clickDropdownOption (String optionText) {
		BaseClass.getDriver().findElement(By.xpath("//div[@role='option']/span[text()='"+optionText+"']")).click();
	}
	
	public void clickCalendarDate (String date) {
		BaseClass.getDriver().findElement(By.xpath("//div[@class='oxd-date-input-calendar']//div[@class='oxd-calendar-date' and text()='"+date+"']")).click();
	}
	
	public void clickCandidateViewRecordButton (String candidate) {
		BaseClass.getDriver().findElement(By.xpath("//div[text()='"+candidate+"']/../../..//i[@class='oxd-icon bi-eye-fill']/..")).click();
	}
	
	public void clickCandidateTrashButton (String candidate) {
		BaseClass.getDriver().findElement(By.xpath("//div[text()='"+candidate+"']/../../..//i[@class='oxd-icon bi-trash']")).click();
	}
}
