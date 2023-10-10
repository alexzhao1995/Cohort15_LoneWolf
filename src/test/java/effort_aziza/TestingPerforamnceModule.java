package effort_aziza;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.PerformancePage;
import utilities.BaseClass;
import utilities.CommonMethods;

public class TestingPerforamnceModule extends CommonMethods {
	@Test
	public void loginWithValidUsernameAndPassword() throws InterruptedException {

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

}
