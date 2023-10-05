package effort_walid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseClass;
import utilities.CommonMethods;

public class LON137LON32 extends CommonMethods {
	
	@Test
	public void PIMModuleConfigurationDropdown () {
		
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
		
//		navigate to PIM page
		CommonMethods.clickOnLeftMenuBarItem("PIM");
		
	
		
		// Click on the Configuration drop-button
		CommonMethods.clickOnPImTopBar("Configuration");
		
		// Wait for visibility Custom Fields
		CommonMethods.waitForVisibility(pimCon.FieldsConfiguration);
		
		// Click on the Custom Fields of Configuration
		CommonMethods.clickOnConfiguration("Custom Fields");
		
		// Click on +Add
		pimCon.Add.click();
		
		
		//Enter "Lisa G" in the "Field Name" input field
		CommonMethods.sendKey(pimCon.AddCustomField, "Lisa G");
		
		//Click on arrow button of the Screen*
		BaseClass.getDriver().findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		
		
		//Click on Contact Details
		BaseClass.getDriver().findElement(By.xpath("//div[@class='oxd-select-wrapper']/div[2]/div[3]/span[contains(text(), 'Contact Details')]")).click();
		
		//Click on arrow button of the Type*	
		BaseClass.getDriver().findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
		
		//Click on Text or Number	
		BaseClass.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div[2]/div[2]/span")).click();
		
		//Click on Save
		pimCon.Save.click();
    	
		
		
		
		
		
	}

}
