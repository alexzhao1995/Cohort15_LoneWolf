package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class TimePage {

	public TimePage() {
		 PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']/li")
	public List<WebElement> mainTabMenu; 
	
	
	@FindBy(xpath="//div [@class=\"orangehrm-background-container\"]/div/h6")
	public WebElement empPageHeadline;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-question-lg']")
	public WebElement questionMark;
	
	@FindBy(xpath="//button[@title='Help']")
	public WebElement questionMarkDash;

	@FindBy(xpath="//main[@role='main']//li[2]//a[1]")
	public WebElement EmployeeGuide1;
	
	@FindBy(xpath="//span[normalize-space()='Employee User Guide']")
	public WebElement EmployeeGuide;
	
	@FindBy(xpath="//a[@title='Home']/img")
	public WebElement OrangeHRMLinkImage;
	
	@FindBy(xpath="//a[@class='blocks-item-link']")
	public WebElement FAQsTab;
	
	@FindBy(xpath="//a[normalize-space()='Installation and Upgrade']")
	public WebElement FAQsPageText;
	
	@FindBy(xpath="//h1[@title=\"How to Approve or Reject Timesheets of Subordinates\"]")
	public WebElement TimeLinkText;
	
	@FindBy(xpath="//div [@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]//input")
	public WebElement EmpNameInput;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement viewButton;
	
	@FindBy(xpath="//label[normalize-space()='Employee Name']")
	public WebElement EmployeeNameText;
	
	@FindBy(xpath="//h1[contains(text(),'How to Approve or Reject Timesheets of Subordinate')]")
	public WebElement FirstChildText;
	
	@FindBy(xpath="//img[@alt='OrangeHRM Help Center home page']")
	public WebElement OrangeHRMLink;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-question-lg']")
	public WebElement OrangeHRMHome;
	
	@FindBy(xpath="//span[normalize-space()='Project Info']//i[@class='oxd-icon bi-chevron-down']")
	public WebElement projectInfoDropDown;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/li[1]/a[@class='oxd-topbar-body-nav-tab-link']")
	public List<WebElement> projectInfoDropDownMenu;
	
	@FindBy(xpath="//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--medium') and contains(@class, 'oxd-button--secondary') and .//i[contains(@class, 'oxd-icon') and contains(@class, 'bi-plus')]]")
	public WebElement projectInfoCustomersAddButton;
	
	@FindBy(xpath="//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	public WebElement projectInfoCustomersRadioButton;
	
	
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	public WebElement projectInfoCustomersName;
	
	@FindBy(xpath="//textarea[@placeholder='Type description here']")
	public WebElement projectInfoCustomersDesc;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement projectInfoCustomersSaveButton;
	
	@FindBy(xpath="//div[@class='oxd-table-cell oxd-padding-cell']")
	public List<WebElement> projectInfoEmployeeNamesTable;
	
	@FindBy(xpath="//div[@class='orangehrm-container']//div[3]//div[1]//div[4]//div[1]//button[1]")
	public WebElement projectInfoCustomersDeleteButton;
	
	
	@FindBy(xpath="//span[normalize-space()='Reports']//i[@class='oxd-icon bi-chevron-down']")
	public WebElement reportsDropDown;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']//li[a[contains(text(),'Project')]]")
	public List<WebElement> reportsDropDownMenu;
	
	@FindBy(xpath="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
	public WebElement projectReportsNameBox;
	
	@FindBy(xpath="//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//i[1]")
	public WebElement reportsCalenderButton;
	
	@FindBy(xpath="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
	public WebElement timesheetsNameBox;
	
	@FindBy(xpath="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active' and @data-v-75e744cd='']//input[@placeholder='Type for hints...']")
	public WebElement reportsProjectReportsProjectNameBox;
	
	@FindBy(xpath="//span[@data-v-35991936='' and text()='Global Corp and Co - Global Software phase - 2']")
	public WebElement reportsProjectReportsProjectCompanyName;

	@FindBy(xpath="//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//i[1]")
	public WebElement reportsProjectReportsProjectCalendarFromButton;
	
	@FindBy(xpath="//div[@class=\"oxd-calendar-selector-month-selected\"]//i")
	public WebElement reportsProjectReportsProjectCalendarFromMonthDropDown;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option']")
	public List<WebElement> reportsProjectReportsProjectCalendarFromMonthMenu;
	
	@FindBy(xpath="//div[@class=\"oxd-calendar-selector-year-selected\"]//i")
	public WebElement reportsProjectReportsProjectCalendarFromYearDropDown;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option']")
	public List<WebElement> reportsProjectReportsProjectCalendarFromYearMenu;
	
	@FindBy(xpath="//div[@class='oxd-calendar-date' and text()='4']")
	public WebElement reportsProjectReportsProjectCalendarFromDate;
	
	@FindBy(xpath="//input[@placeholder='To']")
	public WebElement reportsProjectReportsProjectCalendarToButton;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")
	public WebElement reportsProjectReportsProjectCalendarToMonthDropDown;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-month-selected']//i")
	public List<WebElement> reportsProjectReportsProjectCalendarToMonthMenu;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-year-selected']//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")
	public WebElement reportsProjectReportsProjectCalendarToYearDropDown;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option']")
	public List<WebElement> reportsProjectReportsProjectCalendarToYearMenu;

	@FindBy(xpath="//div[@class='oxd-calendar-date' and text()='4']")
	public WebElement reportsProjectReportsProjectCalendarToDate;
	
	@FindBy(xpath="//button[normalize-space()='View']")
	public WebElement reportsProjectReportsProjectViewButton;

	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-text--count']")
	public WebElement reportsProjectReportsProjectCompanyRecords;
	
	@FindBy(xpath="//span[normalize-space()='Attendance']//i[@class='oxd-icon bi-chevron-down']")
	public WebElement attendanceDropDownButton;

	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/li/a[@class='oxd-topbar-body-nav-tab-link']")
	public List<WebElement> attendanceDropDownMenu;
	
	@FindBy(xpath="//i[contains(@class, 'oxd-icon') and contains(@class, 'bi-calendar') and contains(@class, 'oxd-date-input-icon')]")
	public WebElement attendanceMyRecordCalendarDropDown;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-month-selected']//i")
	public WebElement attendanceMyRecordCalendarMonthDropDown;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option']")
	public List<WebElement> attendanceMyRecordCalendarMonthDropDownMenu;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-year-selected']//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")
	public WebElement attendanceMyRecordCalendarYearDropDown;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option']")
	public List<WebElement> attendanceMyRecordCalendarYearDropDownMenu;
	
	@FindBy(xpath="//div[@class='oxd-calendar-date' and text()='3']")
	public WebElement attendanceMyRecordCalendarDate;
	
	@FindBy(xpath="//input[contains(@class, 'oxd-input') and contains(@class, 'oxd-input--active') and @placeholder='yyyy-mm-dd']")
	public WebElement attendancePunchOutCalendarDateTextBox;
	
	@FindBy(xpath="//input[@placeholder='hh:mm']")
	public WebElement attendancePunchOutCalendarTimeTextBox;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary' and normalize-space()='View']")
	public WebElement attendancePunchOutViewButton;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option']")
	public List<WebElement> attendancePunchOutCalendarMonthDropDownMenu;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option']")
	public List<WebElement> attendancePunchOutCalendarYearDropDownMenu;
	
	@FindBy(xpath="//div[@class='oxd-calendar-date' and text()='4']")
	public WebElement attendancePunchOutCalendarDate;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	public WebElement attendancePunchOutCalendarDateButton;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-clock oxd-time-input--clock']")
	public WebElement attendancePunchOutCalendarTimeButton;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-time-hour-input-text']")
	public WebElement attendancePunchOutCalendarHourInput;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-time-minute-input-text']")
	public WebElement attendancePunchOutCalendarMinuteInput;
	
	@FindBy(xpath="//input[@name='am' and @type='radio' and @value='AM']")
	public WebElement attendancePunchOutCalendarAM;
	
	@FindBy(xpath="//input[@name='pm' and @type='radio' and @value='PM']")
	public WebElement attendancePunchOutCalendarPM;
	
	@FindBy(xpath="//button[normalize-space()='Out']")
	public WebElement attendancePunchOutButton;
	
	@FindBy(xpath="//input[contains(@class, 'oxd-input') and contains(@class, 'oxd-input--active') and @placeholder='yyyy-mm-dd']")
	public WebElement attendancePunchInDateTextBox;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active' and @placeholder='hh:mm']")
	public WebElement attendancePunchInTimeTextBox;
	

	@FindBy(xpath="//input[@name='pm' and @type='radio' and @value='PM']")
	public WebElement attendancePunchInButton;
	
	@FindBy(xpath="//i[contains(@class, 'bi-chevron-up') and contains(@class, 'oxd-time-hour-input-up')]")
	public WebElement attendancePunchOutHourUpArrow;
	
	@FindBy(xpath="//i[contains(@class, 'bi-chevron-up') and contains(@class, 'oxd-time-minute-input-up')]")
	public WebElement attendancePunchOutMinuteUpArrow;
	
	//Time sheets page
	
	@FindBy(xpath="//span[normalize-space()='Timesheets']//i[@class='oxd-icon bi-chevron-down']")
	public WebElement TimeSheetsDropDownButton;
	
	@FindBy(xpath="//ul[contains(@class, 'oxd-dropdown-menu')]/li/a[contains(@class, 'oxd-topbar-body-nav-tab-link')]")
	public List<WebElement> TimeSheetsDropDownMenu;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	public WebElement TimeSheetsEmployeeNamesTextBox;
	
	@FindBy(xpath="//span[contains(text(),'Paul')]")
	public WebElement TimeSheetsEmployeePoppedUpName;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement TimeSheetsEmployeeTimeSheetsViewButton;
	
	
	
}
	

