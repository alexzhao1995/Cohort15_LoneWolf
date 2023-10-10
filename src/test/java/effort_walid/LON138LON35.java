package effort_walid;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class LON138LON35 extends CommonMethods {
	@Test
	public void PIMModuleConfigurationDropdown () {
		
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
		
//		navigate to PIM page
		CommonMethods.clickOnLeftMenuBarItem("PIM");
		
		// Click on the Configuration drop-button
		CommonMethods.clickOnPImTopBar("Configuration");
		
		// Wait for visibility all drop-down menu of Configuration
		CommonMethods.waitForVisibility(pimCon.FieldsConfiguration);
		
		// Click on the Termination Reasons of Configuration
	    CommonMethods.clickOnConfiguration("Termination Reasons");
	    
	 // Click on +Add
	    pimCon.Add.click();
	  
	  //Enter "Lisa G" in the "Field Name" input field
	  	CommonMethods.sendKey(pimCon.AddCustomField, "Lisa G");
	  	
	  //Click on Save
    	pimCon.Save.click();
		
		

}
}
