package assessorData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BaseTest;

public class ScheduleRequest  extends BaseTest {
	
	
	@FindBy(xpath="//a[@href='/UserLogin/UserLogin/ScheduleRequest']")private WebElement sheduleRequest;
	@FindBy(xpath="/html/body/div/div/div[4]/div/button")private WebElement clickOK;
	
	
	public WebElement getSheduleRequest() {
		return sheduleRequest;
	}
	public WebElement getClickOK() {
		return clickOK;
	}
	public ScheduleRequest() {
		PageFactory.initElements(BaseTest.driver, this);
	}


public void assesorScheduleRequest() throws InterruptedException
{
	sheduleRequest.click();
	Thread.sleep(2000);
	System.out.println("Clicked on shedule Request");
	clickOK.click();
	Thread.sleep(2000);
	System.out.println("Clicked on shedule Request clickOK");
}

}
