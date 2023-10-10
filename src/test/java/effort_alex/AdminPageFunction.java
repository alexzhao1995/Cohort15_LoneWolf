package effort_alex;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class AdminPageFunction extends CommonMethods {
	
//	Check the possibility of deleting skills in “Qualifications” when click on the trash button
	@Test
	public void deleteSkillsFunctionality() {
		
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
		
//		explicit wait for Java check box
		waitForClickability(skillsP.javaCheckbox);
//		click on Java skill check box
		skillsP.javaCheckbox.click();
//		validate check box clicked with (1) Record Selected text and Delete Selected button is displayed
		Assert.assertEquals(skillsP.recordSelecteText.getText(), BaseClass.getProperty("recordSelectedText"));
		Assert.assertTrue(skillsP.deleteSelectedButton.isDisplayed());
		
//		click on Delete Selected button
		skillsP.deleteSelectedButton.click();
//		explicit wait for Are you Sure? pop-up
		waitForVisibility(skillsP.areYouSureText);
//		validate Delete Selected button clicked with Are you Sure? pop-up message and Yes, Delete button is displayed
		Assert.assertEquals(skillsP.areYouSureText.getText(), BaseClass.getProperty("areYouSureText"));
		Assert.assertEquals(skillsP.areYouSureMessage.getText(), BaseClass.getProperty("areYouSureMessage"));
		Assert.assertTrue(skillsP.yesDeleteButton.isDisplayed());
		
//		click on Yes Delete button
		skillsP.yesDeleteButton.click();
//		explicit wait for success pop-up
		waitForVisibility(skillsP.successPopup);
//		validate skill deleted with Success pop up on bottom left and skill Java is no longer displayed
		Assert.assertTrue(skillsP.successPopup.isDisplayed());
		Assert.assertEquals(skillsP.successText.getText(), BaseClass.getProperty("successText"));
		Assert.assertEquals(skillsP.deletedText.getText(), BaseClass.getProperty("deletedText"));
		
		
	}

}
