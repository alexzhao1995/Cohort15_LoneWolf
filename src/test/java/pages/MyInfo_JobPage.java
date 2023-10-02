package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MyInfo_JobPage {
	
	public MyInfo_JobPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "(//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title'])[1]")
	public WebElement jobDetailsText;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p user-form-header-text']")
	public WebElement contractDetailsButtonText;
	
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	public WebElement contractDetailsButton;
	
	@FindBy(xpath = "//label[contains(text(),'Contract Start Date')]")
	public WebElement contractStartText;
	
	@FindBy(xpath = "//label[contains(text(),'Contract End Date')]")
	public WebElement contractEndText;
	
	@FindBy(xpath = "//label[contains(text(),'Contract Details')]")
	public WebElement contractDetailsText;
	
	
//	element click intercepted: Element <div class="oxd-switch-wrapper" data-v-8e4757dc=""
//	data-v-1dfb2fdc="">...</div> is not clickable at point (796, 511).
//	Other element would receive the click: <div class="oxd-form-loader" data-v-d5bfe35b="">...</div>
	 
	//div[@class='oxd-form-loader']
	
//	contractDetailsButton:
	//div[@class='oxd-switch-wrapper']
	//input[@type='checkbox']
	//span[@class='oxd-switch-input oxd-switch-input--active --label-right']

}
