package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MyInfoPage {
	
	public MyInfoPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//div[@class='orangehrm-tabs-wrapper']")
	public List <WebElement> myInfoTabItem;
	
	@FindBy(xpath = "(//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title'])[1]")
	public WebElement personalDetailsText;
	
	
	
	
	//span[@data-v-13cf171c=''][text()='Contact Details']



}
