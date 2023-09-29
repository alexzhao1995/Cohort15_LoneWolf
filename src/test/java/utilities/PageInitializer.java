package utilities;

import pages.CommonPage;
import pages.LandingPage;
import pages.LoginPage;

public class PageInitializer extends BaseClass {
	
	public static LoginPage lp;
	public static LandingPage landP;
	public static CommonPage comP;
	
	public static void initialize() {
		lp = new LoginPage();
		landP = new LandingPage();
		comP = new CommonPage();
	}

}
