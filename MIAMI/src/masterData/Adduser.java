package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import GenericLib.FileLib;
import GenericLib.BaseTest;
import GenericLib.WebDriverCommonLib;

public class Adduser extends BaseTest{
	
	
	@FindBy(xpath="/html/body/main/section/div[1]/div[2]/ul/li[1]/a") private WebElement masterData;
	@FindBy(xpath="//a[@href='/Admin/Admin/AddUser']") private WebElement addUser;
	@FindBy(xpath="//input[@id='FirstName']") private WebElement firstName;
	@FindBy(xpath="//input[@id='LastName']") private WebElement lastName;
	@FindBy(xpath="//input[@id='Mobile']") private WebElement mobile;
	@FindBy(xpath="//input[@id='EmailId']") private WebElement emailId;
	@FindBy(xpath="//input[@id='EmployeeId']") private WebElement employeeId;
	@FindBy(xpath="//input[@value='Save']") private WebElement saveButton;
	@FindBy(xpath="//select[@selectid='RoleId']") private WebElement userType; 
	@FindBy(xpath="//input[@type='search']") private WebElement userSearchfield;
	@FindBy(xpath="//img[@src='/Images/delete-icon.svg']") private WebElement deleteButton;
	@FindBy(xpath="//div[@class='swal-button-container'][2]") private WebElement deleteOkbutton; 
	
	public WebElement getMasterData() {
		return masterData;
	}
	public WebElement getAddUser() {
		return addUser;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getEmailId() {
		return emailId;
	}
	public WebElement getEmployeeId() {
		return employeeId;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	public WebElement getUserType() {
		return userType;
	}
	public WebElement getUserSearchfield() {
		return userSearchfield;
	}
	public WebElement getDeleteButton() {
		return deleteButton;
	}
	public WebElement getDeleteOkbutton() {
		return deleteOkbutton;
	}
	
	
	public Adduser()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	WebDriverCommonLib WDC=new WebDriverCommonLib();
	FileLib fl=new FileLib();
	
	public void addUser() throws  Throwable 
	{
		masterData.click();
		Thread.sleep(1000);
		addUser.click();
		Thread.sleep(1000);
		WDC.scrollDown();	
		Thread.sleep(3000);
		firstName.sendKeys(fl.readPropData(PROP_PATH, "FirstName"));
		Thread.sleep(1000);
		lastName.sendKeys("saho");
		Thread.sleep(1000);
		mobile.sendKeys(fl.readPropData(PROP_PATH, "MobileNo"));
		Thread.sleep(1000);
		emailId.sendKeys(fl.readPropData(PROP_PATH, "EmailId"));
		Thread.sleep(1000);
		employeeId.sendKeys(fl.readPropData(PROP_PATH, "EmployeeId"));
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);
		Reporter.log("User saved Successfully", true);
		
		
	}
	public void deleteUser() throws Throwable 
	{
		masterData.click();
		Thread.sleep(1000);
		addUser.click();
		Thread.sleep(1000);
		userSearchfield.sendKeys(fl.readPropData(PROP_PATH, "FirstName"));
		Thread.sleep(2000);
		deleteButton.click();
		Thread.sleep(5000);
		deleteOkbutton.click();
		Reporter.log("user deleted successfully",true);
	}
	
	

}
