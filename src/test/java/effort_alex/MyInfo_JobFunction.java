package effort_alex;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class MyInfo_JobFunction extends CommonMethods {
	
//	Users should be able to switch on Contract Details button to see contract contents
	@Test(enabled = false)
	public void contractDetailsContent() {
		
//		login with valid username and password
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
		
//		navigate to My Info page
		clickOnListItem(comP.leftMenuBarItem, "My Info");
//		validate on My Info page with the Personal Details text
		Assert.assertEquals(myInfoP.personalDetailsText.getText(), BaseClass.getProperty("personalDetailsText"));
		
//		navigate to Job tab on My Info page
		clickOnListItem(myInfoP.myInfoTabItem, "Job");
//		validate on Job tab with Job Details text
		Assert.assertEquals(jobP.jobDetailsText.getText(), BaseClass.getProperty("jobDetailsText"));
		
//		explicit wait for Employment Contract Details switch button
		waitForClickability(jobP.contractDetailsButton);
//		CommonMethods.waitForVisibility(jobP.contractDetailsButton);
//		CommonMethods.waitForVisibility(jobP.contractDetailsButtonText);
//		new WebDriverWait(getDriver(), 15).until(ExpectedConditions.elementToBeClickable(jobP.contractDetailsButton)).click();
//		CommonMethods.hardWait(3);

//		click on Include Employment Contract Details switch button
		jobP.contractDetailsButton.click();
//		CommonMethods.jsClick(jobP.contractDetailsButton);
		
//		validate contract details button clicked with Contract Start Date, Contract End Date, and Contract Details texts
		Assert.assertEquals(jobP.contractStartText.getText(), BaseClass.getProperty("contractStartText"));
		Assert.assertEquals(jobP.contractEndText.getText(), BaseClass.getProperty("contractEndText"));
		Assert.assertEquals(jobP.contractDetailsText.getText(), BaseClass.getProperty("contractDetailsText"));
		
	}
	
	
	
//	Users should be able to know the name of their "Assigned Supervisors" and "Assigned Subordinates"
	@Test(enabled = false)
	public void reportToContent() {
//		login with valid username and password
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
		
//		navigate to My Info page
//		clickOnLeftMenuBarItem("My Info");
		clickOnListItem(comP.leftMenuBarItem, "My Info");
//		validate on My Info page with the Personal Details text
		Assert.assertEquals(myInfoP.personalDetailsText.getText(), BaseClass.getProperty("personalDetailsText"));
		
//		navigate to Report-to tab on My Info page
//		clickOnMyInfoTabItem("Report-to");
		clickOnListItem(myInfoP.myInfoTabItem, "Report-to");
//		validate on Report-to tab with Report to text
		Assert.assertEquals(reportToP.reportToText.getText(), BaseClass.getProperty("reportToText"));
		
//		validate the name John Smith under Assigned Supervisors
		Assert.assertEquals(reportToP.assignedSuperName.getText(), BaseClass.getProperty("assignedSuperName"));
		
//		validate the names Kiyara Hu, Jadine Jackie, Sara Tencrady, and Garry White under Assigned Subordinates
		Assert.assertEquals(reportToP.assignedSuborName1.getText(), BaseClass.getProperty("assignedSuborName1"));
		Assert.assertEquals(reportToP.assignedSuborName2.getText(), BaseClass.getProperty("assignedSuborName2"));
		Assert.assertEquals(reportToP.assignedSuborName3.getText(), BaseClass.getProperty("assignedSuborName3"));
		Assert.assertEquals(reportToP.assignedSuborName4.getText(), BaseClass.getProperty("assignedSuborName4"));
		
	}
	
	
	
//	Users should be able to update personal information with a proper date format
	@Test(enabled = true)
	public void updatePersonalDetails() {
		
//		login with valid username and password
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
		
//		navigate to My Info page
//		clickOnLeftMenuBarItem("My Info");
		clickOnListItem(comP.leftMenuBarItem, "My Info");
//		validate on My Info page with the Personal Details text
		Assert.assertEquals(myInfoP.personalDetailsText.getText(), BaseClass.getProperty("personalDetailsText"));
		
//		navigate to Personal Details tab on My Info page
//		By default page lands on Personal Details page
//		validate on Personal Details tab with first, last, and nickname input fields displayed
		Assert.assertTrue(personalDetailsP.firstNameInput.isDisplayed());
		Assert.assertTrue(personalDetailsP.lastNameInput.isDisplayed());
		Assert.assertTrue(personalDetailsP.nicknameInput.isDisplayed());
		
//		input first name, middle name, last name, nickname, employee ID, and DL's #
//		CommonMethods.hardWait(2);
//		CommonMethods.waitForVisibility(myInfoP.personalDetailsText);
//		CommonMethods.waitForClickability(personalDetailsP.firstNameInput);
//		CommonMethods.getWaitObject().until(ExpectedConditions.elementToBeClickable(personalDetailsP.firstNameInput));
		
//		CommonMethods.onClick(personalDetailsP.firstNameInput);
		
//		click on first name input
		personalDetailsP.firstNameInput.click();
		
//		CommonMethods.hardWait(3);
		
//		personalDetailsP.firstNameInput.clear();
		
//		personalDetailsP.firstNameInput.sendKeys(Keys.DELETE);
		
//		clear the first name input text box with JavascriptExecutor
//		WebElement firstNameInput = personalDetailsP.firstNameInput;
//		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.getDriver();
//		executor.executeScript("arguments[0].value = '';", personalDetailsP.firstNameInput);
		jsClear(personalDetailsP.firstNameInput);
		
//		enter first name
		personalDetailsP.firstNameInput.sendKeys(BaseClass.getProperty("myInfoFirstName"));
		
//		validate first name text box is !empty
//		System.out.println(personalDetailsP.firstNameInput.getText());
		
		
//		click on middle name input
		personalDetailsP.middleNameInput.click();
		
//		clear the middle name input text box with JavascriptExecutor
		jsClear(personalDetailsP.middleNameInput);

//		enter middle name
		personalDetailsP.middleNameInput.sendKeys(BaseClass.getProperty("myInfoMiddleName"));
		
//		click on last name input
		personalDetailsP.lastNameInput.click();
		
//		clear the last name input text box with JavascriptExecutor
		jsClear(personalDetailsP.lastNameInput);

//		enter last name
		personalDetailsP.lastNameInput.sendKeys(BaseClass.getProperty("myInfoLastName"));
		
//		CommonMethods.hardWait(2);
		
//		click on nickname input
		personalDetailsP.nicknameInput.click();
		
//		CommonMethods.hardWait(2);
		
//		clear the nickname input text box with JavascriptExecutor
		jsClear(personalDetailsP.nicknameInput);
		
//		CommonMethods.hardWait(2);

//		enter nickname
		personalDetailsP.nicknameInput.sendKeys(BaseClass.getProperty("myInfoNickname"));
		
//		CommonMethods.hardWait(2);
		
//		click on employee id input
		personalDetailsP.empIdInput.click();
		
//		CommonMethods.hardWait(2);
		
//		clear the employee id input text box with JavascriptExecutor
		jsClear(personalDetailsP.empIdInput);
//		personalDetailsP.empIdInput.clear();
//		personalDetailsP.empIdInput.sendKeys(Keys.DELETE);
		
//		CommonMethods.hardWait(2);

//		enter employee id
		personalDetailsP.empIdInput.sendKeys(BaseClass.getProperty("myInfoEmpId"));
		
//		click on DL's Number text box
		personalDetailsP.DLNumber.click();
		
//		clear the DL Number text box with JavascriptExecutor
		jsClear(personalDetailsP.DLNumber);
		
//		enter DL Number
		personalDetailsP.DLNumber.sendKeys(BaseClass.getProperty("myInfoDLNumber"));
		
//		click on DL expiry calendar
		personalDetailsP.DLExpiryCalendar.click();
		
//		click on calendar month
		personalDetailsP.calendarMonth.click();
		
//		click on month October
		clickOnListItem(personalDetailsP.months, "October");
		
//		click on calendar year
		personalDetailsP.calendarYear.click();
		
//		hardWait(2);
		
//		click on year 2023
//		clickOnYear("2023");
		clickOnListItem(personalDetailsP.years, "2023");

		
//		hardWait(2);

//		click on day 1 due to the year dropdown list blocking view of some dates (including 11th)
		clickOnListItem(personalDetailsP.days, "1");

		
//		hardWait(2);
		
//		scroll personal details text into view
		jsScrollToElement(myInfoP.personalDetailsText);
		
//		click on DL expiry calendar
		personalDetailsP.DLExpiryCalendar.click();
		
//		click on day 11
		clickOnListItem(personalDetailsP.days, "11");
		
//		click on Nationality dropdown box
		personalDetailsP.nationalityDropdown.click();
		
//		click on Australian from dropdown list
		clickOnListItem(personalDetailsP.countries, "Australian");
		

		
		


		
		
		
	}

}
