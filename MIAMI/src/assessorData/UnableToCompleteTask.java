package assessorData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import GenericLib.BaseTest;
import GenericLib.MyListeners;
import GenericLib.WebDriverCommonLib;

public class UnableToCompleteTask extends BaseTest {

//	Start Job xpaths
	@FindBy(xpath = "//*[@id='startTask']")	private WebElement startJob;
	@FindBy(xpath="/html/body/div/div/div[4]/div/button")private WebElement startJobOk;
	@FindBy(xpath = "//div[@id='faqhead1']/div/button/img")	private WebElement taskOptions;

//	Unable to complete xpaths
	@FindBy(xpath = "//button[text()='Unable To Complete Task']")private WebElement unableToCompleteTask;
	@FindBy(xpath = "//select[@id='UnabletosubmitEventTaskId1']")private WebElement selectReason;
	@FindBy(xpath = "//*[@id='btnComments']")private WebElement reasonSubmit;
	@FindBy(xpath = "/html/body/div/div/div[2]/div/button")private WebElement reasonSubmitOk;

	public UnableToCompleteTask() {
		PageFactory.initElements(BaseTest.driver, this);
	}

//	Start Job Methods
	public WebElement getStartJob() {
		return startJob;
	}
	public WebElement getstartJobOk() {
		return startJobOk;
	}
//	Start Task Methods	
	public WebElement gettaskOptions() {
		return taskOptions;
	}

//	Assessor Unable to complete Task Methods

	public WebElement getunableToCompleteTask() {
		return unableToCompleteTask;
	}

	public WebElement getSelectReason() {
		return selectReason;
	}

	public WebElement getreasonSubmit() {
		return reasonSubmit;
	}

	public WebElement getReasonSubmitOk() {
		return reasonSubmitOk;
	}

	WebDriverCommonLib ComLib = new WebDriverCommonLib();
	String time = ComLib.sysTimeStamp;

	MyListeners lisn = new MyListeners();

//	@priority=1

	public void assessorUnableToCompleteTask() throws InterruptedException {

		System.out.println(time);

		try {
			startJob.click();
			System.out.println("Clicked on Start Job");
			Thread.sleep(3000);
			startJobOk.click();

		} catch (Exception e) {
			System.out.println("Start job button not available : Exception Handled");
		}

		taskOptions.click();
		Thread.sleep(3000);
		ComLib.fullPageScreenshot("C:\\NTC Projects\\ScreenShots\\" + time + ".png");
		System.out.println("Clicked on taskBar Options");
		ComLib.waitForElementToClick(unableToCompleteTask);
		ComLib.waitForElement(unableToCompleteTask);

		unableToCompleteTask.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Unable To CompleteTask");

		Select reason = new Select(selectReason);
		reason.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Reason Selected");
		Thread.sleep(1000);
		reasonSubmit.click();
		System.out.println("Clicked on Submit");
		Thread.sleep(1000);
		reasonSubmitOk.click();
		System.out.println("Clicked on ok");

	}

}
