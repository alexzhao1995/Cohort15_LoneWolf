package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;


public class KPIsPage {
	public KPIsPage(){
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
		@FindBy(xpath = "//div[@class='oxd-select-text-input']")
		public WebElement kpisJobTitleBox;
		
		@FindBy(xpath = "//div[@role='listbox']//div[2]")
		public WebElement accountAssitanceSelection;
		
		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
		public WebElement kpisSearchButton;
		
	

}
