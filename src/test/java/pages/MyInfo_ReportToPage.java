package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MyInfo_ReportToPage {
	
	public MyInfo_ReportToPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "(//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title'])[1]")
	public WebElement reportToText;
	
	@FindBy(xpath = "//div[@class='oxd-table-cell oxd-padding-cell']/div[contains(text(),'John Smith')]")
	public WebElement assignedSuperName;
	
	@FindBy(xpath = "//div[@class='oxd-table-cell oxd-padding-cell']/div[contains(text(),'Kiyara Hu')]")
	public WebElement assignedSuborName1;
	
	@FindBy(xpath = "//div[@class='oxd-table-cell oxd-padding-cell']/div[contains(text(),'Jadine Jackie')]")
	public WebElement assignedSuborName2;
	
	@FindBy(xpath = "//div[@class='oxd-table-cell oxd-padding-cell']/div[contains(text(),'Sara Tencrady')]")
	public WebElement assignedSuborName3;
	
	@FindBy(xpath = "//div[@class='oxd-table-cell oxd-padding-cell']/div[contains(text(),'Garry White')]")
	public WebElement assignedSuborName4;
	
}
