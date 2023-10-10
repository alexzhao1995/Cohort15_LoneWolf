package effort_khang;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import utilities.BaseClass;
import utilities.CommonMethods;

public class orangeHRM_TestingLogin extends CommonMethods {


//	WebDriver driver;
//	
//	@Test
//	public void questionMarkLink() {
//	    WebDriver driver = BaseClass.getDriver();
//	    WebDriverWait wait = new WebDriverWait(driver, 10);
//
//	    try {
//	        driver.findElement(By.xpath(BaseClass.getProperty("usernameInputField")))
//	                .sendKeys(BaseClass.getProperty("Username"));
//	        driver.findElement(By.xpath(BaseClass.getProperty("passwordInputField")))
//	                .sendKeys(BaseClass.getProperty("Password"));
//	        driver.findElement(By.xpath(BaseClass.getProperty("loginButton"))).click();
//
//	        WebElement helpButton = wait
//	                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Help']")));
//	        helpButton.click();
//	        String parentWindow = driver.getWindowHandle();
//	        Set<String> Windows = driver.getWindowHandles();
//	        Iterator<String> it = Windows.iterator();
//
//	        while (it.hasNext()) {
//	            String childWindow = it.next();
//	            driver.switchTo().window(childWindow);
//	            String actualTitle = driver.getTitle();
//	            System.out.println(childWindow);
//
//	            if (!childWindow.equalsIgnoreCase(parentWindow)) {
//	                if (actualTitle.equalsIgnoreCase("Security Check")) {
//	               
//	                    System.out.println("Security Check page opened. Handling it...");
//	                    driver.close();
//	                } else {
//	                    // Handle other pages
//	                    driver.findElement(By.xpath("//div[@class='logo']//img")).click();
//	                    driver.switchTo().window(parentWindow);
//	                    clickOnItemProfileDropdown("Logout");
//	            		Assert.assertTrue(lp.userNameInputField.isDisplayed());
//	            		Assert.assertTrue(lp.passwordInputField.isDisplayed());
//	                }
//	            }
//	        }
//
//	        // Switch back to the parent window
//	        driver.switchTo().window(parentWindow);
//	    } catch (Exception e5) {
//	      
//	System.err.println("An error occurred: " + e5.getMessage());
//	        e5.printStackTrace();
//	    }
//	}

	@Test

	public void timeReports1() {
//Reports page search employee records

		try {
			lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));

			CommonMethods.clickOnMainTab("Time");
			CommonMethods.reportsMenu("Project Reports");
			waitInSeconds(2);
			TimeP.reportsProjectReportsProjectNameBox.sendKeys("Global");
			TimeP.reportsProjectReportsProjectCompanyName.click();

			CommonMethods.calendarFromMenu("August", "2022");
			TimeP.reportsProjectReportsProjectCalendarFromDate.click();
			waitInSeconds(2);
			TimeP.reportsProjectReportsProjectCalendarToButton.sendKeys("2022-09-07");
			// CommonMethods.calendarToMenu("2023","September");
			// TimeP.reportsProjectReportsProjectCalendarToDate.click();

			TimeP.reportsProjectReportsProjectViewButton.click();

			Assert.assertTrue(TimeP.reportsProjectReportsProjectCompanyRecords.isDisplayed());

		} catch (Exception e1) {

			System.err.println("An error occurred: " + e1.getMessage());
			e1.printStackTrace();
		}
	}

//////ProjectInfo page Add customers

@Test
public void addCustomers() {

try {
	lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
	CommonMethods.clickOnMainTab("Time");
	TimeP.projectInfoDropDown.click();
		CommonMethods.projectInfoMenu("Customers");
		
		TimeP.projectInfoCustomersAddButton.click();
		waitInSeconds(3);
		TimeP.projectInfoCustomersName.sendKeys("c");
		TimeP.projectInfoCustomersDesc.sendKeys("projectInfoCustomersDesc");
		
		TimeP.projectInfoCustomersSaveButton.click();
		
		//CommonMethods.projectInfoEmployeeNamesTable("John Doe");
		waitInSeconds(3);
		
		    String searchText = "P";

		    boolean isTextFound = CommonMethods.projectInfoEmployeeNamesTable(searchText);

		    // Print the result based on the condition
		    if (isTextFound) {
		        System.out.println(searchText + " has been added to the list");
		    } else {
		        System.out.println(searchText + " was not found in the list");
		    }
		   //Must find a project name to delete first and find xpath for that
   	    TimeP.projectInfoCustomersDeleteButton.click();
}catch (Exception e11) {
 
    System.err.println("An error occurred: " + e11.getMessage());
    e11.printStackTrace();
}	
}

////PunchOut function, date and time needs to be updated when performing retest

@Test
public void punchOutFunction() {
	try {
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
		CommonMethods.clickOnMainTab("Time");
		TimeP.attendanceDropDownButton.click();
		    CommonMethods.attendanceDropDownMenu("Punch In/Out");

		    CommonMethods.calendarPunchOutMenu("October","2023");
		    TimeP.attendanceMyRecordCalendarDate.click();
		    TimeP.attendancePunchOutCalendarDateButton.click();
		    waitInSeconds(2);
		    TimeP.attendancePunchOutCalendarTimeTextBox.click();
		    waitInSeconds(2);
		    TimeP.attendancePunchOutCalendarTimeTextBox.clear();
		    TimeP.attendancePunchOutCalendarTimeTextBox.sendKeys("1:36 P.M");
		    TimeP.attendancePunchOutCalendarTimeButton.click();
		    TimeP.attendancePunchOutButton.click();
}catch (Exception e3) {
    // Handle the exception or log it
    System.err.println("An error occurred: " + e3.getMessage());
    e3.printStackTrace();
}	
}
		
////// Attendance Page
@Test
public void checkAttendance() {
		try {
	lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
	CommonMethods.clickOnMainTab("Time");
	TimeP.attendanceDropDownButton.click();
			    CommonMethods.attendanceDropDownMenu("My Records");
			    CommonMethods.myAttendanceRecordCalendar("09","2022");
			    TimeP.attendanceMyRecordCalendarDate.click();
			    TimeP.attendancePunchOutViewButton.click();
	}catch (Exception e4) {
	    // Handle the exception or log it
	    System.err.println("An error occurred: " + e4.getMessage());
	    e4.printStackTrace();
	}			
		
}
////Timesheets page	
		@Test
	public void checkTimesheets() {	
	try {
	 lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
	 CommonMethods.clickOnMainTab("Time");   
	 waitInSeconds(2);
	TimeP.TimeSheetsDropDownButton.click();
		CommonMethods.timeSheetsDropDownMenu("Employee Timesheets");
		    TimeP.TimeSheetsEmployeeNamesTextBox.sendKeys("Odi");
		    TimeP.TimeSheetsEmployeePoppedUpName.click();
		    TimeP.TimeSheetsEmployeeTimeSheetsViewButton.click();
	}catch (Exception e6) {
  
    System.err.println("An error occurred: " + e6.getMessage());
    e6.printStackTrace();

}	
	}


	@Test
	public void assignAClaimTest() {
////Assign a claim
		lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
		CommonMethods.clickOnMainTab("Claim");
		try {	
		ClaimP.ClaimAssginClaimTab.click();
		CommonMethods.assignClaimEmployeeNameDropDownMenu("Odis Adalwin");
		waitInSeconds(2);
		ClaimP.ClaimAssginRemarkTextBox.sendKeys("travel allowance");
		CommonMethods.assignClaimEmployeeCurrencyDropDownMenu("Afghanistan Afghani");
		CommonMethods.assignClaimEmployeeEventDropDownMenu("Accommodation");

		ClaimP.ClaimAssginAddExpenseButton.click();
		CommonMethods.claimAssginAddExpenseDropDownMenu("Planned Surgery");
		waitInSeconds(2);
		CommonMethods.claimAssignClaimAddCalendarMenu("September","2022");
		waitInSeconds(2);
		ClaimP.ClaimAssginAddExpenseNoteInputBox.sendKeys("surgery fee");
		waitInSeconds(2);
		ClaimP.ClaimAssginAddExpenseAmountInputBox.sendKeys("4000");
		waitInSeconds(2);
		ClaimP.ClaimAssginSaveButton.click();
		ClaimP.ClaimAssginSubmitButton.click();
		
	    } catch (Exception e) {
	        // Handle the exception or log it
	        System.err.println("An error occurred: " + e.getMessage());
	        e.printStackTrace();
	    }
	}

////		//Submit a claim
	@Test
	public void submitAClaim() {
	try {	
	 lp.loginToHrm(BaseClass.getProperty("username"),
	 BaseClass.getProperty("password"));
	 CommonMethods.clickOnMainTab("Claim");
	 ClaimP.ClaimSubmiAClaimTab.click();
		ClaimP.ClaimSubmiAClaimEventDropDownButton.click();
		ClaimP.ClaimSubmiAClaimEventTravelAllowance.click();
		ClaimP.ClaimSubmiAClaimCurrencyDropDown.click();
		ClaimP.ClaimSubmiAClaimCurrencyUnitedStates.click();
		ClaimP.ClaimSubmiAClaimRemarksBox.sendKeys("request for travel allowance");
		ClaimP.ClaimSubmiAClaimCreateButton.click();
		ClaimP.ClaimSubmiAClaimAddButton.click();
		
		waitInSeconds(2);
		ClaimP.ClaimSubmiAClaimExpenseAmountTextBox.sendKeys("200");
		waitInSeconds(2);
		ClaimP.ClaimSubmiAClaimExpenseTypeDropButton.click();
		ClaimP.ClaimSubmiAClaimExpenseTypeAddExpenseAccommodation.click();
		waitInSeconds(2);
		CommonMethods.SubmitAClaimExpenseCalendar("August","2023");
		waitInSeconds(2);
		ClaimP.ClaimSubmiAClaimExpenseNoteTextBox.sendKeys("travel allowance");
		
		waitInSeconds(3);
		ClaimP.ClaimSubmiAClaimExpenseSaveButton.click();
		waitInSeconds(4);
		ClaimP.ClaimSubmiAClaimExpenseSubmitButton.click();
		
    } catch (Exception e) {
        System.err.println("An error occurred: " + e.getMessage());
        e.printStackTrace();
    }
}
	
		
//		//Cancel a claim
	@Test
	public void cancelAClaim() {	
		 try {
	 lp.loginToHrm(BaseClass.getProperty("username"),
	 BaseClass.getProperty("password"));
	 CommonMethods.clickOnMainTab("Claim");
	 ClaimP.myClaimsTab.click();
		ClaimP.myclaimsViewDetailsButton.click();
		ClaimP.myClaimsCancelButton.click();
		ClaimP.myClaimsBackButton.click();
		    } catch (Exception e6) {
		        // Handle the exception or log it
		        System.err.println("An error occurred: " + e6.getMessage());
		        e6.printStackTrace();
	
	} 
	}
		 
////		//Claim reset function
	@Test
		public void resetAClaim() { 
		 try {
	 lp.loginToHrm(BaseClass.getProperty("username"),
	 BaseClass.getProperty("password"));
	 CommonMethods.clickOnMainTab("Claim");
	 waitInSeconds(2);
		CommonMethods.claimEmployeeInfoPoppedUpList1("Lisa Andrews", "202307180000006","Accommodation","Paid","Current Employees Only");
		waitInSeconds(2);
		CommonMethods.claimMyClaimsCalendarFromMenu("September","2023");
		waitInSeconds(2);
		CommonMethods.claimMyClaimsCalendarToMenu("2023","October");
		ClaimP.ClaimEmployeeClaimsSearchButton.click();
		ClaimP.ClaimEmployeeClaimsResetButton.click();
		  System.out.println("Logged in successfully.");
		    } catch (Exception e8) {
		        // Handle the exception or log it
		        System.err.println("An error occurred: " + e8.getMessage());
		        e8.printStackTrace();
	
	}	
		}

//		//Inactivate event type
		@Test
		public void inactivateAClaim() {
			try {
				lp.loginToHrm(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
				CommonMethods.clickOnMainTab("Claim");
				ClaimP.claimConfigurationsButton.click();
				CommonMethods.claimConfigurationsDropMenu("Events");
				ClaimP.claimConfigurationsEventsAddButton.click();
				ClaimP.claimConfigurationsEventsEventName.sendKeys("Company Outing");
				ClaimP.claimConfigurationsEventsDescBox.sendKeys("company outing events");
				ClaimP.claimConfigurationsEventsToggleButton.click();
				ClaimP.claimConfigurationsEventsSaveButton.click();
				waitInSeconds(5);
				CommonMethods.configurationsEventInactivateFunction("Company Dinner", "Inactive");

			} catch (Exception e8) {
				// Handle the exception or log it
				System.err.println("An error occurred: " + e8.getMessage());
				e8.printStackTrace();
			}
		}

	WebDriver driver;

	
	@Test
	public void questionMarkLink() {
	    WebDriver driver = BaseClass.getDriver();
	    WebDriverWait wait = new WebDriverWait(driver, 10);

	    try {
	        driver.findElement(By.xpath(BaseClass.getProperty("usernameInputField")))
	                .sendKeys(BaseClass.getProperty("Username"));
	        driver.findElement(By.xpath(BaseClass.getProperty("passwordInputField")))
	                .sendKeys(BaseClass.getProperty("Password"));
	        driver.findElement(By.xpath(BaseClass.getProperty("loginButton"))).click();

	        WebElement helpButton = wait
	                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Help']")));
	        helpButton.click();
	        String parentWindow = driver.getWindowHandle();
	        Set<String> Windows = driver.getWindowHandles();
	        Iterator<String> it = Windows.iterator();

	        while (it.hasNext()) {
	            String childWindow = it.next();
	            driver.switchTo().window(childWindow);
	            String actualTitle = driver.getTitle();
	            System.out.println(childWindow);

	            if (!childWindow.equalsIgnoreCase(parentWindow)) {
	                if (actualTitle.equalsIgnoreCase("Security Check")) {
	               
	                    System.out.println("Security Check page opened. Handling it...");
	                    driver.close();
	                } else {
	                    // Handle other pages
	                    driver.findElement(By.xpath("//div[@class='logo']//img")).click();
	                    driver.switchTo().window(parentWindow);
	                    clickOnItemProfileDropdown("Logout");
	            		Assert.assertTrue(lp.userNameInputField.isDisplayed());
	            		Assert.assertTrue(lp.passwordInputField.isDisplayed());
	                }
	            }
	        }

	        // Switch back to the parent window
	        driver.switchTo().window(parentWindow);
	    } catch (Exception e5) {
	      
	System.err.println("An error occurred: " + e5.getMessage());
	        e5.printStackTrace();
	    }
	}

	@Test
	public void timeReports() {
		BaseClass.getDriver().findElement(By.xpath(BaseClass.getProperty("usernameInputField")))
				.sendKeys(BaseClass.getProperty("Username"));

		BaseClass.getDriver().findElement(By.xpath(BaseClass.getProperty("passwordInputField")))
				.sendKeys(BaseClass.getProperty("Password"));

		BaseClass.getDriver().findElement(By.xpath(BaseClass.getProperty("loginButton"))).click();
		CommonMethods.clickOnMainTab("Time");

//Reports page search employee records
try {
		CommonMethods.reportsMenu("Project Reports");
		waitInSeconds(2);

		TimeP.reportsProjectReportsProjectNameBox.sendKeys("Global");
		TimeP.reportsProjectReportsProjectCompanyName.click();
		
		CommonMethods.calendarFromMenu("September", "2022");
		TimeP.reportsProjectReportsProjectCalendarFromDate.click();
		
		CommonMethods.calendarToMenu("2023","October");
		TimeP.reportsProjectReportsProjectCalendarToDate.click();
		
		TimeP.reportsProjectReportsProjectViewButton.click();
		
		Assert.assertTrue(TimeP.reportsProjectReportsProjectCompanyRecords.isDisplayed());
		
		TimeP.projectInfoDropDown.click();
}catch (Exception e1) {
	
    System.err.println("An error occurred: " + e1.getMessage());
    e1.printStackTrace();
}

//////ProjectInfo page Add customers
//	try {
//		CommonMethods.projectInfoMenu("Customers");
//		
//		TimeP.projectInfoCustomersAddButton.click();
//		
//		TimeP.projectInfoCustomersName.sendKeys(BaseClass.getProperty("projectInfoCustomersName"));
//		TimeP.projectInfoCustomersDesc.sendKeys("projectInfoCustomersDesc");
//		
//		TimeP.projectInfoCustomersSaveButton.click();
//		
//		//CommonMethods.projectInfoEmployeeNamesTable("John Doe");
//		waitInSeconds(3);
//		
//		    String searchText = "P";
//
//		    boolean isTextFound = CommonMethods.projectInfoEmployeeNamesTable(searchText);
//
//		    // Print the result based on the condition
//		    if (isTextFound) {
//		        System.out.println(searchText + " has been added to the list");
//		    } else {
//		        System.out.println(searchText + " was not found in the list");
//		    }
//		   //Must find a project name to delete first and find xpath for that
//   	    TimeP.projectInfoCustomersDeleteButton.click();
//}catch (Exception e11) {
// 
//    System.err.println("An error occurred: " + e11.getMessage());
//    e11.printStackTrace();
//}	
//
//////	/*
//////	 * PunchOut function, date and time needs to be updated when performing retest
//////	 */
//	try {
//		    TimeP.attendanceDropDownButton.click();
//		    CommonMethods.attendanceDropDownMenu("Punch In/Out");
//
//		    CommonMethods.calendarPunchOutMenu("October","2023");
//		    TimeP.attendanceMyRecordCalendarDate.click();
//		    TimeP.attendancePunchOutCalendarDateButton.click();
//		    waitInSeconds(2);
//		    TimeP.attendancePunchOutCalendarTimeTextBox.click();
//		    waitInSeconds(2);
//		    TimeP.attendancePunchOutCalendarTimeTextBox.clear();
//		    TimeP.attendancePunchOutCalendarTimeTextBox.sendKeys("8:36 AM");
//		    TimeP.attendancePunchOutCalendarTimeButton.click();
//		    TimeP.attendancePunchOutButton.click();
//}catch (Exception e3) {
//    // Handle the exception or log it
//    System.err.println("An error occurred: " + e3.getMessage());
//    e3.printStackTrace();
//}	
//		
////// Attendance Page
//		try {
//			    TimeP.attendanceDropDownButton.click();
//			    CommonMethods.attendanceDropDownMenu("My Records");
//			    CommonMethods.myAttendanceRecordCalendar("09","2022");
//			    TimeP.attendanceMyRecordCalendarDate.click();
//			    TimeP.attendancePunchOutViewButton.click();
//	}catch (Exception e4) {
//	    // Handle the exception or log it
//	    System.err.println("An error occurred: " + e4.getMessage());
//	    e4.printStackTrace();
//	}			
//		
////PunchIn function	function, date and time needs to be updated when performing retest	
////Timesheets page	
//		
//	try {
//		    waitInSeconds(2);
//	TimeP.TimeSheetsDropDownButton.click();
//		CommonMethods.timeSheetsDropDownMenu("Employee Timesheets");
//		    TimeP.TimeSheetsEmployeeNamesTextBox.sendKeys("Paul");
//		    TimeP.TimeSheetsEmployeePoppedUpName.click();
//		    TimeP.TimeSheetsEmployeeTimeSheetsViewButton.click();
//	}catch (Exception e6) {
//  
//    System.err.println("An error occurred: " + e6.getMessage());
//    e6.printStackTrace();
//
//}	
//	}
//
//	@Test
//	public void claimTest() {
////Assign a claim
//		BaseClass.getDriver().findElement(By.xpath(BaseClass.getProperty("usernameInputField")))
//				.sendKeys(BaseClass.getProperty("Username"));
//
//		BaseClass.getDriver().findElement(By.xpath(BaseClass.getProperty("passwordInputField")))
//				.sendKeys(BaseClass.getProperty("Password"));
//
//		BaseClass.getDriver().findElement(By.xpath(BaseClass.getProperty("loginButton"))).click();
//
//		CommonMethods.clickOnMainTab("Claim");
//		try {	
//		ClaimP.ClaimAssginClaimTab.click();
//		CommonMethods.assignClaimEmployeeNameDropDownMenu("Odis Adalwin");
//		waitInSeconds(2);
//		ClaimP.ClaimAssginRemarkTextBox.sendKeys("travel allowance");
//		CommonMethods.assignClaimEmployeeCurrencyDropDownMenu("Afghanistan Afghani");
//		CommonMethods.assignClaimEmployeeEventDropDownMenu("Accommodation");
//
//		ClaimP.ClaimAssginAddExpenseButton.click();
//		CommonMethods.claimAssginAddExpenseDropDownMenu("Planned Surgery");
//		waitInSeconds(2);
//		CommonMethods.claimAssignClaimAddCalendarMenu("September","2022");
//		waitInSeconds(2);
//		ClaimP.ClaimAssginAddExpenseNoteInputBox.sendKeys("surgery fee");
//		waitInSeconds(2);
//		ClaimP.ClaimAssginAddExpenseAmountInputBox.sendKeys("4000");
//		waitInSeconds(2);
//		ClaimP.ClaimAssginSaveButton.click();
//		ClaimP.ClaimAssginSubmitButton.click();
//		
//	    } catch (Exception e) {
//	        // Handle the exception or log it
//	        System.err.println("An error occurred: " + e.getMessage());
//	        e.printStackTrace();
//	    }
//	
//
////		//Submit a claim
//		try {		
//		ClaimP.ClaimSubmiAClaimTab.click();
//		ClaimP.ClaimSubmiAClaimEventDropDownButton.click();
//		ClaimP.ClaimSubmiAClaimEventTravelAllowance.click();
//		ClaimP.ClaimSubmiAClaimCurrencyDropDown.click();
//		ClaimP.ClaimSubmiAClaimCurrencyUnitedStates.click();
//		ClaimP.ClaimSubmiAClaimRemarksBox.sendKeys("request for travel allowance");
//		ClaimP.ClaimSubmiAClaimCreateButton.click();
//		ClaimP.ClaimSubmiAClaimAddButton.click();
//		
//		waitInSeconds(2);
//		ClaimP.ClaimSubmiAClaimExpenseAmountTextBox.sendKeys("200");
//		waitInSeconds(2);
//		ClaimP.ClaimSubmiAClaimExpenseTypeDropButton.click();
//		ClaimP.ClaimSubmiAClaimExpenseTypeAddExpenseAccommodation.click();
//		waitInSeconds(2);
//		CommonMethods.SubmitAClaimExpenseCalendar("August","2023");
//		waitInSeconds(2);
//		ClaimP.ClaimSubmiAClaimExpenseNoteTextBox.sendKeys("travel allowance");
//		
//		waitInSeconds(3);
//		ClaimP.ClaimSubmiAClaimExpenseSaveButton.click();
//		waitInSeconds(4);
//		ClaimP.ClaimSubmiAClaimExpenseSubmitButton.click();
//		
//    } catch (Exception e) {
//        System.err.println("An error occurred: " + e.getMessage());
//        e.printStackTrace();
//
//}	
//		
//		//Cancel a claim
//		
//		 try {
//		ClaimP.myClaimsTab.click();
//		ClaimP.myclaimsViewDetailsButton.click();
//		ClaimP.myClaimsCancelButton.click();
//		ClaimP.myClaimsBackButton.click();
//		    } catch (Exception e6) {
//		        // Handle the exception or log it
//		        System.err.println("An error occurred: " + e6.getMessage());
//		        e6.printStackTrace();
//	
//	} 
//		 
////		//Claim reset function
//		 
//		 try {
//		waitInSeconds(2);
//		CommonMethods.claimEmployeeInfoPoppedUpList1("Lisa Andrews", "202307180000006","Accommodation","Paid","Current Employees Only");
//		waitInSeconds(2);
//		CommonMethods.claimMyClaimsCalendarFromMenu("September","2023");
//		waitInSeconds(2);
//		CommonMethods.claimMyClaimsCalendarToMenu("2023","October");
//		ClaimP.ClaimEmployeeClaimsSearchButton.click();
//		ClaimP.ClaimEmployeeClaimsResetButton.click();
//		  System.out.println("Logged in successfully.");
//		    } catch (Exception e8) {
//		        // Handle the exception or log it
//		        System.err.println("An error occurred: " + e8.getMessage());
//		        e8.printStackTrace();
//	
//	}	
//		 
//		//Inactivate event type
//		 
//	 try {
//		ClaimP.claimConfigurationsButton.click();
//		CommonMethods.claimConfigurationsDropMenu("Events");
//		ClaimP.claimConfigurationsEventsAddButton.click();
//		ClaimP.claimConfigurationsEventsEventName.sendKeys("Company Outing");		
//		ClaimP.claimConfigurationsEventsDescBox.sendKeys("company outing events");
//		ClaimP.claimConfigurationsEventsToggleButton.click();
//		ClaimP.claimConfigurationsEventsSaveButton.click();
//		waitInSeconds(5);
//		CommonMethods.configurationsEventInactivateFunction("Company Dinner","Inactive");
//	
//	 } catch (Exception e8) {
//	        // Handle the exception or log it
//	        System.err.println("An error occurred: " + e8.getMessage());
//	        e8.printStackTrace();
//}	

	 }
}



