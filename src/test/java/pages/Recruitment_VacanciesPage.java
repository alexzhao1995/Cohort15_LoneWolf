package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;
import utilities.CommonMethods;

public class Recruitment_VacanciesPage {
	
	public Recruitment_VacanciesPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[text()='Vacancies']")
	public WebElement vacanciesTab;
	
	@FindBy(xpath = "//h6[text()='Add Vacancy']")
	public WebElement addVacancyTitle;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement vacancyNameInputField;
	
	@FindBy(xpath = "//textarea")
	public WebElement descriptionInputField;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement hiringManagerInputField;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	public WebElement numberOfPositionsInputField;
	
	@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]")
	public WebElement activeToggle;
	
	@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[2]")
	public WebElement publishToggle;
	
	@FindBy(xpath = "//h6[text()='Edit Vacancy']")
	public WebElement editVacancyTitle;
	
	public void waitForOptionAndClickToSelect (String optionText) {
		WebElement option = BaseClass.getDriver().findElement(By.xpath("//div[@role='option']/span[text()='"+optionText+"']"));
		CommonMethods.waitForVisibility(option);
		option.click();
	}
	
	public WebElement getVacancyRecord (String vacancy) {
		return BaseClass.getDriver().findElement(By.xpath("//div[text()='"+vacancy+"']/../../.."));
	}
}
