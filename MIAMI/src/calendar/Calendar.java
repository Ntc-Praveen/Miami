package calendar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import GenericLib.BaseTest;

public class Calendar {
	
      @FindBy(xpath="//a[@href='/Schedules/AddSchedules']")private WebElement calendarPage;
      @FindBy(xpath="//select[@id='drpShift']")private WebElement shifField;
      
      @FindBy(xpath="//div[@class='fc-bg']//td[@data-date='2024-02-14']")private WebElement dateEight;
      @FindBy(xpath="(//div[@class='form-group'])[1]//select[@id='Indexdata']")private WebElement indexSelect; 
      
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
      
    public void checkTasks() throws InterruptedException
    {
    	Thread.sleep(2000);
    	calendarPage.click();
    	Thread.sleep(5000);
    	Select shifts=new Select(shifField);
        shifts.selectByValue("2");
    	Thread.sleep(2000);
//    	dateSlot.click();
//    	Thread.sleep(2000);
    	dateEight.click();
    	Thread.sleep(2000);
    	Reporter.log("Dat clicked", true);
    	Thread.sleep(2000);
    	indexSelect.click();
    	
    	
    	
    }
	
      
	


}
