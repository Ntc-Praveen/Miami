package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import GenericLib.FileLib;
import GenericLib.BaseTest;
import GenericLib.WebDriverCommonLib;
                                                  /*** Written By VidyaSagar ***/
public class Adduser extends BaseTest{
	
	@FindBy(xpath="/html/body/main/section/div[1]/div[2]/ul/li[1]/a") private WebElement masterData;
	@FindBy(xpath="//a[@href='/Admin/Admin/AddUser']") private WebElement addUser;
	@FindBy(xpath="//input[@id='FirstName']") private WebElement firstName;
	@FindBy(xpath="//input[@id='LastName']") private WebElement lastName;
	@FindBy(xpath="//input[@id='Mobile']") private WebElement mobile;
	@FindBy(xpath="//input[@id='EmailId']") private WebElement emailId;
	@FindBy(xpath="//input[@id='EmployeeId']") private WebElement employeeId;
	@FindBy(xpath="//input[@value='Save']") private WebElement saveButton;
	@FindBy(xpath="//select[@id='RoleId']") private WebElement userType; 
	@FindBy(xpath="//input[@type='search']") private WebElement userSearchfield;
	@FindBy(xpath="//img[@src='/Images/delete-icon.svg']") private WebElement deleteButton;
	@FindBy(xpath="//div[@class='swal-button-container'][2]") private WebElement deleteOkbutton; 
	@FindBy(xpath="//img[@src='/Images/edit-icon.svg']") private WebElement editButton;
	@FindBy(xpath="//input[@value='Update']") private WebElement updateButton;
	@FindBy(xpath="//div[@id='tblusers_wrapper']//td[@class='dt-left sorting_1']") private WebElement userName;
	@FindBy(xpath="//div[@id='tblusers_wrapper']//td[@class='  dt-left'][1]") private WebElement userMobileno;
	@FindBy(xpath="//input[@class='datepicker hasDatepicker']") private WebElement fromDateField;
	@FindBy(xpath="//input[@class='datepicker hasDatepicker']") private WebElement toDateField;
	@FindBy(xpath="//img[@src='/Images/delete-icon.svg']") private WebElement accessordeleteButton;
	@FindBy(xpath="//button[@class='swal-button swal-button--confirm swal-button--danger'][1]") private WebElement conformationokButton;
	@FindBy(xpath="//div[@class='swal-button-container']//button[@class='swal-button swal-button--confirm']") private WebElement successOkButton;

	public WebElement getSuccessOkButton() {
		return successOkButton;
	}
	public WebElement getAccessordeleteButton() {
		return accessordeleteButton;
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getUpdateButton() {
		return updateButton;
	}
	public WebElement getMasterData() {
		return masterData;
	}
	public WebElement getAddUser() {
		return addUser;
	}
	public WebElement getEditButton() {
		return editButton;
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
		lastName.sendKeys(fl.readPropData(PROP_PATH, "LastName"));
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
		successOkButton.click();
		Thread.sleep(2000);
		
		
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
		Thread.sleep(1000);
		successOkButton.click();
		Reporter.log("user deleted successfully",true);
	}
	public void editUser() throws Throwable
	{
		masterData.click();
		Thread.sleep(1000);
		addUser.click();
		Thread.sleep(1000);
		userSearchfield.sendKeys(fl.readPropData(PROP_PATH, "FirstName"));
		Thread.sleep(2000);
		editButton.click();
		Thread.sleep(2000);
		lastName.clear();
		Thread.sleep(2000);
		lastName.sendKeys(fl.readPropData(PROP_PATH, "LastName"));
		Thread.sleep(2000);
		mobile.sendKeys(fl.readPropData(PROP_PATH, "UpdateMobile"));
		Thread.sleep(1000);
		employeeId.sendKeys(fl.readPropData(PROP_PATH, "UpdateemployeeId"));
		Thread.sleep(1000);
		updateButton.click();
		Reporter.log("User Details Updated Successfully", true);
		
	}
	public void verifyUser() throws Throwable
	{
		masterData.click();
		Thread.sleep(1000);
		addUser.click();
		Thread.sleep(1000);
		userSearchfield.sendKeys(fl.readPropData(PROP_PATH, "FirstName"));
		Thread.sleep(2000);
		System.out.println("UserName is: " + userName.getText() + ", MoibleNo is: " + userMobileno.getText());		
		String actualUserName=userName.getText();
		String actualMobilNo=userMobileno.getText();
		FileLib fl=new FileLib();
		String expectedUserName=fl.readPropData(PROP_PATH, "FullName");
		String expectedMobileNo=fl.readPropData(PROP_PATH, "MobileNo");
		if(actualUserName.equalsIgnoreCase(expectedUserName))
		{
			Reporter.log(expectedUserName +" - User Verfied Successfully", true);
     	}
		if(actualMobilNo.equalsIgnoreCase(expectedMobileNo))
		{
			Reporter.log(expectedMobileNo +" - UserMobileNo Verifed Successfully", true);
		}
		else
		{
			Reporter.log(expectedMobileNo +" - UserMobileNo not verifed", true);
		}				
	}
	public void addAccessor() throws Throwable
	{
		masterData.click();
		Thread.sleep(1000);
		addUser.click();
		Thread.sleep(1000);
		WDC.scrollDown();	
		Thread.sleep(3000);
		WDC.selectOption(userType, 2);
		Thread.sleep(1000);
		firstName.sendKeys(fl.readPropData(PROP_PATH, "AssessorFirstName"));
		Thread.sleep(1000);
		lastName.sendKeys(fl.readPropData(PROP_PATH, "AssessorLastName"));
		Thread.sleep(1000);
		mobile.sendKeys(fl.readPropData(PROP_PATH, "AssessorMobileNo"));
		Thread.sleep(1000);
		emailId.sendKeys(fl.readPropData(PROP_PATH, "AssessorEmailId"));
		Thread.sleep(1000);
		employeeId.sendKeys(fl.readPropData(PROP_PATH, "AssessorEmployeeId"));
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);
		Reporter.log("AssessorUser saved Successfully", true);
		//userSearchfield.sendKeys(fl.readPropData(PROP_PATH, "AssessorFirstName"));
		//Thread.sleep(2000);
		
		
	}
	public void deleteAccessor() throws Throwable
	{
		masterData.click();
		Thread.sleep(1000);
		addUser.click();
		Thread.sleep(1000);
		FileLib fl=new FileLib();
		userSearchfield.sendKeys(fl.readPropData(PROP_PATH, "AssessorFirstName"));
		Thread.sleep(1000);
		accessordeleteButton.click();
		Thread.sleep(1000);
		conformationokButton.click();
		Thread.sleep(1000);
		successOkButton.click();
		Reporter.log("Accessor User is Deleted Successfully",true);
		
	}

}
