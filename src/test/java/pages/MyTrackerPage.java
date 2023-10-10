package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MyTrackerPage {
	public MyTrackerPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
		@FindBy(xpath = "//a[normalize-space()='My Trackers']")
		public WebElement myTrackerTab;
		
		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text oxd-table-cell-action-space']")
		public WebElement myTrackerView;
		
		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
		public WebElement addLog;
		
		@FindBy(xpath = "//input[@placeholder='Type here']")
		public WebElement logTextBox;
		
		@FindBy(xpath = "//textarea[@placeholder='Type here']")
		public WebElement commentBox;
		
		@FindBy(xpath = "//button[normalize-space()='Save']")
		public WebElement saveTracker;
		
		
}
