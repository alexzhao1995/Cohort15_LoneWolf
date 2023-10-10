package effort_alex;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class AdminPageFunction extends CommonMethods {
	
//	Check the possibility of deleting skills in “Qualifications” when click on the trash button
	@Test
	public void adminPage() {
		
//		login with valid username and password
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
		
//		navigate to Admin page
		clickOnListItem(comP.leftMenuBarItem, BaseClass.getProperty("adminPage"));
//		validate on Admin page with the Admin text
		Assert.assertEquals(adminP.adminText.getText(), BaseClass.getProperty("adminPage"));
		
//		click on Qualifications drop down
		clickOnListItem(adminP.adminTabsDrop, BaseClass.getProperty("qualificationsText"));
//		explicit wait for drop down
		waitForClickability(adminP.skillsButton);
//		click on Skills from drop down
		clickOnListItem(adminP.qualificationsList, BaseClass.getProperty("skillsText"));
//		validate on Skills page with Skills text
		Assert.assertEquals(skillsP.skillsText.getText(), BaseClass.getProperty("skillsText"));
		System.out.println(skillsP.skillsText.getText());
		
		
		
	}

}
