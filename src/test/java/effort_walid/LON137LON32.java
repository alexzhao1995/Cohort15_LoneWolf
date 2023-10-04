package effort_walid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
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
		CommonMethods.clickOnConfiguration("Configuration");
		
		// Wait for visibility Custom Fields
		CommonMethods.waitForVisibility(jobP.CustomFields);
		
		// Click on the Custom Fields of Configuration
		CommonMethods.clickOnCustomFields("Custom Fields");
		
		// Click on +Add
		BaseClass.getDriver().findElement(By.xpath("//button[contains(@class,'button--secondary')]")).click();
		
		
		//Enter "Lisa G" in the "Field Name" input field
		CommonMethods.sendKey(myInfoP.AddCustomField, "Lisa G");
		
		
		BaseClass.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div")).click();
		
		CommonMethods.hardWait(10);
		
		CommonMethods.jsScrollToElement(myInfoP.HiddenList);
        
		CommonMethods.selectDropDownValue(myInfoP.HiddenListBox,"Contact Details");
		//div[@class='oxd-select-option']
        //CommonMethods.hardWait(10);
		//div[@role='listbox']

//		CommonMethods.hardWait(10);
//		CommonMethods.jsClick(myInfoP.ContactDetails);
		
		
	}

}
