package utilities;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;


public class CommonMethods extends PageInitializer{
	
	
	public static Faker faker = new Faker();

//	LandingPage landP = new LandingPage(); // since we made a PageInitializer class we dont need this
	
	
//	below method clicks on one of the dropdown items under profile
	public static void clickOnProfileDropdownItem(String itemText) {
		
//		click profile
//		BaseClass.getDriver().findElement(By.xpath(BaseClass.getProperty("profile"))).click();
		landP.profile.click();
		
//		loop through profile dropdown options and click desired dropdown text
//		List<WebElement> profileSetting = BaseClass.getDriver().findElements(By.xpath(BaseClass.getProperty("profileDropdown")));
		List<WebElement> profileSetting = landP.profileDropdown;
		for(WebElement dropdownMenu : profileSetting) {
			if(dropdownMenu.getText().equalsIgnoreCase(itemText)) {
				dropdownMenu.click();
				break;
			}
		}
		
	}
	// below methods click on one of the items in the profile dropdown
	public static void clickOnItemProfileDropdown(String itemText) {

		landP.profileDropdownTab.click();

		List<WebElement> profileDropdownMenu = landP.profileDropdown;
		for (WebElement menuItem : profileDropdownMenu) {
			if (menuItem.getText().equalsIgnoreCase(itemText)) {
				menuItem.click();
				break;
			}
		}

	}
	
//	below method clicks on one of the menu item on the left side menu bar
	public static void clickOnLeftMenuBarItem(String itemText) {
		List<WebElement> leftMenuBar = comP.leftMenuBarItem;
		for(WebElement menuItem : leftMenuBar) {
			if(menuItem.getText().equalsIgnoreCase(itemText)) {
				menuItem.click();
				break;
			}
		}	
	}
	public static void clickOnMainTab1(String item1Text) {

		List<WebElement> mainMenu = TimeP.mainTabMenu;
		for (WebElement menuItem : mainMenu) {
			if (menuItem.getText().equalsIgnoreCase(item1Text)) {
				menuItem.click();
				break;
			}
		}
	}
	
//	below method clicks on one of the items from the dropdown list
	public static void clickOnListItem(List<WebElement> item, String itemText) {
		for(WebElement e : item) {
			if(e.getText().equalsIgnoreCase(itemText)) {
				e.click();
				break;
			}
		}
	}
	
	//below method clicks on one of the topBar PIM
	public static void clickOnPImTopBar(String itemText) {
		List<WebElement> pimTabs = comP.PimTopBar;
		for(WebElement tabItem : pimTabs) {
			if(tabItem.getText().equalsIgnoreCase(itemText)) {
				tabItem.click();
				break;
			}
		}
	}
	
	//below method clicks on one of the Configuration PIM
		public static void clickOnConfiguration(String itemText) {
			List<WebElement> ConfigurationTabs = comP.PimConfiguration;
			for(WebElement tabItem : ConfigurationTabs) {
				if(tabItem.getText().equalsIgnoreCase(itemText)) {
					tabItem.click();
					break;
				}
			}
		}
		
		//below method clicks on one of the Configuration PIM
				public static void clickOnTabEmployeeList(String itemText) {
					List<WebElement> ConfigurationTabs = comP.PimEmployeeList;
					for(WebElement tabItem : ConfigurationTabs) {
						if(tabItem.getText().equalsIgnoreCase(itemText)) {
							tabItem.click();
							break;
						}
					}
				}
		
	
	
//	generate random first name
	public static String randomFirstName() {
		return faker.name().firstName();
	}
	
//	generate random middle name
	public static String randomMiddleName() {
		return faker.pokemon().name();
	}
	
//	generate random last name
	public static String randomLastName() {
		return faker.harryPotter().character();
	}
//	generate random street
	public static String randomStrees() {
		return faker.address().streetAddress();
	}
	
//	generate random ZIP
	public static String randomZIP() {
		return faker.address().zipCode();
	}
//	generate random City
	public static String randomCity() {
		return faker.address().city();
	}
	
	//	generate random Phone
	public static String randomPhone() {
		return faker.phoneNumber().cellPhone();
	}
	
//	generate random Phone
	public static String randomEmail() {
		return faker.internet().emailAddress();
	}
	
	
//	generate random country
	public static String randomFlag() {
		return faker.address().country();
	}
	
	
//	generate random state
	public static String randomState() {
		return faker.address().state();
	}
	
	
//	send key method
	public static void sendKey(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	
//	assert title method
	public static void assertTitle(String text) {
		assertTrue(BaseClass.getDriver().getTitle().contains(text));
	}
	
	
//	Thread.sleep convert milliseconds to seconds method
//			CommonMethods.hardWait(5);
	public static void hardWait(Integer second) {
		try {
			Thread.sleep(second * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	explicit wait methods
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 30);
		return wait;
	}
	
	
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}
	
	
//	this waits until element is clickable and then clears and clicks on an element
	public static void onClick(WebElement element) {
		waitForClickability(element);
		element.click();

	}
	
	public void clickFromList(List<WebElement> dropDown, String value) {
		for (WebElement element : dropDown) {
			if (element.getText().trim().contains(value)) {
				onClick(element);
				break;
			}
		}
	}

	

	
	
//	JavaScript Executer Object
	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
		return js;
	}
	
	
//	JavaScript Executor clear method
	public static void jsClear(WebElement element) {
		getJSObject().executeScript("arguments[0].value = '';", element);
	}
	
	
//	JavaScript Executor click method
//	CommonMethods.jsClick(BaseClass.getDriver().findElement(By.xpath("")));
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click()", element);
	}
	
	
//	JavaScript Executor scroll element into view method
	public static void jsScrollToElement(WebElement element) {
		getJSObject().executeScript("arguments[0].scrollIntoView();", element);
	}

	
	
//    public static void testHiddenElement(WebElement element) {
//    	
//    
//        // Identify the hidden element and interact with it using JavaScriptExecutor
//        WebElement element = BaseClass.getDriver().findElement(By.xpath(element));
//        JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
//        js.executeScript("arguments[0].click();", element);

        // Perform assertions or further actions
        // ...
    
	
	
//	send text to alert method
	public void sendTextToAlert(String text) {
        try {
          Alert alert = BaseClass.getDriver().switchTo().alert();
          alert.sendKeys(text);
          alert.accept();
       } catch (NoAlertPresentException e) {
           e.printStackTrace();
       }
        
    }
	
	
//	accept alert method
	public void acceptAlert(String text) {
        try {
          Alert alert = BaseClass.getDriver().switchTo().alert();
          alert.accept();
       } catch (NoAlertPresentException e) {
           e.printStackTrace();
       }
        
    }
	
	
//	hover over method
	public void hover(WebElement element) {
        Actions act = new Actions(BaseClass.getDriver());
        act.moveToElement(element).build().perform();
    }
	
	
//	methods checks if radio / checkbox is enabled and clicks on it
    public static void clickRadioOrCheckbox(List<WebElement> radioOrcheckbox, String valueToBeSelected) {
        String actualValue;
        for (WebElement el : radioOrcheckbox) {
            actualValue = el.getAttribute("value").trim();
            if (el.isEnabled() && actualValue.equalsIgnoreCase(valueToBeSelected)) {
                el.click();
                break;
            }
        }
    }

    
//    select drop down by value method
    public static void selectDropDownValue(WebElement dropDownElement, String textToSelect) {
    	
        try {
        	
            Select select = new Select(dropDownElement);
            List<WebElement> options = select.getOptions();
            for (WebElement el : options) {
                if (el.getText().equals(textToSelect)) {
                    select.selectByVisibleText(textToSelect);
                    break;
                }
            }
        } catch (UnexpectedTagNameException e) {
            e.printStackTrace();
        }
    }

    
//    select drop down by index method
    public static void selectDropDownIndex(WebElement dropDownElement, int indexValue) {
        try {
            Select select = new Select(dropDownElement);
            int size = select.getOptions().size();
            if (size > indexValue) {
                select.selectByIndex(indexValue);    
            }
        } catch (UnexpectedTagNameException e) {
            e.printStackTrace();
        }
    }
    
    
//    screenshot method
    public static byte[] takeScreenshot(String fileName) {
    	TakesScreenshot ts = (TakesScreenshot) BaseClass.getDriver();
    	byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
    	File file = ts.getScreenshotAs(OutputType.FILE);
    	String destinationFile = "src/test/resources/screenshots/" + fileName + getTimeStamp() + ".png";
    	try {
    		FileUtils.copyFile(file, new File(destinationFile));
    	} catch(Exception e) {
    		System.out.println("Cannot Take Screenshot");
    	}
    	return picBytes;
    }
    
    
//    method to get time stamp
    public static String getTimeStamp() {
    	Date date = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH:mm:ss");
    	return sdf.format(date.getTime());
    }
		
// 	Validate Message Displays
    public static void validateMessage(String message) {
    	waitForVisibility(BaseClass.getDriver().findElement(By.xpath("//*[text()='"+message+"']")));
    }
    
    public static void clickOnMainTab(String item1Text) {

		List<WebElement> mainMenu = TimeP.mainTabMenu;
		for (WebElement menuItem : mainMenu) {
			if (menuItem.getText().equalsIgnoreCase(item1Text)) {
				menuItem.click();
				break;
			}
		}
	}
	
	public static void claimConfigurationsDropMenu(String item1Text) {

		List<WebElement> mainMenu = ClaimP.claimConfigurationsDropMenu;
		for (WebElement menuItem : mainMenu) {
			if (menuItem.getText().equalsIgnoreCase(item1Text)) {
				menuItem.click();
				break;
			}
		}
	}

	public static boolean configurationsEventInactivateFunction(String eventName, String eventStatus) {
	    for (WebElement row : ClaimP.claimConfigurationsEventslistTable1) {
	        List<WebElement> cells = row.findElements(By.xpath(".//div[@class='oxd-table-cell oxd-padding-cell']"));
	        
	        if (cells.size() >= 3) {
	            String cellText1 = cells.get(1).getText();
	            String cellText2 = cells.get(2).getText();
	            
	            if (cellText1.equalsIgnoreCase(eventName) && cellText2.equalsIgnoreCase(eventStatus)) {
	                System.out.println("Row with values found: " + eventName + ", " + eventStatus);
	                return true;
	            }
	        }
	    }
	    
	    
	    System.out.println("No row with both values found: " + eventName + ", " + eventStatus);
	    return false;
	}

			
	
	public static void claimEmployeeInfoPoppedUpList(String nameText, String idText) {
		waitInSeconds(1);
		ClaimP.ClaimEmployeeClaimsNameTextBox.sendKeys("Odis");
		waitInSeconds(2);
		List<WebElement> name = ClaimP.ClaimEmployeeClaimsNamePoppedUpList;
		for (WebElement empName : name) {
			if (empName.getText().equalsIgnoreCase(nameText)) {
				empName.click();
				break;
			}
		}
		ClaimP.ClaimEmployeeClaimsReferenceIDBox.sendKeys("202307180");
		waitInSeconds(2);
		List<WebElement> idNum = ClaimP.ClaimEmployeeClaimsIDPoppedUpList;
		for (WebElement  employeeID: idNum) {
			if (employeeID.getText().equalsIgnoreCase(idText)) {
				employeeID.click();
				break;
			}
		}
	}
	
	public static void claimEmployeeInfoPoppedUpList1(String nameText, String idText, String eventText, String statusText, String includeText) {
		waitInSeconds(3);
		ClaimP.ClaimEmployeeClaimsNameTextBox.sendKeys("Lisa");
		waitInSeconds(2);
		List<WebElement> name = ClaimP.ClaimEmployeeClaimsNamePoppedUpList;
		for (WebElement empName : name) {
			if (empName.getText().equalsIgnoreCase(nameText)) {
				empName.click();
				break;
			}
		}
		ClaimP.ClaimEmployeeClaimsReferenceIDBox.sendKeys("2023071800");
		waitInSeconds(2);
		List<WebElement> idNum = ClaimP.ClaimEmployeeClaimsIDPoppedUpList;
		for (WebElement  employeeID: idNum) {
			if (employeeID.getText().equalsIgnoreCase(idText)) {
				employeeID.click();
				break;
			}
		}
		ClaimP.ClaimEmployeeClaimsEventButton.click();
		waitInSeconds(2);
		List<WebElement> eventName = ClaimP.ClaimEmployeeClaimsEventNamePoppedUpList;
		for (WebElement  eventList: eventName) {
			if (eventList.getText().equalsIgnoreCase(eventText)) {
				eventList.click();
				break;
			}
			ClaimP.ClaimEmployeeClaimsStatusTextBox.click();
			waitInSeconds(2);
			List<WebElement> statusName = ClaimP.ClaimEmployeeClaimsStatusPoppedUpList;
			for (WebElement  statusList: statusName) {
				if (statusList.getText().equalsIgnoreCase(statusText)) {
					statusList.click();
					break;
		}
			}
			
			ClaimP.ClaimEmployeeClaimsIncludeTextBox.click();
			waitInSeconds(2);
			ClaimP.ClaimEmployeeClaimsIncludeTextBox.click();
			List<WebElement> includeName = ClaimP.ClaimEmployeeClaimsIncludePoppedUpList;
			for (WebElement  includeList: includeName) {
				if (includeList.getText().equalsIgnoreCase(includeText)) {
					includeList.click();
					break;
		}
			}
		}
		
	}
	
	public static void assignClaimEmployeeNameDropDownMenu(String itemText) {
		ClaimP.ClaimAssginClaimEmpNameInputBox.sendKeys("Od");
		waitInSeconds(2);
		List<WebElement> name = ClaimP.ClaimAssginClaimEmpNameInputMenu;
		for (WebElement empName : name) {
			if (empName.getText().equalsIgnoreCase(itemText)) {
				empName.click();
				break;
			}
		}
	}
	
public static void assignClaimEmployeeEventDropDownMenu(String itemText) {
	waitInSeconds(2);
		ClaimP.ClaimAssginClaimEventButton.click();;
		waitInSeconds(2);
		/*ClaimP.ClaimAssignMedicalReimberursement.click();*/
		List<WebElement> name = ClaimP.ClaimAssginClaimEventDropDownMenu;
		for (WebElement empName : name) {
			if (empName.getText().equalsIgnoreCase(itemText)) {
				empName.click();
				break;
			}
		}
		ClaimP.ClaimAssginCreateButton.click();
}
	

public static void assignClaimEmployeeCurrencyDropDownMenu(String itemText) {
	ClaimP.ClaimAssginCurrencyButton.click();;
	List<WebElement> name = ClaimP.ClaimAssginCurrencyDropDownMenu;
	for (WebElement empName : name) {
		if (empName.getText().equalsIgnoreCase(itemText)) {
			empName.click();
			break;
		}
	}
}

public static void claimAssginAddExpenseDropDownMenu(String itemText) {
	
	ClaimP.ClaimAssginAddExpenseTypeDropDownButton.click();
	waitInSeconds(2);
	List<WebElement> name = ClaimP.ClaimAssginAddExpenseTypeDropDownMenu;
	for (WebElement empName : name) {
		if (empName.getText().equalsIgnoreCase(itemText)) {
			empName.click();
			break;
		}
	}
}
	
	public static void timeSheetsDropDownMenu(String item1Text) {
		waitInSeconds(1);
		TimeP.TimeSheetsDropDownButton.click();
		waitInSeconds(2);
		List<WebElement> mainMenu = TimeP.TimeSheetsDropDownMenu;
		for (WebElement menuItem : mainMenu) {
			if (menuItem.getText().equalsIgnoreCase(item1Text)) {
				menuItem.click();
				break;
			}
		}
	}

	public static void attendanceDropDownMenu(String item1Text) {

		List<WebElement> mainMenu = TimeP.attendanceDropDownMenu;
		for (WebElement menuItem : mainMenu) {
			if (menuItem.getText().equalsIgnoreCase(item1Text)) {
				menuItem.click();
				break;
			}
		}
	}

	public static void clickOnLeftTabOptions(String itemText) {

		List<WebElement> leftTabMenu = comP.leftTabOptionsMenu;
		for (WebElement menuItem : leftTabMenu) {
			if (menuItem.getText().equalsIgnoreCase(itemText)) {
				menuItem.click();
				break;
			}
		}

	}
	
	

	public static boolean projectInfoEmployeeNamesTable(String itemTextToFind) {
		List<WebElement> mainMenu = TimeP.projectInfoEmployeeNamesTable;
		for (WebElement menuItem : mainMenu) {
			if (menuItem.getText().equalsIgnoreCase(itemTextToFind)) {
				return true; // Text was found in the list
			}
		}
		return false; // Text was not found in the list
	}

	public static void projectInfoMenu(String itemText) {

		TimeP.projectInfoDropDown.click();

		List<WebElement> profileDropdownMenu = TimeP.projectInfoDropDownMenu;
		for (WebElement menuItem : profileDropdownMenu) {
			if (menuItem.getText().equalsIgnoreCase(itemText)) {
				menuItem.click();
				break;
			}
		}

	}

	public static void reportsMenu(String itemText) {

		TimeP.reportsDropDown.click();

		List<WebElement> profileDropdownMenu = TimeP.reportsDropDownMenu;
		for (WebElement menuItem : profileDropdownMenu) {
			if (menuItem.getText().equalsIgnoreCase(itemText)) {
				menuItem.click();
				break;
			}
		}

	}

	public static void myAttendanceRecordCalendar(String month, String year) {

		TimeP.attendanceMyRecordCalendarDropDown.click();
		TimeP.attendanceMyRecordCalendarMonthDropDown.click();

		List<WebElement> monthDropdownMenu = TimeP.attendanceMyRecordCalendarMonthDropDownMenu;
		for (WebElement monthItem : monthDropdownMenu) {
			if (monthItem.getText().equalsIgnoreCase(month)) {
				monthItem.click();
				break;
			}
		}

		TimeP.attendanceMyRecordCalendarYearDropDown.click();

		List<WebElement> yearDropdownMenu = TimeP.attendanceMyRecordCalendarYearDropDownMenu;
		for (WebElement yearItem : yearDropdownMenu) {
			if (yearItem.getText().equalsIgnoreCase(year)) {
				yearItem.click();
				break;
			}
		}

	}
	

	public static void calendarFromMenu(String month, String year) {

		TimeP.reportsProjectReportsProjectCalendarFromButton.click();
		TimeP.reportsProjectReportsProjectCalendarFromMonthDropDown.click();

		List<WebElement> monthDropdownMenu = TimeP.reportsProjectReportsProjectCalendarFromMonthMenu;
		for (WebElement monthItem : monthDropdownMenu) {
			if (monthItem.getText().equalsIgnoreCase(month)) {
				monthItem.click();
			}
		}

		TimeP.reportsProjectReportsProjectCalendarFromYearDropDown.click();

		List<WebElement> yearDropdownMenu = TimeP.reportsProjectReportsProjectCalendarFromYearMenu;
		for (WebElement yearItem : yearDropdownMenu) {
			if (yearItem.getText().equalsIgnoreCase(year)) {
				yearItem.click();
			}
		}

	}
	
	public static void calendarToMenu(String month, String year) {

		TimeP.reportsProjectReportsProjectCalendarToButton.click();
		TimeP.reportsProjectReportsProjectCalendarToMonthDropDown.click();

		List<WebElement> monthDropdownMenu = TimeP.reportsProjectReportsProjectCalendarToMonthMenu;
		for (WebElement monthItem : monthDropdownMenu) {
			if (monthItem.getText().equalsIgnoreCase(month)) {
				monthItem.click();
			}
		}

		TimeP.reportsProjectReportsProjectCalendarToYearDropDown.click();

		List<WebElement> yearDropdownMenu = TimeP.reportsProjectReportsProjectCalendarToYearMenu;
		for (WebElement yearItem : yearDropdownMenu) {
			if (yearItem.getText().equalsIgnoreCase(year)) {
				yearItem.click();
				break;
			}
		}
		

	}
	
	public static void claimAssignClaimAddCalendarMenu(String month, String year) {
		ClaimP.ClaimAssginAddExpenseCalendarDropDownButton.click();
		ClaimP.ClaimAssginAddExpenseTypeCalendarMonthDropDown.click();
		waitInSeconds(2);
		List<WebElement> monthDropdownMenu = ClaimP.assignClaimCalendarMonthDropDownMenu;
		for (WebElement monthItem : monthDropdownMenu) {
			if (monthItem.getText().equalsIgnoreCase(month)) {
				monthItem.click();
				break;
			}
		}

		ClaimP.assignClaimCalendarYearDropDown.click();
		waitInSeconds(2);
		List<WebElement> yearDropdownMenu = ClaimP.assignClaimCalendarYearDropDownMenu;
		for (WebElement yearItem : yearDropdownMenu) {
			if (yearItem.getText().equalsIgnoreCase(year)) {
				yearItem.click();
				break;
			}
		}
		
		ClaimP.assignClaimCalendarDate.click();
	}
	
	public static void SubmitAClaimExpenseCalendar(String month, String year) {

		ClaimP.ClaimSubmiAClaimExpenseCalendarDropButton.click();
		
		ClaimP.ClaimSubmiAClaimExpenseDateMonthDropButton.click();
		List<WebElement> monthDropdownMenu = ClaimP.ClaimSubmiAClaimExpenseTypeCalendarMonthDropMenu1;
		for (WebElement monthItem : monthDropdownMenu) {
			if (monthItem.getText().equalsIgnoreCase(month)){
				monthItem.click();
				break;
			}
		}
		ClaimP.ClaimSubmiAClaimExpenseDateYearDropButton.click();
		waitInSeconds(1);
		List<WebElement> yearDropdownMenu = ClaimP.ClaimSubmiAClaimExpenseTypeCalendarYearDropMenu1;
		for (WebElement yearItem : yearDropdownMenu) {
			if (yearItem.getText().equalsIgnoreCase(year)){
				yearItem.click();
				break;
			}
		}
		ClaimP.ClaimSubmiAClaimExpenseDateButton.click();
	}

	public static void calendarPunchOutMenu(String month, String year) {
		waitInSeconds(2);
		TimeP.attendancePunchOutCalendarDateTextBox.click();
		
		TimeP.attendanceMyRecordCalendarMonthDropDown.click();

		List<WebElement> monthDropdownMenu = TimeP.attendanceMyRecordCalendarMonthDropDownMenu;
		for (WebElement monthItem : monthDropdownMenu) {
			if (monthItem.getText().equalsIgnoreCase(month)) {
				waitInSeconds(2);
				monthItem.click();

			}
		}
		TimeP.attendanceMyRecordCalendarYearDropDown.click();

		List<WebElement> yearDropdownMenu = TimeP.attendanceMyRecordCalendarYearDropDownMenu;
		for (WebElement yearItem : yearDropdownMenu) {
			if (yearItem.getText().equalsIgnoreCase(year)) {
				waitInSeconds(2);
				yearItem.click();

			}
		}
		
		
	}

	public static void calendarMenu(String year, String month) {

		TimeP.reportsProjectReportsProjectCalendarToButton.click();
		TimeP.reportsProjectReportsProjectCalendarToYearDropDown.click();

		List<WebElement> yearDropdownMenu = TimeP.reportsProjectReportsProjectCalendarToYearMenu;
		for (WebElement yearItem : yearDropdownMenu) {
			if (yearItem.getText().equalsIgnoreCase(year)) {
				yearItem.click();
			}
		}

		TimeP.reportsProjectReportsProjectCalendarToMonthDropDown.click();

		List<WebElement> monthDropdownMenu = TimeP.reportsProjectReportsProjectCalendarToMonthMenu;
		for (WebElement monthItem : monthDropdownMenu) {
			if (monthItem.getText().equalsIgnoreCase(month)) {
				monthItem.click();
			}
		}

	}
	public static void claimMyClaimsCalendarToMenu(String year, String month) {

		ClaimP.ClaimEmployeeClaimsCalendarToButton.click();
		ClaimP.ClaimEmployeeClaimsCalendarToYearDropDown.click();

		List<WebElement> yearDropdownMenu = ClaimP.ClaimEmployeeClaimsCalendarToYearMenu;
		for (WebElement yearItem : yearDropdownMenu) {
			if (yearItem.getText().equalsIgnoreCase(year)) {
				yearItem.click();
			}
		}

		ClaimP.ClaimEmployeeClaimsCalendarToMonthDropDown.click();
		waitInSeconds(2);
		List<WebElement> monthDropdownMenu = ClaimP.ClaimEmployeeClaimsCalendarToMonthMenu;
		for (WebElement monthItem : monthDropdownMenu) {
			if (monthItem.getText().equalsIgnoreCase(month)) {
				monthItem.click();
			}
		}
		ClaimP.ClaimEmployeeClaimsCalendarToDate.click();

	}
	
	public static void claimMyClaimsCalendarFromMenu(String month, String year) {

		ClaimP.ClaimEmployeeClaimsCalendarFromButton.click();
		ClaimP.ClaimEmployeeClaimsCalendarMonthFromDropDownButton.click();
		waitInSeconds(2);
		List<WebElement> yearDropdownMenu = ClaimP.ClaimEmployeeClaimsCalendarFromMonthMenu;
		for (WebElement yearItem : yearDropdownMenu) {
			if (yearItem.getText().equalsIgnoreCase(year)) {
				yearItem.click();
			}
		}

		ClaimP.ClaimEmployeeClaimsCalendarYearFromDropDownButton.click();

		List<WebElement> monthDropdownMenu = ClaimP.ClaimEmployeeClaimsCalendarFromYearMenu;
		for (WebElement monthItem : monthDropdownMenu) {
			if (monthItem.getText().equalsIgnoreCase(month)) {
				monthItem.click();
			}
		}
		
	}
	public static void waitInSeconds(Integer second) {
		try {
			Thread.sleep(second * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
