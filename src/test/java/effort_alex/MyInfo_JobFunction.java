package effort_alex;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class MyInfo_JobFunction extends CommonMethods {
	
//	Users should be able to switch on Contract Details button to see contract contents
	@Test
	public void contractDetailsContent() {
		
//		login with valid username and password
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
		
//		navigate to My Info page
		CommonMethods.clickOnLeftMenuBarItem("My Info");
//		validate on My Info page with the Personal Details text
		Assert.assertEquals(myInfoP.personalDetailsText.getText(), BaseClass.getProperty("personalDetailsText"));
		
//		navigate to Job tab on My Info page
		CommonMethods.clickOnMyInfoTabItem("Job");
//		validate on Job tab with Job Details text
		Assert.assertEquals(jobP.jobDetailsText.getText(), BaseClass.getProperty("jobDetailsText"));
		
//		explicit wait for Employment Contract Details switch button
		CommonMethods.waitForClickability(jobP.contractDetailsButton);
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

}
