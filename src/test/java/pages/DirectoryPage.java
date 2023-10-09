package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DirectoryPage {

	public DirectoryPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement employeeNameBox;
	
	@FindBy(xpath = "//span[contains(text(),'Paul')]")
	public WebElement autoSuggestPaul;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	public WebElement jobTitleSelectArrow;
	
	@FindBy(xpath = "//span[normalize-space()='Chief Executive Officer']")
	public WebElement selectChieftExecutiveOfficer;
	
	@FindBy(xpath = "//button[normalize-space()='Search']")
	public WebElement searchButton;

	@FindBy(xpath = "//span[normalize-space()='HR Manager']")
	public WebElement selectHRManager;
	
	@FindBy(xpath = "//div[@role='option']")
	public WebElement autoSuggestNoRecordsFound;
	
	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
	public WebElement LocationArrow;
	
	@FindBy(xpath = "//span[normalize-space()='Texas R&D']")
	public WebElement selectTexasRD;
	
	@FindBy(xpath = "//h6[normalize-space()='Directory']")
	public WebElement directoryTextAssertion;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span']")//span[@class='oxd-text oxd-text--span']
	public WebElement recordsFoundText;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	public WebElement employeeNameBoxInvalidText;
}