package effort_walid;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.BaseClass;




public class LON136LON28PIMloggingIn extends BaseClass {

	@Test
	public void loginValidUserNameValidPassword() {
		BaseClass.getDriver().findElement(By.xpath("//input[@name='username']"))
		.sendKeys(BaseClass.getProperty("username"));
		
		BaseClass.getDriver().findElement(By.xpath("//input[@name='password']"))
				.sendKeys(BaseClass.getProperty("password"));
		
		BaseClass.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		
	
	

	}
}