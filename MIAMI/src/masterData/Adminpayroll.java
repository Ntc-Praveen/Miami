package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BaseTest;
import GenericLib.FileLib;
import GenericLib.WebDriverCommonLib;


public class Adminpayroll extends BaseTest{
	
	@FindBy(xpath="//a[@href='/Addadminpayroll/Addadminpayroll/Adminpayroll']")private  WebElement payroll;
	
	public WebElement getPayroll() {
		return payroll;
	}
	
	
	public Adminpayroll()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	WebDriverCommonLib WDC=new WebDriverCommonLib();
	FileLib fl=new FileLib();


	public void AdminPayroll() throws InterruptedException
	{
	
		payroll.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Admin Payroll");
	}

	
	
}