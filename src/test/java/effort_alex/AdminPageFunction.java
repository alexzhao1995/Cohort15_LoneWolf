package effort_alex;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class AdminPageFunction extends CommonMethods {
	
	@Test
	public void testClass() {
		
//		login with valid username and password
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
		
//		navigate to Admin page
		clickOnListItem(comP.leftMenuBarItem, BaseClass.getProperty("adminPage"));
//		validate on My Info page with the Personal Details text
		Assert.assertEquals(adminP.adminText.getText(), BaseClass.getProperty("adminPage"));
		
		
	}

}
