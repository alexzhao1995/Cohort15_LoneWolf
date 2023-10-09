package utilities;

import pages.CommonPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.MyInfoPage;
import pages.MyInfo_JobPage;
import pages.MyInfo_ReportToPage;
import pages.Recruitment_CandidatesPage;
import pages.Recruitment_VacanciesPage;

public class PageInitializer extends BaseClass {
	
	public static LoginPage lp;
	public static LandingPage landP;
	public static CommonPage comP;
	public static MyInfoPage myInfoP;
	public static MyInfo_ReportToPage reportToP;
	public static MyInfo_JobPage jobP;
	public static Recruitment_CandidatesPage recruitmentCandidatesP;
	public static Recruitment_VacanciesPage recruitmentVacanciesP;
	
	public static void initialize() {
		lp = new LoginPage();
		landP = new LandingPage();
		comP = new CommonPage();
		myInfoP = new MyInfoPage();
		reportToP = new MyInfo_ReportToPage();
		jobP = new MyInfo_JobPage();
		recruitmentCandidatesP = new Recruitment_CandidatesPage();
		recruitmentVacanciesP = new Recruitment_VacanciesPage();
		
	}

}
