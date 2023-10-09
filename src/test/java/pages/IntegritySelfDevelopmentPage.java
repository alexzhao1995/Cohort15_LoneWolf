package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class IntegritySelfDevelopmentPage {
	public IntegritySelfDevelopmentPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
		@FindBy(xpath = "//div[15]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]")
		public WebElement integrityCheckBox;
		
		@FindBy(xpath = "//button[@fdprocessedid='ebbhdj']//i[@class='oxd-icon bi-trash']")
		//button[@fdprocessedid='ebbhdj']
		//button[@fdprocessedid='ebbhdj']//i[@class='oxd-icon bi-trash']
		
		public WebElement integrityTrashBox;
	
}
