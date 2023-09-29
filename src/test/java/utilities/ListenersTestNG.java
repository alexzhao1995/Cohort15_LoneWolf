package utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		CommonMethods.takeScreenshot("LoneWolf");
	}
	
}
