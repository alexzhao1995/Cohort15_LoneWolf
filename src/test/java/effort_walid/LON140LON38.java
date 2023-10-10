package effort_walid;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseClass;
import utilities.CommonMethods;


public class LON140LON38 extends CommonMethods {
	@Test
	
	public void PIMTestingReports () {
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
//		validate logged in with if the user profile is displayed
		Assert.assertTrue(landP.profile.isDisplayed());
	
	
//	navigate to PIM page
	CommonMethods.clickOnLeftMenuBarItem("PIM");
	
	// Click on  Reports
	CommonMethods.clickOnPImTopBar("Reports");
	
	 // Click on +Add
    pimCon.Add.click();
    //Fill in report name
    CommonMethods.sendKey(pimCon.ReportName,CommonMethods.randomMiddleName());
    
  //Click on arrow button of the Selection Criteria
  	BaseClass.getDriver().findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
  	
  	CommonMethods.hardWait(5);
	//Select Employee Name
	BaseClass.getDriver().findElement(By.xpath("//div[@class='oxd-select-wrapper']/div[2]/div[2]/span[contains(text(),'Employee Name')]")).click();
    
	//Click on arrow button of the Include
  	BaseClass.getDriver().findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
	
  	CommonMethods.hardWait(5);
	//Select Current and Past Employees
	BaseClass.getDriver().findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[2]/div[2]/div[2]/span[contains(text(),'Current and Past Employees')]")).click();
	
	//Click on arrow button of the Select Display Field Group
  	BaseClass.getDriver().findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")).click();
  	
  	CommonMethods.hardWait(5);
	//Select personal
	BaseClass.getDriver().findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[3]/div[2]/div[2]/span[contains(text(),'Personal')]")).click();
	
	//Click on arrow button of the Select Display Field Group
  	BaseClass.getDriver().findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]")).click();
	
  	CommonMethods.hardWait(5);
	//Select Employee Id
	BaseClass.getDriver().findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[4]/div[2]/div[2]/span[contains(text(),'Employee Id')]")).click();
	
	//Click on the +
	BaseClass.getDriver().findElement(By.xpath("(//i[@class='oxd-icon bi-plus'])[2]")).click();
	
	//Click on Save
	pimCon.Save.click();
	
	
	}

}
