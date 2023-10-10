package effort_walid;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseClass;
import utilities.CommonMethods;

public class LON139LON36 extends CommonMethods {
	
		
	
	@Test
	
	public void PIMAddEmployeeTab () {
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
	
	
//	navigate to PIM page
	CommonMethods.clickOnLeftMenuBarItem("PIM");
	
	// Click on  Add Employee
	CommonMethods.clickOnPImTopBar("Add Employee");
	
	
	CommonMethods.sendKey(pimCon.FirstName,CommonMethods.randomFirstName());
	CommonMethods.sendKey(pimCon.MiddleName,CommonMethods.randomMiddleName());
	CommonMethods.sendKey(pimCon.LastName,CommonMethods.randomLastName());
	
	pimCon.Save.click();
	
	Assert.assertEquals(pimCon.PersonalDetailsPage.getText(),"Personal Details");
	CommonMethods.hardWait(5);
	CommonMethods.sendKey(pimCon.DriverLicenseNumber, "AB123456");
	
	CommonMethods.sendKey(pimCon.LicenseExpiryDate, "2025-08-08");
	
	CommonMethods.sendKey(pimCon.SSNNumber, "123-45-6789");
	
	//Click on arrow button of the Nationality
	BaseClass.getDriver().findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
	
	pimCon.Nationality.click();
	
	//Click on arrow button of the MaritalStatus
	BaseClass.getDriver().findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
	
	pimCon.MaritalStatus.click();
	
	pimCon.Save.click();
	//Click on arrow button of the BloodType
	BaseClass.getDriver().findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")).click();
	pimCon.BloodType.click();
	
	pimCon.Save2.click();
	CommonMethods.hardWait(20);		
	CommonMethods.clickOnTabEmployeeList("Contact Details");
	
	CommonMethods.hardWait(10);	
	CommonMethods.sendKey(pimCon.Street,CommonMethods.randomStrees());
	
	CommonMethods.hardWait(10);	
	CommonMethods.sendKey(pimCon.State,CommonMethods.randomState());
	
	CommonMethods.hardWait(10);	
	CommonMethods.sendKey(pimCon.ZIP,CommonMethods.randomZIP());
	
	CommonMethods.hardWait(10);	
	CommonMethods.sendKey(pimCon.City,CommonMethods.randomCity());
	
	//Click on arrow button of the Country
	BaseClass.getDriver().findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
	
	CommonMethods.hardWait(10);
	//Select Country
	BaseClass.getDriver().findElement(By.xpath("//div[@class='oxd-select-wrapper']/div[2]/div[5]/span[contains(text(),'American Samoa')]")).click();
	
	CommonMethods.hardWait(10);	
	CommonMethods.sendKey(pimCon.Telephone,CommonMethods.randomPhone());
	
	CommonMethods.hardWait(10);	
	CommonMethods.sendKey(pimCon.Email,CommonMethods.randomEmail());
	
	//Click on Save
	pimCon.Save.click();
	
	
	
}
	
	
	}

	
	
	

