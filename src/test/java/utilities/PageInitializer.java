package utilities;

import pages.AdminPage;
import pages.AdminQualificationsSkillsPage;
import pages.ClaimPage;
import pages.CommonPage;
import pages.DirectoryPage;
import pages.EmployeeTrackerPage;
import pages.IntegritySelfDevelopmentPage;
import pages.KPIsPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.MyInfoPage;
import pages.MyInfo_ContactDetailsPage;
import pages.MyInfo_JobPage;
import pages.MyInfo_PersonalDetailsPage;
import pages.MyInfo_ReportToPage;
import pages.PIMConfiguration;
import pages.MyTrackerPage;
import pages.PerformancePage;
import pages.Performance_ConfigureTab;
import pages.Recruitment_CandidatesPage;
import pages.Recruitment_VacanciesPage;
import pages.TimePage;

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
	public static MyInfo_PersonalDetailsPage personalDetailsP;
	public static MyInfo_ContactDetailsPage contactP;
	public static AdminPage adminP;
	public static AdminQualificationsSkillsPage skillsP;
	public static Recruitment_CandidatesPage recruitmentCandidatesP;
	public static Recruitment_VacanciesPage recruitmentVacanciesP;
	public static DirectoryPage dirP;
	public static ClaimPage ClaimP;
	public static TimePage TimeP;
	public static PIMConfiguration pimCon;

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
		iSDPg = new IntegritySelfDevelopmentPage();
		employeeTrack = new EmployeeTrackerPage();
		myTrack = new MyTrackerPage();
		personalDetailsP = new MyInfo_PersonalDetailsPage();
		contactP = new MyInfo_ContactDetailsPage();
		adminP = new AdminPage();
		skillsP = new AdminQualificationsSkillsPage();
		recruitmentCandidatesP = new Recruitment_CandidatesPage();
		recruitmentVacanciesP = new Recruitment_VacanciesPage();
		dirP = new DirectoryPage();
		ClaimP = new ClaimPage();
		TimeP = new TimePage();
    pimCon = new PIMConfiguration();

    
	}

}
