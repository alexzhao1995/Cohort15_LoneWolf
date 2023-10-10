package effort_walid;

//import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class LON136LON28 extends CommonMethods {
	
//	extends BaseClass so AfterMethod runs, for some reason it doesn't w/o extending it
	
//	CommonMethods cM = new CommonMethods(); // initialize due to new Landing Page
	
	@Test
	public void loginValidUserNameValidPassword() {
		
//		enter username
//		BaseClass.getDriver().findElement(By.xpath(BaseClass.getProperty("usernameInput"))).sendKeys(BaseClass.getProperty("username"));
		
//		enter password
//		BaseClass.getDriver().findElement(By.xpath(BaseClass.getProperty("passwordInput"))).sendKeys(BaseClass.getProperty("password"));
		
//		click login
//		BaseClass.getDriver().findElement(By.xpath(BaseClass.getProperty("login"))).click();
		
//		login to OrangeHRM
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));

		
//		click profile and under dropdown options, click logout
		CommonMethods.clickOnProfileDropdownItem("Logout");
//		cM.clickOnProfileDropdownItem("Logout");

		
//		assert by logging out, once logged out, assert usernameInput and passwordInput is displayed
//		or assert by log out button exists
		Assert.assertTrue(lp.usernameInput.isDisplayed());
		Assert.assertTrue(lp.passwordInput.isDisplayed());
		
//		Assert.assertTrue(BaseClass.getDriver().findElement(By.xpath(BaseClass.getProperty("usernameInput"))).isDisplayed());
//		Assert.assertTrue(BaseClass.getDriver().findElement(By.xpath(BaseClass.getProperty("passwordInput"))).isDisplayed());
		
	}

}
