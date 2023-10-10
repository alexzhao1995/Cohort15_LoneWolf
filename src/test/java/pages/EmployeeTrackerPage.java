package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class EmployeeTrackerPage {
	public EmployeeTrackerPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
		@FindBy(xpath = "//a[normalize-space()='Employee Trackers']")
		public WebElement employeeTrackerTab;
		
		
		@FindBy(xpath = "//input[@placeholder='Type for hints...']")
		public WebElement EmployeeTrackerBox;
		//input[@placeholder='Type for hints...']
		//div[@class='oxd-autocomplete-text-input--after']
		@FindBy(xpath = "//button[normalize-space()='Search']")
		//button[normalize-space()='Search']
		//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']
		public WebElement employeeTrackerSubmit; 

}
