package utilities;

import pages.CommonPage;
import pages.EmployeeTrackerPage;
import pages.IntegritySelfDevelopmentPage;
import pages.KPIsPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.MyInfoPage;
import pages.MyInfo_JobPage;
import pages.MyInfo_ReportToPage;
import pages.MyTrackerPage;
import pages.PerformancePage;
import pages.Performance_ConfigureTab;

public class PageInitializer extends BaseClass {
	
	public static LoginPage lp;
	public static LandingPage landP;
	public static CommonPage comP;
	public static MyInfoPage myInfoP;
	public static MyInfo_ReportToPage reportToP;
	public static MyInfo_JobPage jobP;
	public static PerformancePage perform;
	public static Performance_ConfigureTab performconfig; 
	public static KPIsPage kpisPg; 
	public static IntegritySelfDevelopmentPage iSDPg; 
	public static EmployeeTrackerPage employeeTrack; 
	public static MyTrackerPage myTrack; 
	
	public static void initialize() {
		lp = new LoginPage();
		landP = new LandingPage();
		comP = new CommonPage();
		myInfoP = new MyInfoPage();
		reportToP = new MyInfo_ReportToPage();
		jobP = new MyInfo_JobPage();
		perform = new PerformancePage(); 
		performconfig = new Performance_ConfigureTab(); 
		kpisPg = new KPIsPage();
	    iSDPg  = new IntegritySelfDevelopmentPage(); 
	    employeeTrack = new EmployeeTrackerPage(); 
	    myTrack = new MyTrackerPage(); 
	}

}
