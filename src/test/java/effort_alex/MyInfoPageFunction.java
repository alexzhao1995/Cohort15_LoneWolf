package effort_alex;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class MyInfoPageFunction extends CommonMethods {
	
//	Users should be able to switch on Contract Details button to see contract contents
	@Test(enabled = false)
	public void contractDetailsContent() {
		
//		login with valid username and password
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
		
//		navigate to My Info page
		clickOnListItem(comP.leftMenuBarItem, BaseClass.getProperty("myInfoPage"));
//		validate on My Info page with the Personal Details text
		Assert.assertEquals(myInfoP.personalDetailsText.getText(), BaseClass.getProperty("personalDetailsText"));
		
//		navigate to Job tab on My Info page
		clickOnListItem(myInfoP.myInfoTabItem, BaseClass.getProperty("jobTabText"));
//		validate on Job tab with Job Details text
		Assert.assertEquals(jobP.jobDetailsText.getText(), BaseClass.getProperty("jobDetailsText"));
		
//		explicit wait for Employment Contract Details switch button
		waitForClickability(jobP.contractDetailsButton);

//		click on Include Employment Contract Details switch button
		jobP.contractDetailsButton.click();
		
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
		clickOnListItem(comP.leftMenuBarItem, BaseClass.getProperty("myInfoPage"));
//		validate on My Info page with the Personal Details text
		Assert.assertEquals(myInfoP.personalDetailsText.getText(), BaseClass.getProperty("personalDetailsText"));
		
//		navigate to Report-to tab on My Info page
		clickOnListItem(myInfoP.myInfoTabItem, BaseClass.getProperty("reportToTabText"));
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
	@Test(enabled = false)
	public void updatePersonalDetails() {
		
//		login with valid username and password
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
		
//		navigate to My Info page
		clickOnListItem(comP.leftMenuBarItem, BaseClass.getProperty("myInfoPage"));
//		validate on My Info page with the Personal Details text
		Assert.assertEquals(myInfoP.personalDetailsText.getText(), BaseClass.getProperty("personalDetailsText"));
		
//		wait for form loader to disappear
		getWaitObject().until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(BaseClass.getProperty("myInfoFormLoaderXpath"))));
		waitForVisibility(personalDetailsP.empFullNameText);
		waitForVisibility(personalDetailsP.firstNameInput);
		waitForClickability(personalDetailsP.firstNameInput);
		
//		navigate to Personal Details tab on My Info page
//		by default page lands on Personal Details page
//		validate on Personal Details tab with first, last, and nickname input fields displayed
		Assert.assertTrue(personalDetailsP.firstNameInput.isDisplayed());
		Assert.assertTrue(personalDetailsP.lastNameInput.isDisplayed());
		Assert.assertTrue(personalDetailsP.nicknameInput.isDisplayed());
		
//		click on first name input
		personalDetailsP.firstNameInput.click();
//		clear the first name input text box with JavascriptExecutor
		jsClear(personalDetailsP.firstNameInput);
//		enter first name
		personalDetailsP.firstNameInput.sendKeys(BaseClass.getProperty("myInfoFirstName"));
//		validate first name text box has correct input
		Assert.assertEquals(personalDetailsP.firstNameInput.getAttribute("value"), BaseClass.getProperty("myInfoFirstName"));
		System.out.println(personalDetailsP.firstNameInput.getAttribute("value"));

//		click on middle name input
		personalDetailsP.middleNameInput.click();
//		clear the middle name input text box with JavascriptExecutor
		jsClear(personalDetailsP.middleNameInput);
//		enter middle name
		personalDetailsP.middleNameInput.sendKeys(BaseClass.getProperty("myInfoMiddleName"));
//		validate middle name text box has correct input
		Assert.assertEquals(personalDetailsP.middleNameInput.getAttribute("value"), BaseClass.getProperty("myInfoMiddleName"));
		System.out.println(personalDetailsP.middleNameInput.getAttribute("value"));
		
//		click on last name input
		personalDetailsP.lastNameInput.click();
//		clear the last name input text box with JavascriptExecutor
		jsClear(personalDetailsP.lastNameInput);
//		enter last name
		personalDetailsP.lastNameInput.sendKeys(BaseClass.getProperty("myInfoLastName"));
//		validate last name text box has correct input
		Assert.assertEquals(personalDetailsP.lastNameInput.getAttribute("value"), BaseClass.getProperty("myInfoLastName"));
		System.out.println(personalDetailsP.lastNameInput.getAttribute("value"));
		
//		click on nickname input
		personalDetailsP.nicknameInput.click();
//		clear the nickname input text box with JavascriptExecutor
		jsClear(personalDetailsP.nicknameInput);
//		enter nickname
		personalDetailsP.nicknameInput.sendKeys(BaseClass.getProperty("myInfoNickname"));
//		validate nickname text box has correct input
		Assert.assertEquals(personalDetailsP.nicknameInput.getAttribute("value"), BaseClass.getProperty("myInfoNickname"));
		System.out.println(personalDetailsP.nicknameInput.getAttribute("value"));
		
//		click on employee id input
		personalDetailsP.empIdInput.click();
//		clear the employee id input text box with JavascriptExecutor
		jsClear(personalDetailsP.empIdInput);
//		enter employee id
		personalDetailsP.empIdInput.sendKeys(BaseClass.getProperty("myInfoEmpId"));
//		validate employee id box has correct input
		Assert.assertEquals(personalDetailsP.empIdInput.getAttribute("value"), BaseClass.getProperty("myInfoEmpId"));
		System.out.println(personalDetailsP.empIdInput.getAttribute("value"));
		
//		click on DL's Number text box
		personalDetailsP.DLNumber.click();
//		clear the DL Number text box with JavascriptExecutor
		jsClear(personalDetailsP.DLNumber);
//		enter DL Number
		personalDetailsP.DLNumber.sendKeys(BaseClass.getProperty("myInfoDLNumber"));
//		validate DL Number box has correct input
		Assert.assertEquals(personalDetailsP.DLNumber.getAttribute("value"), BaseClass.getProperty("myInfoDLNumber"));
		System.out.println(personalDetailsP.DLNumber.getAttribute("value"));
		
//		click on DL expiry box
		personalDetailsP.DLExpBox.click();
//		click on calendar month
		personalDetailsP.calendarMonth.click();
//		select month October
		clickOnListItem(personalDetailsP.months, BaseClass.getProperty("myInfoDLExpMonth"));
//		click on calendar year
		personalDetailsP.calendarYear.click();
//		select year 2023
		clickOnListItem(personalDetailsP.years, BaseClass.getProperty("myInfoDLExpYear"));
//		click on day "S" to retract year drop down
		clickOnListItem(personalDetailsP.days, BaseClass.getProperty("myInfoCalendarDay"));
//		select day 11
		clickOnListItem(personalDetailsP.dates, BaseClass.getProperty("myInfoDLExpDay"));
//		scroll personal details text into view so the next WebElement is in view
		jsScrollToElement(myInfoP.personalDetailsText);
//		validate DL expiry box has correct input
		Assert.assertEquals(personalDetailsP.DLExpBox.getAttribute("value"), BaseClass.getProperty("myInfoDLExpDate"));
		System.out.println(personalDetailsP.DLExpBox.getAttribute("value"));
		
//		click on Nationality dropdown box
		personalDetailsP.nationalityBox.click();
//		select Australian from dropdown list
		clickOnListItem(personalDetailsP.nationality, BaseClass.getProperty("myInfoNationality"));
//		validate Nationality box has correct info
		Assert.assertEquals(personalDetailsP.nationalityBox.getText(), BaseClass.getProperty("myInfoNationality"));
		System.out.println(personalDetailsP.nationalityBox.getText());

		
//		click on Marital Status dropdown box
		personalDetailsP.maritalStatusBox.click();
//		select Single from dropdown list
		clickOnListItem(personalDetailsP.maritalStatus, BaseClass.getProperty("myInfoMarital"));
//		validate Marital Status box has correct info
		Assert.assertEquals(personalDetailsP.maritalStatusBox.getText(), BaseClass.getProperty("myInfoMarital"));
		System.out.println(personalDetailsP.maritalStatusBox.getText());
		
//		click on DOB box
		personalDetailsP.DOBBox.click();
//		click on calendar month
		personalDetailsP.calendarMonth.click();
//		select month August
		clickOnListItem(personalDetailsP.months, BaseClass.getProperty("myInfoDOBMonth"));
//		click on calendar year
		personalDetailsP.calendarYear.click();
//		select year 2000
		clickOnListItem(personalDetailsP.years, BaseClass.getProperty("myInfoDOBYear"));
//		click on day "S" to retract year drop down
		clickOnListItem(personalDetailsP.days, BaseClass.getProperty("myInfoCalendarDay"));
//		scroll personal details text into view so the next WebElement is in view
		jsScrollToElement(myInfoP.personalDetailsText);
//		select day 9
		clickOnListItem(personalDetailsP.dates, BaseClass.getProperty("myInfoDOBDate"));
//		validate DOB box has correct input
		Assert.assertEquals(personalDetailsP.DOBBox.getAttribute("value"), BaseClass.getProperty("myInfoDOB"));
		System.out.println(personalDetailsP.DOBBox.getAttribute("value"));
		
//		scroll personal details text into view so the next WebElement is in view
		jsScrollToElement(myInfoP.personalDetailsText);
//		click on DOB text to retract calendar
		personalDetailsP.DOBText.click();
//		explicit wait for Military Service box to be visible
		waitForVisibility(personalDetailsP.militaryInput);
//		click on Military Service text box
		personalDetailsP.militaryInput.click();
//		clear the Military Service input text box with JavascriptExecutor
		jsClear(personalDetailsP.militaryInput);
//		enter N/A in Military Service text box
		personalDetailsP.militaryInput.sendKeys(BaseClass.getProperty("myInfoMilitary"));
//		validate Military Service box has correct input
		Assert.assertEquals(personalDetailsP.militaryInput.getAttribute("value"), BaseClass.getProperty("myInfoMilitary"));
		System.out.println(personalDetailsP.militaryInput.getAttribute("value"));
		
//		scroll save button into view
		jsScrollToElement(personalDetailsP.save);
//		click save
		personalDetailsP.save.click();
		System.out.println("1");
//		explicit wait for success pop-up
		waitForVisibility(personalDetailsP.successPopup);
		System.out.println("2");
//		validate info saved with Success pop up on bottom left
		Assert.assertTrue(personalDetailsP.successPopup.isDisplayed());
		System.out.println("3");
		Assert.assertEquals(personalDetailsP.successText.getText(), BaseClass.getProperty("myInfoSuccessText"));
		System.out.println(personalDetailsP.successText.getText());
		Assert.assertEquals(personalDetailsP.updatedText.getText(), BaseClass.getProperty("myInfoUpdatedText"));
		System.out.println(personalDetailsP.updatedText.getText());
		
	}
	
	
	
//	User should not be able to update their contact details with invalid format
	@Test(enabled = false)
	public void updateContactDetailsInvalidFormat() {
		
//		login with valid username and password
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
		
//		navigate to My Info page
		clickOnListItem(comP.leftMenuBarItem, BaseClass.getProperty("myInfoPage"));
//		validate on My Info page with the Personal Details text
		Assert.assertEquals(myInfoP.personalDetailsText.getText(), BaseClass.getProperty("personalDetailsText"));
		
		
//		navigate to Contact Details tab on My Info page
		clickOnListItem(myInfoP.myInfoTabItem, BaseClass.getProperty("contactTabText"));
//		validate on Contact Details tab with Contact Details text
		Assert.assertEquals(contactP.contactDetailsText.getText(), BaseClass.getProperty("contactTabText"));

//		wait for form loader to disappear
//		getWaitObject().until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(BaseClass.getProperty("myInfoFormLoaderXpath"))));
//		waitForVisibility(contactP.contactDetailsText);
		
//		click on Home phone input
		contactP.homeNumInput.click();
//		clear Home phone input
		jsClear(contactP.homeNumInput);
//		enter Home phone #
		contactP.homeNumInput.sendKeys(BaseClass.getProperty("homeNum"));
//		validate invalid Home phone # format with input error message
		Assert.assertEquals(contactP.homeNumErrorText.getText(), BaseClass.getProperty("inputErrorText"));
		System.out.println(contactP.homeNumErrorText.getText());
		
//		click on Mobile phone input
		contactP.mobileNumInput.click();
//		clear Mobile phone input
		jsClear(contactP.mobileNumInput);
//		enter Mobile phone #
		contactP.mobileNumInput.sendKeys(BaseClass.getProperty("mobileNum"));
//		validate invalid Home phone # format with input error message
		Assert.assertEquals(contactP.mobileNumErrorText.getText(), BaseClass.getProperty("inputErrorText"));
		System.out.println(contactP.mobileNumErrorText.getText());
		
//		click on Work phone input
		contactP.workNumInput.click();
//		clear Work phone input
		jsClear(contactP.workNumInput);
//		enter Work phone #
		contactP.workNumInput.sendKeys(BaseClass.getProperty("workNum"));
//		validate invalid Home phone # format with input error message
		Assert.assertEquals(contactP.workNumErrorText.getText(), BaseClass.getProperty("inputErrorText"));
		System.out.println(contactP.workNumErrorText.getText());
		
//		click on Work Email input
		contactP.workEmailInput.click();
//		clear Work Email input
		jsClear(contactP.workEmailInput);
//		enter Work Email
		contactP.workEmailInput.sendKeys(BaseClass.getProperty("myInfoEmail"));
//		validate invalid Home phone # format with input error message
		Assert.assertEquals(contactP.workEmailErrorText.getText(), BaseClass.getProperty("emailErrorText"));
		System.out.println(contactP.workEmailErrorText.getText());
		
//		click on Other Email input
		contactP.otherEmailInput.click();
//		clear Other Email input
		jsClear(contactP.otherEmailInput);
//		enter Other Email
		contactP.otherEmailInput.sendKeys(BaseClass.getProperty("myInfoEmail"));
//		validate invalid Home phone # format with input error message
		Assert.assertEquals(contactP.otherEmailErrorText.getText(), BaseClass.getProperty("emailErrorText"));
		System.out.println(contactP.otherEmailErrorText.getText());
		
	}

}
