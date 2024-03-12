
package assessorData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BaseTest;

public class MySchedules extends BaseTest{
	
	@FindBy(xpath="//a[@href='/UserLogin/UserLogin/MySchedules']") private WebElement masterShedule;
	@FindBy(xpath="//*[@id='MySchedule']") private WebElement myShedule;
	@FindBy(xpath="//*[@id='AllSchedule']") private WebElement allShedule;
	@FindBy(xpath="//*[@class='fc-icon fc-icon-left-single-arrow']") private WebElement calanderPrev;
	@FindBy(xpath="//*[@class='fc-icon fc-icon-right-single-arrow']") private WebElement calanderNext;
//	@FindBy(xpath="//*[@class='fc-today-button fc-button fc-state-default fc-corner-left fc-corner-right']") private WebElement calanderToday;
	@FindBy(xpath="/html/body/main/section/div[2]/div/section/div/div[4]/div[2]/div/div[1]/div[1]/button") private WebElement calanderToday;
	
	public MySchedules() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getMasterShedule() {
		return masterShedule;
	}

	public WebElement getMyShedule() {
		return myShedule;
	}

	public WebElement getAllShedule() {
		return allShedule;
	}

	public WebElement getCalanderPrev() {
		return calanderPrev;
	}

	public WebElement getCalanderNext() {
		return calanderNext;
	}

	public WebElement getCalanderToday() {
		return calanderToday;
	}


	public void assesorMasterShedule() throws InterruptedException
	{
		masterShedule.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Master Schedule");
		allShedule.click();
		Thread.sleep(2000);
		System.out.println("Clicked on All Schedule");
		myShedule.click();
		Thread.sleep(2000);
		System.out.println("Clicked on My Schedule");
		calanderPrev.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Calander Prev");
		calanderToday.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Calander Prev");
		calanderToday.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Calander Today");
		calanderNext.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Calander Next");
		
		
	}
	
	
}

	

