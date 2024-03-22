package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import GenericLib.BaseTest;
import GenericLib.FileLib;
import GenericLib.WebDriverCommonLib;

public class Adminpayroll extends BaseTest {

	@FindBy(xpath = "//a[@href='/Addadminpayroll/Addadminpayroll/Adminpayroll']")
	private WebElement payroll;
	@FindBy(xpath = "//select[@id='assessorid']")
	private WebElement selectAssessor;
	@FindBy(xpath = "//input[@id='datepicker']")
	private WebElement date;
	@FindBy(xpath = "//select[@id='ApprvStatus']")
	private WebElement approveStatus;
	@FindBy(xpath = "//input[@id='checkall']")
	private WebElement payrollcheckbox;
	@FindBy(xpath = "//input[@id='approvedhrs_0']")
	private WebElement approvedhours;
	@FindBy(xpath = "//button[@id='btnaprv']")
	private WebElement approve;
	@FindBy(xpath = "/html/body/div[2]/div/div[4]/div/button")
	private WebElement clickOK;

	public WebElement getPayroll() {
		return payroll;
	}

	public WebElement getselectAssessor() {
		return selectAssessor;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getapproveStatus() {
		return approveStatus;
	}

	public WebElement getpayrollcheckbox() {
		return payrollcheckbox;
	}

	public WebElement getapprovedhours() {
		return approvedhours;
	}

	public WebElement getApprove() {
		return approve;
	}

	public WebElement getClickOk() {
		return clickOK;
	}

	public Adminpayroll() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	WebDriverCommonLib WDC = new WebDriverCommonLib();
	FileLib fl = new FileLib();

	public void AdminPayroll() throws InterruptedException {

		payroll.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Admin Payroll");

//		Assessor Data 1012-Wendy Serrano, 1015-Shavonne Cuella, 1010-Sandra Roach, 
//		1013-Samir Mitta, 3116-Olivier Desire, 4136- Jacky Bruno, 4132- Diego Carballo, 
//		1011-Dean Rodrigue, 4139-assessor1 
		Select s = new Select(selectAssessor);
		s.selectByValue("4132");
		Thread.sleep(2000);
		System.out.println("Assessor Selected");

	
//		Status-- 1-UnApproved, 2-Approved, 3-All
		Select s1 = new Select(approveStatus);
		s1.selectByValue("3");
		Thread.sleep(4000);

//	If the payroll check box available it will click on it or else it will skip		
		try {
			payrollcheckbox.click();
			Thread.sleep(4000);
			System.out.println("Clicked on payroll checkbox");

		} catch (Exception e) {
			System.out.println("payroll checkbox not available : " + e);
		}

		try {
			approvedhours.sendKeys("1");
			Thread.sleep(4000);
			System.out.println("Added Aproved hours");

		} catch (Exception e) {
			System.out.println("Aproved hours not available : " + e);
		}

		approve.click();
		System.out.println("Clicked on Approve");

		try {
			clickOK.click();
			;
			Thread.sleep(4000);
			System.out.println("Hours Added");

		} catch (Exception e) {
			System.out.println("OK not found: " + e);
		}
	}

}