package assessorData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GenericLib.BaseTest;
import GenericLib.MyListeners;
import GenericLib.WebDriverCommonLib;

public class Dashboard extends BaseTest {

//	Start Job xpaths
	@FindBy(xpath = "//*[@id='startTask']")private WebElement startJob;
	@FindBy(xpath="/html/body/div/div/div[4]/div/button")private WebElement startJobOk;
	@FindBy(xpath = "//h3[@id='totalTask1']")private WebElement totalTasksHeader;
	@FindBy(xpath = "//*[@id='Pending']")private WebElement pendingJob;
	@FindBy(xpath = "//*[@id='Completed']")private WebElement completedJob;
	@FindBy(xpath = "//*[@id='Unabletocomplete']")private WebElement unabletoCompletedJob;


	public Dashboard() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getStartJob() {
		return startJob;
	}
	public WebElement getstartJobOk() {
		return startJobOk;
	}
	public WebElement getTotalTasksHeader() {
		return totalTasksHeader;
	}
	public WebElement getPendingJob() {
		return pendingJob;
	}
	public WebElement getCompletedJob() {
		return completedJob;
	}
	public WebElement getUnabletoCompletedJob() {
		return unabletoCompletedJob;
	}

	WebDriverCommonLib ComLib = new WebDriverCommonLib();
	String time = ComLib.sysTimeStamp;

	MyListeners lisn = new MyListeners();

//	@priority=1
	public void AssessorDashboard() throws InterruptedException {
		System.out.println(time);

		try {
			startJob.click();
			System.out.println("Clicked on Start Job");
			startJobOk.click();

		} catch (Exception e) {
			System.out.println("Start job button not available : Exception Handled");
		}

		ComLib.waitForElementVisibility(totalTasksHeader);
		ComLib.fullPageScreenshot("C:\\NTC Projects\\ScreenShots\\" + time + ".png");
		System.out.println("Screenshot taken");
		Thread.sleep(3000);
		completedJob.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Completed Job");
		unabletoCompletedJob.click();
		Thread.sleep(2000);
		System.out.println("Clicked on unabletoCompleted Job");
		pendingJob.click();
		ComLib.waitForElementVisibility(totalTasksHeader);
		Thread.sleep(15000);
		System.out.println("Clicked on Pending Job");
	}

	
}
