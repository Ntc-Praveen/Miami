package GenericLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConstants{
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws Throwable {
		FileLib fl = new FileLib();
		String browser = fl.readPropData(PROP_PATH, "browser");
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);
			//options.addArguments("--start-maximized");
			options.addArguments("--remote-allow-origins=*");
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
		    driver = new FirefoxDriver(options);
		    //options.addArguments("--start-maximized");
		    options.addArguments("--remote-allow-origins=*");
		}
		
		else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
		    driver = new EdgeDriver(options);
		    //options.addArguments("--start-maximized");
		}

		else {
			Reporter.log("Enter Proper Browser name", true);
		}

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		String appUrl = fl.readPropData(PROP_PATH, "url");
		driver.get(appUrl);

		WebDriverCommonLib wlib = new WebDriverCommonLib();
		Thread.sleep(3000);
		wlib.verify(wlib.getPageTitle(),
				fl.readPropData(PROP_PATH, "loginTitle"), "Login Page");
	}

//	@AfterClass(enabled=true)
//	public void closeBrowser() {	
//		driver.quit();
//	}

	

}
