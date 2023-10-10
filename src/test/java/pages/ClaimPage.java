package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ClaimPage {

	public ClaimPage() {
		 PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	//Employee Claims reset button function test
	
		@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
		public WebElement ClaimEmployeeClaimsNameTextBox;
		
		@FindBy(xpath="(//div[@role='option'])[1]")
		public List<WebElement> ClaimEmployeeClaimsNamePoppedUpList;
		
		@FindBy(xpath="(//input[@placeholder='Type for hints...'])[2]")
		public WebElement ClaimEmployeeClaimsReferenceIDBox;
		
		@FindBy(xpath="(//div[@role='option'])[2]")
		public List<WebElement> ClaimEmployeeClaimsIDPoppedUpList;

		@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'][@data-v-bddebfba][@data-v-67d2aedf])[1]")
		public WebElement ClaimEmployeeClaimsEventButton;
		
		@FindBy(xpath="(//div[contains(text(),'-- Select --')])[2]")
		public WebElement ClaimEmployeeClaimsStatusTextBox;
		////div[@role='listbox']
		@FindBy(xpath="//div[contains(text(),'Current Employees Only')]")
		public WebElement ClaimEmployeeClaimsIncludeTextBox;
		
		@FindBy(xpath="//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")
		public WebElement ClaimEmployeeClaimsCalendarFromTextBox;
		
		@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[2]")
		public WebElement ClaimEmployeeClaimsCalendarToTextBox;
		
		@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon'])[1]")
		public WebElement ClaimEmployeeClaimsCalendarMonthFromDropDownButton;
		
		@FindBy(xpath="(//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option'])[1]")
		public List<WebElement> ClaimEmployeeClaimsCalendarFromMonthMenu;
		
		@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")
		public WebElement ClaimEmployeeClaimsCalendarYearFromDropDownButton;
		
		@FindBy(xpath="//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option']")
		public List<WebElement> ClaimEmployeeClaimsCalendarFromYearMenu;
		
		@FindBy(xpath="//div[@class='oxd-calendar-date' and text()='4']")
		public WebElement ClaimEmployeeClaimsCalendarFromDate;
		
		@FindBy(xpath="(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")
		public WebElement ClaimEmployeeClaimsCalendarFromButton;
		//(//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//i[1])[3]
		
		@FindBy(xpath="//input[@placeholder='To']")
		public WebElement ClaimEmployeeClaimsCalendarToButton;
		
		@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")
		public WebElement ClaimEmployeeClaimsCalendarToMonthDropDown;
		
		@FindBy(xpath="//div[@class='oxd-calendar-selector-month-selected']//i")
		public List<WebElement> ClaimEmployeeClaimsCalendarToMonthMenu;
		
		@FindBy(xpath="//div[@class='oxd-calendar-selector-year-selected']//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")
		public WebElement ClaimEmployeeClaimsCalendarToYearDropDown;
		
		@FindBy(xpath="//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option']")
		public List<WebElement> ClaimEmployeeClaimsCalendarToYearMenu;

		@FindBy(xpath="//div[@class='oxd-calendar-date' and text()='27']")
		public WebElement ClaimEmployeeClaimsCalendarToDate;
		
		@FindBy(xpath="//button[normalize-space()='Search']")
		public WebElement ClaimEmployeeClaimsSearchButton;
		
		@FindBy(xpath="//div[@class='oxd-select-dropdown --positon-bottom' and @loading='false' and @data-v-40acfd38 and @data-v-13cf171c]/div[@role='option']")
		public List<WebElement> ClaimEmployeeClaimsEventNamePoppedUpList;
		
		@FindBy(xpath="//div[@class='oxd-select-option' and @data-v-d130bb63][@data-v-13cf171c]/span")
		public List<WebElement> ClaimEmployeeClaimsStatusPoppedUpList;
		
		@FindBy(xpath="//div[@class='oxd-select-dropdown --positon-bottom'][@loading='false'][@data-v-40acfd38][@data-v-13cf171c]")
		public List<WebElement> ClaimEmployeeClaimsIncludePoppedUpList;
		
		@FindBy(xpath="//span[normalize-space()='(1) Record Found']")
		public  WebElement ClaimEmployeeClaimsRecordFound;
		
		@FindBy(xpath="//button[normalize-space()='Reset']")
		public  WebElement ClaimEmployeeClaimsResetButton;
		
//		@FindBy(xpath="//button[normalize-space()='Reset']")
//		public WebElement ClaimEmployeeClaimsResetButton;
//		
//		@FindBy(xpath="//button[normalize-space()='Reset']")
//		public WebElement ClaimEmployeeClaimsCreateButton;
		
		//Assign claim function
		
		
		@FindBy(xpath="//a[normalize-space()='Assign Claim']")
		public WebElement ClaimAssginClaimTab;
		
		@FindBy(xpath="//input[@placeholder='Type for hints...' and @data-v-75e744cd]")
		public WebElement ClaimAssginClaimEmpNameInputBox;
		
		@FindBy(xpath="//div[@class='oxd-autocomplete-dropdown --positon-bottom']/div[@role='option']/span")
		public List<WebElement> ClaimAssginClaimEmpNameInputMenu;
		
		@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
		public WebElement ClaimAssginClaimEventButton;
		
		@FindBy(xpath="//div[@class='oxd-select-option']//span")
		public List<WebElement> ClaimAssginClaimEventDropDownMenu;
		
		@FindBy(xpath="//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
		public WebElement ClaimAssginEventTextBox;
		
		@FindBy(xpath="//span[normalize-space()='Medical Reimbursement']")
		public WebElement ClaimAssignMedicalReimberursement;
		
		@FindBy(xpath="//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]/div[1]")
		public WebElement ClaimAssginCurrencyButton;
		
		@FindBy(xpath="//span[normalize-space()='Afghanistan Afghani']")
		public WebElement ClaimAssginCurrencyAfghan;
		//div[@class='oxd-select-option']//span
		@FindBy(xpath="//div[@class='oxd-select-option']//span")
		public List<WebElement> ClaimAssginCurrencyDropDownMenu;
		
		@FindBy(xpath="(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[1]")
		public WebElement ClaimAssginRemarkTextBox;
		
		@FindBy(xpath="(//button[@type='submit'])[1]")
		public WebElement ClaimAssginCreateButton;
		
		@FindBy(xpath="(//button[@type='button'][normalize-space()='Add'])[1]")
		public WebElement ClaimAssginAddExpenseButton;
		
		@FindBy(xpath="//div[@role='listbox']")
		public List<WebElement> ClaimAssginAddExpenseDropDownMenu;
		
		@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
		public WebElement ClaimAssginAddExpenseTypeDropDownButton;
		
		@FindBy(xpath="//div[@role='listbox' and @class='oxd-select-dropdown --positon-bottom']//span")
		public List<WebElement> ClaimAssginAddExpenseTypeDropDownMenu;
		
		@FindBy(xpath="//span[normalize-space()='Planned Surgery']")
		public WebElement ClaimAssginAddExpenseTypePlannedSurgery;
		
		@FindBy(xpath="//span[normalize-space()='Planned Surgery']")
		public WebElement ClaimAssginAddExpenseTypePlannedSurgeryBox;
		//i[@class='oxd-icon bi-calendar oxd-date-input-icon']
		@FindBy(xpath="//i[@class='oxd-icon bi-calendar oxd-date-input-icon' and @data-v-bddebfba='' and @data-v-4a95a2e0='']")
		public WebElement ClaimAssginAddExpenseCalendarDropDownButton;
		

		@FindBy(xpath="//div[@class='oxd-calendar-selector-month-selected']//i")
		public WebElement ClaimAssginAddExpenseTypeCalendarMonthDropDown;
		
		@FindBy(xpath="//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option']")
		public List<WebElement> assignClaimCalendarMonthDropDownMenu;
		
		@FindBy(xpath="//div[@class='oxd-calendar-selector-year-selected']//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")
		public WebElement assignClaimCalendarYearDropDown;
		
		@FindBy(xpath="//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option']")
		public List<WebElement> assignClaimCalendarYearDropDownMenu;
		
		@FindBy(xpath="//div[@class='oxd-calendar-date' and text()='3']")
		public WebElement assignClaimCalendarDate;
		
		//div[@class='oxd-calendar-selector-month-selected']//i
		
		@FindBy(xpath="//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-paper-container']/div[@role='dialog']/div[@class='oxd-dialog-container-default']/div[@class='oxd-dialog-container-default--inner']/div[@role='document']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[@class='oxd-grid-item oxd-grid-item--gutters']/div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input[1]")
		public WebElement ClaimAssginAddExpenseAmountInputBox;
		//div[@class='oxd-grid-1 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'
		@FindBy(xpath="//div[@class='oxd-grid-1 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
		public WebElement ClaimAssginAddExpenseNoteInputBox;
		
		@FindBy(xpath="//button[@type='submit' and contains(@class, 'oxd-button--secondary')]")
		public WebElement ClaimAssginSaveButton;
		
		@FindBy(xpath="//button[@type='submit' and contains(@class, 'oxd-button--secondary')]")
		public WebElement ClaimAssginSubmitButton;
		
	//Submmit a claim
		
		@FindBy(xpath="(//a[normalize-space()='Submit Claim'])[1]")
		public WebElement ClaimSubmiAClaimTab;
		
		@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
		public WebElement ClaimSubmiAClaimEventDropDownButton;
		
		@FindBy(xpath="//span[normalize-space()='Travel Allowance']")
		public WebElement ClaimSubmiAClaimEventTravelAllowance;
		
		@FindBy(xpath="(//div[@role='listbox'])[1]")
		public List<WebElement> ClaimSubmiAClaimEventDropDownMenu;
		//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']
		@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
		public WebElement ClaimSubmiAClaimCurrencyDropDown;
		
		@FindBy(xpath="//span[normalize-space()='United States Dollar']")
		public WebElement ClaimSubmiAClaimCurrencyUnitedStates;
		
		@FindBy(xpath="")
		public List<WebElement> ClaimSubmiAClaimCurrencyDropDownMenu;
		
		@FindBy(xpath="//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
		public WebElement ClaimSubmiAClaimRemarksBox;
		
		@FindBy(xpath="//button[normalize-space()='Create']")
		public WebElement ClaimSubmiAClaimCreateButton;
		
		@FindBy(xpath="(//button[@type='button'][normalize-space()='Add'])[1]")
		public WebElement ClaimSubmiAClaimAddButton;
		
		@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
		public WebElement ClaimSubmiAClaimExpenseTypeDropButton;
		//(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]
		
		@FindBy(xpath="//span[normalize-space()='Accommodation']")//(//div[@role='option'])[2]
		public WebElement ClaimSubmiAClaimExpenseTypeAddExpenseAccommodation;
		
		
		@FindBy(xpath="//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
		public WebElement ClaimSubmiAClaimExpenseCalendarDropButton;
		
		@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon'])[1]")
		public WebElement ClaimSubmiAClaimExpenseDateMonthDropButton;
		
		@FindBy(xpath="//ul[contains(@class, 'oxd-calendar-dropdown')]/li[contains(@class, 'oxd-calendar-dropdown--option')")
		public List<WebElement> ClaimSubmiAClaimExpenseTypeCalendarMonthDropMenu;
		
		@FindBy(xpath="(//ul[@role='menu'])[1]")
		public List<WebElement> ClaimSubmiAClaimExpenseTypeCalendarMonthDropMenu1;
		
		@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon'])[2]")
		public WebElement ClaimSubmiAClaimExpenseDateYearDropButton;
		
		@FindBy(xpath="//ul[@class='oxd-calendar-dropdown' and @role='menu']/li[@class='oxd-calendar-dropdown--option']")
		public List<WebElement> ClaimSubmiAClaimExpenseTypeCalendarYearDropMenu;
		//ul[@class='oxd-calendar-dropdown'][@data-v-78753cc4]/li[@class='oxd-calendar-dropdown--option']
		@FindBy(xpath="(//ul[@role='menu'])[1]")
		public List<WebElement> ClaimSubmiAClaimExpenseTypeCalendarYearDropMenu1;
		
		@FindBy(xpath="//div[contains(text(),'8')]")
		public WebElement ClaimSubmiAClaimExpenseDateButton;
		
		@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[7]")
		public WebElement ClaimSubmiAClaimExpenseAmountTextBox;
		
		@FindBy(xpath="(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[2]")
		public WebElement ClaimSubmiAClaimExpenseNoteTextBox;
		
		@FindBy(xpath="(//button[normalize-space()='Save'])[1]")
		public WebElement ClaimSubmiAClaimExpenseSaveButton;
		
		@FindBy(xpath="(//button[normalize-space()='Submit'])[1]")
		public WebElement ClaimSubmiAClaimExpenseSubmitButton;
		
	//Cancell a claim
		
		@FindBy(xpath="//a[normalize-space()='My Claims']")
		public WebElement myClaimsTab;
		
		@FindBy(xpath="//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-paper-container']/div[@class='orangehrm-container']/div[@role='table']/div[@role='rowgroup']/div[4]/div[1]")
		public WebElement myclaimsViewDetailsButton;
		
		@FindBy(xpath="//button[normalize-space()='Cancel']")
		public WebElement myClaimsCancelButton;
		
		@FindBy(xpath="//button[normalize-space()='Back']")
		public WebElement myClaimsBackButton;
		
		@FindBy(xpath="//button[@type='button' and contains(@class, 'oxd-button') and contains(@class, 'oxd-button--medium') and contains(@class, 'oxd-button--text') and contains(@class, 'oxd-table-cell-action-space') and @data-v-10d463b7 and @data-v-c423d1fa and @xpath='1']")
		public WebElement myClaimsViewButton01;
		
		@FindBy(xpath="//button[@type='button' and contains(@class, 'oxd-button') and contains(@class, 'oxd-button--medium') and contains(@class, 'oxd-button--text') and contains(@class, 'oxd-table-cell-action-space') and @data-v-10d463b7='' and @data-v-='']")
		public WebElement myClaimsViewButton03;
		
	//Inactivate event type
		
		@FindBy(xpath="//i[@class='oxd-icon bi-chevron-down']")
		public WebElement claimConfigurationsButton;
		
		@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/li")
		public List<WebElement> claimConfigurationsDropMenu;
		
		@FindBy(xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']")
		public WebElement claimConfigurationsEventsAddButton;
		
		@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
		public WebElement claimConfigurationsEventsEventName;
		
		@FindBy(xpath="//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
		public WebElement claimConfigurationsEventsDescBox;
		
		@FindBy(xpath="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
		public WebElement claimConfigurationsEventsToggleButton;
		
		@FindBy(xpath="//button[normalize-space()='Save']")
		public WebElement claimConfigurationsEventsSaveButton;
		
		@FindBy(xpath="//div[@class='oxd-table-row oxd-table-row--with-border' and @role='row'][1]")
		public List<WebElement> claimConfigurationsEventslistTable;
		
		@FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border' and @role='row']")
		public List<WebElement> claimConfigurationsEventslistTable1;
		
		@FindBy(xpath="//div[@class='oxd-table-row oxd-table-row--with-border' and @role='row'][1]")
		public List<WebElement> claimConfigurationsEventslistCells;
		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		