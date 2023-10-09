package effort_aziza;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TestingConfigureTab extends CommonMethods {
	@Test
	public void test1EmployeeReviewSearch() throws InterruptedException {

		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
		CommonMethods.clickOnLeftMenuBarItem("Performance");
		CommonMethods.hardWait(3);
		Assert.assertEquals(getDriver().getCurrentUrl().contains("performance"), true);
		perform.performanceEmployeeNameBox.sendKeys(BaseClass.getProperty("perforamnceEmployeeName"));
		CommonMethods.selectDropDownValue(perform.performanceDropdownselection, "John Smith");
		perform.performanceDropdownselection.click();
		CommonMethods.hardWait(7);
		perform.employeeTrackerSubmitButton.click();
		
	}	
	@Test
	public void test2KPIsaDropDown() throws InterruptedException {
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
		Assert.assertEquals(getDriver().getCurrentUrl().contains("dashboard"), true);
		clickOnLeftMenuBarItem("Performance");
		onClick(performconfig.congigureNavBtn);
		Thread.sleep(3000);
		performconfig.configureDropDownList.click();
		Assert.assertEquals(getDriver().getCurrentUrl()
				.equals("https://opensource-demo.orangehrmlive.com/web/index.php/performance/searchKpi"), true);
		kpisPg.kpisJobTitleBox.click();
		CommonMethods.hardWait(5);
		kpisPg.accountAssitanceSelection.click();
		kpisPg.kpisSearchButton.click();
		Assert.assertEquals(getDriver().getCurrentUrl().contains("searchKpi"), true);

	}

	@Test
	public void test3ItegritySelfDevelopment() throws InterruptedException {
		lp.loginToHrm(getProperty("username"),getProperty("password"));
		Assert.assertEquals(getDriver().getCurrentUrl().contains("dashboard"), true);
		clickOnLeftMenuBarItem("Performance");
		onClick(performconfig.congigureNavBtn);
		Thread.sleep(3000);
		performconfig.configureDropDownList.click();
		Assert.assertEquals(getDriver().getCurrentUrl()
				.equals("https://opensource-demo.orangehrmlive.com/web/index.php/performance/searchKpi"), true);
		iSDPg.integrityCheckBox.click();
		CommonMethods.hardWait(10);
       //iSDPg.integrityTrashBox.click(); 

	}
	@Test
	public void test4EmployeeTracker() throws InterruptedException {
		lp.loginToHrm(getProperty("username"),getProperty("password"));
		Assert.assertEquals(getDriver().getCurrentUrl().contains("dashboard"), true);
		clickOnLeftMenuBarItem("Performance");
		onClick(employeeTrack.employeeTrackerTab);
		employeeTrack.EmployeeTrackerBox.click();
		employeeTrack.EmployeeTrackerBox.sendKeys(getProperty("employeeTrackerEmployeeBox"));
		employeeTrack.employeeTrackerSubmit.click();
		CommonMethods.hardWait(5);
		Assert.assertEquals(getDriver().getCurrentUrl().contains("viewEmployeePerformanceTrackerList"), true);
	}
	@Test
	public void test5MyTracker() throws InterruptedException {
		lp.loginToHrm(getProperty("username"),getProperty("password"));
		Assert.assertEquals(getDriver().getCurrentUrl().contains("dashboard"), true);
		clickOnLeftMenuBarItem("Performance");
		onClick(myTrack.myTrackerTab);
		myTrack.myTrackerView.click();
		Assert.assertEquals(getDriver().getCurrentUrl().contains("addPerformanceTrackerLog"), true);
		myTrack.addLog.click();
		myTrack.logTextBox.sendKeys(getProperty("logbox"));
		myTrack.commentBox.sendKeys(BaseClass.getProperty("comment"));
		CommonMethods.hardWait(5);
		myTrack.saveTracker.click();
		
		
	}
	
	@AfterClass
	public void teardown() {
		BaseClass.tearDown();

	}
}
