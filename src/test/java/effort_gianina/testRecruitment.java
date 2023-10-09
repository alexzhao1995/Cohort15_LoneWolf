package effort_gianina;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseClass;
import utilities.CommonMethods;
import utilities.PageInitializer;

public class testRecruitment extends PageInitializer{
	
	@Test
	public void addingCandidate() throws InterruptedException {
		//Login
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
		//Click Recruitment Tab
		CommonMethods.clickOnLeftMenuBarItem("Recruitment");
		//Click Add Button
		recruitmentCandidatesP.addButton.click();
		//Enter First Name
		recruitmentCandidatesP.firstNameInputField.sendKeys("John");
		//Enter Middle Name
		recruitmentCandidatesP.middleNameInputField.sendKeys("Joe");
		//Enter Last Name
		recruitmentCandidatesP.lastNameInputField.sendKeys("Smith");
		//Click Vacancy Dropdown and Select a Job Title
		recruitmentCandidatesP.dropdownArrow.click();
		recruitmentCandidatesP.clickDropdownOption("Associate IT Manager");
		//Enter Email
		recruitmentCandidatesP.emailInputField.sendKeys("email@email.com");
		//Enter Phone Number
		recruitmentCandidatesP.contactNumberInputField.sendKeys("5555555555");
		//Enter Keywords
		recruitmentCandidatesP.keywordsInputField.sendKeys("qa");
		//Click Calendar Icon
		recruitmentCandidatesP.calendarIcon.click();
		//Select October 1st
		recruitmentCandidatesP.clickCalendarDate("1");
		//Enter Notes
		recruitmentCandidatesP.notesInputField.sendKeys("test notes");
		//Click 'Consent to keep data' Checkbox 
		recruitmentCandidatesP.checkBox.click();
		//Click Save Button
		recruitmentCandidatesP.saveButton.click();
		//Validate that 'Successfully Saved' Message Displays
		CommonMethods.validateMessage("Successfully Saved");
	}
	

	@Test(dependsOnMethods={"addingCandidate"})
	public void shortlistCandidate() throws InterruptedException {
		//Login
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
		//Click Recruitment Tab
		CommonMethods.clickOnLeftMenuBarItem("Recruitment");
		//Click Eye Icon of New Candidate Record
		recruitmentCandidatesP.clickCandidateViewRecordButton("John Joe Smith");
		//Click Shortlist Button
		recruitmentCandidatesP.shortListButton.click();
		//Enter Notes
		recruitmentCandidatesP.notesInputField.sendKeys("quality candidate");
		//Click Save Button
		recruitmentCandidatesP.saveButton.click();
		//Validate that 'Successfully Updated' Message Displays
		CommonMethods.validateMessage("Successfully Updated");
		//Validate that User Navigates to 'Application Stage' Page
		CommonMethods.waitForVisibility(recruitmentCandidatesP.applicationStageTitle);
	}
	
	@Test(dependsOnMethods={"shortlistCandidate"})
	public void rejectCandidate() throws InterruptedException {
		//Login
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
		//Click Recruitment Tab
		CommonMethods.clickOnLeftMenuBarItem("Recruitment");
		//Click Eye Icon of New Candidate Record
		recruitmentCandidatesP.clickCandidateViewRecordButton("John Joe Smith");
		//Validate Reject Button is Displayed
		CommonMethods.waitForVisibility(recruitmentCandidatesP.rejectButton);
		//Validate Schedule Interview Button is Displayed
		CommonMethods.waitForVisibility(recruitmentCandidatesP.scheduleInterviewButton);
		//Click Reject Button
		recruitmentCandidatesP.rejectButton.click();
		//Validate that User Navigates to 'Reject Candidate' Page
		CommonMethods.waitForVisibility(recruitmentCandidatesP.rejectCandidateTitle);
		//Enter Notes
		recruitmentCandidatesP.notesInputField.sendKeys("insufficient experience");
		//Click Save Button
		recruitmentCandidatesP.saveButton.click();
		//Validate that 'Successfully Updated' Message Displays
		CommonMethods.validateMessage("Successfully Updated");
		//Validate that User Navigates to 'Application Stage' Page
		CommonMethods.waitForVisibility(recruitmentCandidatesP.applicationStageTitle);
		//Validate Expected Rejection Message in Description Section of Candidate's Record
		Assert.assertTrue(recruitmentCandidatesP.descriptionText.getText().contains("rejected John Joe Smith from the Associate IT Manager"));
		//Delete Candidate
		CommonMethods.clickOnLeftMenuBarItem("Recruitment");
		recruitmentCandidatesP.clickCandidateTrashButton("John Joe Smith");
		recruitmentCandidatesP.confirmDeleteButton.click();
		CommonMethods.validateMessage("Successfully Deleted");
	}
	
	@Test()
	public void addVacancy() throws InterruptedException {
		//Login
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
		//Click Recruitment Tab
		CommonMethods.clickOnLeftMenuBarItem("Recruitment");
		//Click Vacancies Tab
		recruitmentVacanciesP.vacanciesTab.click();
		//Click Add Button
		recruitmentCandidatesP.addButton.click();
		//Validate that User Navigates to 'Add Vacancy' Page
		CommonMethods.waitForVisibility(recruitmentVacanciesP.addVacancyTitle);
		//Enter Vacancy Name
		recruitmentVacanciesP.vacancyNameInputField.sendKeys("Senior SDET");

		//Click Job Title Dropdown and Select a Job Title
		recruitmentCandidatesP.dropdownArrow.click();
		recruitmentCandidatesP.clickDropdownOption("QA Engineer");
		//Enter Description
		recruitmentVacanciesP.descriptionInputField.sendKeys("test description section");
		//Enter Hiring Manager's First Name and Select 'Odis  Adalwin'
		recruitmentVacanciesP.hiringManagerInputField.sendKeys("Odis");
		recruitmentVacanciesP.waitForOptionAndClickToSelect("Odis  Adalwin");
		//Enter Number of Positions
		recruitmentVacanciesP.numberOfPositionsInputField.sendKeys("1");
		//Validate 'Active' and 'Publish in RSS and Web Page' are Enabled
		Assert.assertTrue(recruitmentVacanciesP.activeToggle.isEnabled());
		Assert.assertTrue(recruitmentVacanciesP.publishToggle.isEnabled());
		//Click Save Button (Workaround: User has to Click Save Button Twice)
		recruitmentCandidatesP.saveButton.click();
		CommonMethods.waitForVisibility(recruitmentVacanciesP.editVacancyTitle);
		recruitmentCandidatesP.saveButton.click();
		//Validate that 'Successfully Saved' Message Displays
		CommonMethods.validateMessage("Successfully Saved");
	}
	
	@Test(dependsOnMethods={"addVacancy"})
	public void dataVisibility() throws InterruptedException {
		//Login
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
		//Click Recruitment Tab
		CommonMethods.clickOnLeftMenuBarItem("Recruitment");
		//Click Vacancies Tab
		recruitmentVacanciesP.vacanciesTab.click();
		//Validate Vacancy Record Displays
		CommonMethods.waitForVisibility(recruitmentVacanciesP.getVacancyRecord("Senior SDET"));
		//Delete Vacancy
		recruitmentCandidatesP.clickCandidateTrashButton("Senior SDET");
		recruitmentCandidatesP.confirmDeleteButton.click();
		CommonMethods.validateMessage("Successfully Deleted");
	}
}
