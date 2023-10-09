package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class Performance_ConfigureTab {

	public Performance_ConfigureTab() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//header//nav//span[contains(text(), 'Configure ')]")
	public WebElement congigureNavBtn;
	
//	@FindBy(xpath = "//nav[@aria-label='Topbar Menu']//span/following-sibling::ul/li")
	@FindBy(xpath = "//header//nav//span[contains(text(), 'Configure ')]/following-sibling::ul/li")
	public WebElement configureDropDownList;

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-paper-container']/div[@class='orangehrm-container']/div[@role='table']/div[2]/div[1]/div[1]/div[1]")
	public WebElement checkBox;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/button[2]/i[1]")
	public WebElement trashButton;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	public WebElement yesDeleteButton;

}
