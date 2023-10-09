package utilities;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
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


public class CommonMethods extends PageInitializer {
	
	
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
	
	
//	below method clicks on one of the tabs on the My Info page
	public static void clickOnMyInfoTabItem(String itemText) {
		List<WebElement> myInfoTabs = myInfoP.myInfoTabItem;
		for(WebElement tabItem : myInfoTabs) {
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
	public void onClick(WebElement element) {
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
	
	
//	JavaScript Executor click method
//	CommonMethods.jsClick(BaseClass.getDriver().findElement(By.xpath("")));
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click()", element);
	}
	
	
//	JavaScript Executor scroll element into view method
	public static void jsScrollToElement(WebElement element) {
		getJSObject().executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
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
	
	
//	methods checks if radio/checkbox is enabled and clicks on it
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
		

}
