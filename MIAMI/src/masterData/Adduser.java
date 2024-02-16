package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import GenericLib.FileLib;
import GenericLib.BaseTest;
import GenericLib.WebDriverCommonLib;

public class Adduser extends BaseTest{
	
	@FindBy(xpath="/html/body/main/section/div[1]/div[2]/ul/li[1]/a")private WebElement masterData;
	@FindBy(xpath="//a[@href='/Admin/Admin/AddUser']")private WebElement addUser;
	@FindBy(xpath="//input[@id='FirstName']")private WebElement firstName;
	@FindBy(xpath="//input[@id='LastName']")private WebElement lastName;
	@FindBy(xpath="//input[@id='Mobile']")private WebElement mobile;
	@FindBy(xpath="//input[@id='EmailId']")private WebElement emailId;
	@FindBy(xpath="//input[@id='EmployeeId']")private WebElement employeeId;
	@FindBy(xpath="//input[@value='Save']")private WebElement saveButton;
	@FindBy(xpath="//select[@selectid='RoleId']")private WebElement userType; 
	@FindBy(xpath="//input[@type='search']")private WebElement userSearch;
	@FindBy(xpath="//img[@src='/Images/delete-icon.svg']")private WebElement deleteButton;
	
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getUserType() {
		return userType;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	public WebElement getMasterData() {
		return masterData;
	}
	public WebElement getAddUser() {
		return addUser;
	}
	public WebElement getFirstName() {
		return firstName;
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
	public Adduser()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void AddUser() throws  Throwable 
	{
		masterData.click();
		Thread.sleep(1000);
		addUser.click();
		Thread.sleep(1000);
		WebDriverCommonLib WDC=new WebDriverCommonLib();
		WDC.scrollDown();	
		Thread.sleep(3000);
		//Select userstypes=new Select(userType);
		//userstypes.selectByValue("2");
		Thread.sleep(1000);
		//firstName.sendKeys("Sambhu");
		FileLib fl=new FileLib();
		firstName.sendKeys(fl.readPropData(PROP_PATH, "FirstName"));
		Thread.sleep(1000);
		lastName.sendKeys("Singh");
		Thread.sleep(1000);
		mobile.sendKeys("9087676880");
		Thread.sleep(1000);
		emailId.sendKeys("sambu@ntc-in.com");
		Thread.sleep(1000);
		employeeId.sendKeys("2909");
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);
		
	}
	public void DeleteUser() throws Throwable 
	{
		masterData.click();
		Thread.sleep(1000);
		addUser.click();
		Thread.sleep(1000);
		FileLib fl=new FileLib();
		userSearch.sendKeys(fl.readPropData(PROP_PATH, "FirstName"));
		Thread.sleep(2000);
		deleteButton.click();
		Thread.sleep(2000);
		BaseTest.driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}
	

}
