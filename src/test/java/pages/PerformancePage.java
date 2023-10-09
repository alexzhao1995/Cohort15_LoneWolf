package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class PerformancePage {

	public PerformancePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement performanceEmployeeNameBox;
	
	@FindBy(xpath = "//span[contains(text(),'John')]")
	public WebElement performanceDropdownselection;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement employeeTrackerSubmitButton;

}
