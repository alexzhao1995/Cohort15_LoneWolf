package utilities;

import pages.ClaimPage;
import pages.CommonPage;
import pages.DirectoryPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.MyInfoPage;
import pages.MyInfo_ContactDetailsPage;
import pages.MyInfo_JobPage;
import pages.MyInfo_PersonalDetailsPage;
import pages.MyInfo_ReportToPage;
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
	public static MyInfo_PersonalDetailsPage personalDetailsP;
	public static MyInfo_ContactDetailsPage contactP;
	public static Recruitment_CandidatesPage recruitmentCandidatesP;
	public static Recruitment_VacanciesPage recruitmentVacanciesP;
	public static DirectoryPage dirP;
	public static ClaimPage ClaimP;
	public static TimePage TimeP;
	
	public static void initialize() {
		lp = new LoginPage();
		landP = new LandingPage();
		comP = new CommonPage();
		myInfoP = new MyInfoPage();
		reportToP = new MyInfo_ReportToPage();
		jobP = new MyInfo_JobPage();
		personalDetailsP = new MyInfo_PersonalDetailsPage();
		contactP = new MyInfo_ContactDetailsPage();
		recruitmentCandidatesP = new Recruitment_CandidatesPage();
		recruitmentVacanciesP = new Recruitment_VacanciesPage();
		dirP = new DirectoryPage();
		ClaimP = new ClaimPage();
		TimeP = new TimePage();

  }

}
