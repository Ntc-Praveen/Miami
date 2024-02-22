package calendar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import GenericLib.WebDriverCommonLib;
import GenericLib.BaseTest;

public class Calendar {
	
      @FindBy(xpath="//a[@href='/Schedules/AddSchedules']")private WebElement calendarPage;
      @FindBy(xpath="//select[@id='drpShift']")private WebElement shifField;   
      @FindBy(xpath="//td[@data-date='2024-02-21']//span[@class='fc-day-number' and text()=21]")private WebElement dateEight;
      @FindBy(xpath="(//div[@class='form-group'])[1]//select[@id='Indexdata']")private WebElement indexSelect; 
      @FindBy(xpath="(//div[@class='form-group'])[2]//select[@id='drpTime']")private WebElement shiftTime;
      @FindBy(xpath="(//div[@class='form-group'])[3]//select[@id='drpVehicle']")private WebElement vechileName;
      @FindBy(xpath="//button[@id='AddNewEvent']")private WebElement saveButton;
    
      public WebElement getSaveButton() {
		return saveButton;
	}
	public WebElement getShiftTime() {
		return shiftTime;
	}
	public WebElement getVechileName() {
		return vechileName;
	}
	public WebElement getIndexSelect() {
		return indexSelect;
	}
	public WebElement getCalendarPage() {
		return calendarPage;
	}
	public WebElement getShifField() {
		return shifField;
	}
	
	public WebElement getDateEight() {
		return dateEight;
	}
	public Calendar()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
      
	WebDriverCommonLib WDCL=new WebDriverCommonLib();
	
    public void checkTasks() throws InterruptedException
    {
    	Thread.sleep(2000);
    	calendarPage.click();
    	Thread.sleep(5000);
    	Select shifts=new Select(shifField);
        shifts.selectByValue("2");
    	Thread.sleep(4000);
    	dateEight.click();
    	Thread.sleep(5000);
    	Reporter.log("Dat clicked", true);
    	Thread.sleep(2000);
    	WDCL.selectOption(indexSelect, 1);
    	Thread.sleep(2000);
    	WDCL.selectOption(shiftTime, 2);
    	Thread.sleep(2000);
    	WDCL.selectOption(vechileName, 1);
    	Thread.sleep(2000);
    	saveButton.click();
    }
	
      
	


}
