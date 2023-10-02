package utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static WebDriver driver; // declaring driver
	public static FileInputStream input;
	public static Properties configFile;

	
//	instantiate new driver instance and instantiate driver type using singleton type (if method)
	@BeforeMethod
	public static WebDriver getDriver() {

		if (driver == null) {

			switch (BaseClass.getProperty("browser")) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(); // initializing driver
				break;
			case "safari":
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			}
			driver.manage().window().maximize();
			driver.get(BaseClass.getProperty("orangeHRM"));
//			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Constants.implicit_wait_time, TimeUnit.SECONDS);

			PageInitializer.initialize();

		}

		return driver;
	}

	
//	tear down instance of driver
	@AfterMethod(enabled = false)
	public static void tearDown() {

		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}
	
	
//	create block of code to read properties file
	
	static {
		try {

//	public static void setupProperties() { // instead of making it a method, create a try catch so it'll execute 

//		where the file path to properties
//			String filePath = "src/test/resources/properties/confi_data.properties";
			
			String filePath = Constants.propertiesFilePath;

//		get connection to the file using FileInputStream
			input = new FileInputStream(filePath);

//		using Properties class, load the data
			configFile = new Properties();
			configFile.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
//	read the data method
	public static String getProperty(String keyValueName) {
		return configFile.getProperty(keyValueName);
	}
	
	
	

}
