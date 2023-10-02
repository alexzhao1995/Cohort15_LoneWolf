package effort_alex;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class MyInfo_ReportToFunction extends CommonMethods {
	
//	Users should be able to know the name of their "Assigned Supervisors" and "Assigned Subordinates"
	@Test
	public void reportToContent() {
//		login with valid username and password
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
		
//		navigate to My Info page
		CommonMethods.clickOnLeftMenuBarItem("My Info");
//		validate on My Info page with the Personal Details text
		Assert.assertEquals(myInfoP.personalDetailsText.getText(), BaseClass.getProperty("personalDetailsText"));
		
//		navigate to Report-to tab on My Info page
		CommonMethods.clickOnMyInfoTabItem("Report-to");
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

}
