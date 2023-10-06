package effort_ever;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class DirectoryModuleEver extends CommonMethods {

	@Test
	public void TestingEmployee1NameWithValidEmployeeNameAndInvalidJobTitle() {

		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));

		CommonMethods.clickOnLeftMenuBarItem("Directory");
		
		Assert.assertEquals(dirP.directoryTextAssertion.getText(), BaseClass.getProperty("directoryText"));

		dirP.employeeNameBox.sendKeys("paul");

		dirP.autoSuggestPaul.click();

		dirP.jobTitleSelectArrow.click();

		dirP.selectChieftExecutiveOfficer.click();

		dirP.searchButton.click();
		
		CommonMethods.hardWait(3);
				
		Assert.assertEquals(dirP.recordsFoundText.getText(),	BaseClass.getProperty("noRecordsFound"));

	}

	@Test
	public void TestingEmployee2JobTittleFunction() {

		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));

		CommonMethods.clickOnLeftMenuBarItem("Directory");
		
		Assert.assertEquals(dirP.directoryTextAssertion.getText(), BaseClass.getProperty("directoryText"));

		dirP.jobTitleSelectArrow.click();

		dirP.selectHRManager.click();

		CommonMethods.hardWait(3);

		dirP.searchButton.click();
		
		CommonMethods.hardWait(3);
		
		Assert.assertEquals(dirP.recordsFoundText.getText(), BaseClass.getProperty("oneRecordFound"));

	}

	@Test
	public void TestingEmployee3NameSearchFunctionWithValidEmployeeName() {

		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
		
		CommonMethods.clickOnLeftMenuBarItem("Directory");
		
		Assert.assertEquals(dirP.directoryTextAssertion.getText(), BaseClass.getProperty("directoryText"));

		dirP.employeeNameBox.sendKeys("paul");

		dirP.autoSuggestPaul.click();

		dirP.searchButton.click();
		
		CommonMethods.hardWait(3);
		
		Assert.assertEquals(dirP.recordsFoundText.getText(), BaseClass.getProperty("oneRecordFound"));

	}

	@Test
	public void TestingEmployee4NameSearchFunctionWithInvalidEmployeeName() {

		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
		
		CommonMethods.clickOnLeftMenuBarItem("Directory");

		Assert.assertEquals(dirP.directoryTextAssertion.getText(), BaseClass.getProperty("directoryText"));

		dirP.employeeNameBox.sendKeys("ABC123");

		dirP.autoSuggestNoRecordsFound.click();

		dirP.searchButton.click();
		
		CommonMethods.hardWait(3);
		
		Assert.assertEquals(dirP.employeeNameBoxInvalidText.getText(), BaseClass.getProperty("invalidTextEmployeeNameBox"));

	}
	
	@Test
	public void TestingEmployee5LocationSearchFunction() {

		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));

		CommonMethods.clickOnLeftMenuBarItem("Directory");
		
		Assert.assertEquals(dirP.directoryTextAssertion.getText(), BaseClass.getProperty("directoryText"));

		dirP.LocationArrow.click();

		dirP.selectTexasRD.click();

		dirP.searchButton.click();
		
		CommonMethods.hardWait(3);
				
		Assert.assertEquals(dirP.recordsFoundText.getText(), BaseClass.getProperty("eightRecordsFound"));

	}
	@AfterMethod
	public void tearDownCases() {

		BaseClass.tearDown();
	}

}
