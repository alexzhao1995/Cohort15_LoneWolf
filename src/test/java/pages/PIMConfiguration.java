package pages;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class PIMConfiguration {
	public PIMConfiguration() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath="//a[contains(@class,'oxd-topbar-body-nav-tab-link')]")
	public WebElement FieldsConfiguration;
	
	@FindBy(xpath="((//input[@class='oxd-input oxd-input--active'])[2])")
	public WebElement AddCustomField;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Save;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement Save2;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement Add;
	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement FirstName;
	
	@FindBy(xpath="//input[@name='middleName']")
	public WebElement MiddleName;
	
	@FindBy(xpath="//input[@name='lastName']")
	public WebElement LastName;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement EmployeeId;
	
	@FindBy(xpath="//h6[text()='Personal Details']")
	public WebElement PersonalDetailsPage;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[5]")
	public WebElement DriverLicenseNumber;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[7]")
	public WebElement SSNNumber;
	
	@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[1]")
	public WebElement LicenseExpiryDate;
	
	@FindBy(xpath="//div[@class='oxd-select-wrapper']/div[2]/div[5]/span[contains(text(),'American')]")
	public WebElement Nationality;
	
	@FindBy(xpath="(//div[@class='oxd-grid-3 orangehrm-full-width-grid'])[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/span[contains(text(),'Single')]")
	public WebElement MaritalStatus;
	
	@FindBy(xpath="(//div[@class='oxd-select-wrapper'])[3]/div[2]/div[3]/span[contains(text(),'A')]")
	public WebElement BloodType;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement Street;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[5]")
	public WebElement State;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[6]")
	public WebElement ZIP;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[4]")
	public WebElement City;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[7]")
	public WebElement Telephone;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[10]")
	public WebElement Email;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement ReportName;
	}


