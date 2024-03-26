package assessorData;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import GenericLib.BaseTest;
import GenericLib.MyListeners;
import GenericLib.WebDriverCommonLib;

public class ResheduleTask extends BaseTest{
	
//	Start Job xpaths
	@FindBy(xpath="//*[@id='startTask']")private WebElement startJob;
	@FindBy(xpath = "//div[@id='faqhead1']/div/button/img")	private WebElement taskOptions;
	

	@FindBy(xpath="//button[text()='Start Assessment']")private WebElement startAssesemnt;
	@FindBy(xpath="//button[text()='OK']")private WebElement locationPopup;

	
	@FindBy(xpath="//button[text()='Reschedule Task']")private WebElement rescheduleTask;
	@FindBy(xpath="//select[@id='RescheduleEventTaskId']")private WebElement rescheduleReason;
	@FindBy(xpath="//*[@id='btnRescheduleTask']")WebElement rescheduleSubmit;
	@FindBy(xpath="/html/body/div[2]/div/div[3]/div/button")WebElement rescheduleSubmitOk;
	

	
	
	public ResheduleTask() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
//	Start Job Methods
	public WebElement getStartJob() {
		return startJob;
	}
	public WebElement gettaskOptions() {
		return taskOptions;
	}

//	Assessor Reschedule Task Methods
	
	public WebElement getrescheduleTask() {
		return rescheduleTask;
	}
	public WebElement getrescheduleReason() {
		return rescheduleReason;
	}
	public WebElement getrescheduleSubmit() {
		return rescheduleSubmit;
	}
	public WebElement getrescheduleSubmitOk() {
		return rescheduleSubmitOk;
	}

	
	WebDriverCommonLib ComLib= new WebDriverCommonLib();
	String time = ComLib.sysTimeStamp;
	
	MyListeners lisn = new MyListeners();
		
//	@priority=1
	
	public void assessorRescheduleTask() throws InterruptedException{
		
				
		System.out.println(time);

		try {
			startJob.click();
			System.out.println("Clicked on Start Job");
			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("Start job button not available : Exception Handled");
		}

		taskOptions.click();
		Thread.sleep(3000);
		ComLib.fullPageScreenshot("C:\\NTC Projects\\ScreenShots\\" + time + ".png");
		System.out.println("Clicked on taskBar Options");
		
		ComLib.waitForElementToClick(rescheduleTask);
		ComLib.waitForElement(rescheduleTask);
		
		rescheduleTask.click();
		Thread.sleep(2000);
		System.out.println("Clicked on reschedule Task");
	
		Select reason=new Select(rescheduleReason);
//		Select Reasons from dropdown- 9791, 9793, 9795, 9797, 9799, 9805, 9807,9809,9811, 9813, 9815, 9817, 9819, 9821, 9823
		reason.selectByValue("9823");
		Thread.sleep(1000);
		System.out.println("Reason Selected");
		Thread.sleep(1000);
		rescheduleSubmit.click();
		System.out.println("Clicked on Submit");
		Thread.sleep(1000);
		rescheduleSubmitOk.click();
		System.out.println("Clicked on ok");
	}
	
	
	
}

	

