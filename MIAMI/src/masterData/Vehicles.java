package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import GenericLib.FileLib;
import GenericLib.BaseTest;

public class Vehicles {
	
	
	@FindBy(xpath="/html/body/main/section/div[1]/div[2]/ul/li[1]/a")private WebElement masterData;
	@FindBy(xpath="//a[@href='/AddVehicles/AddVehicles/AddVehicles']")private WebElement vehiclePage;
	@FindBy(xpath="//input[@id='addvhcl']")private WebElement vehicleName;	
	@FindBy(xpath="//input[@value='Save']")private WebElement saveButton;
	@FindBy(xpath="//input[@type='search']")private WebElement vehicleSearch;
	@FindBy(xpath="//img[@title='Delete Vehicle']")private WebElement vehicleDelet;
	@FindBy(xpath="//div[@class='swal-button-container'][2]")private WebElement clickOkButton;
	
	public WebElement getVehicleDelet() {
		return vehicleDelet;
	}
	public WebElement getClickOkButton() {
		return clickOkButton;
	}
	public WebElement getVechicleSearch() {
		return vehicleSearch;
	}
	public WebElement getMasterData() {
		return masterData;
	}
	public WebElement getVehiclePage() {
		return vehiclePage;
	}
	public WebElement getVehicleName() {
		return vehicleName;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	public Vehicles()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void Addvehicle() throws Throwable
	{
		Thread.sleep(2000);
		masterData.click();
		Thread.sleep(2000);
		vehiclePage.click();
		Thread.sleep(2000);
		FileLib fl=new FileLib();
		vehicleName.sendKeys("Test Car");
		Thread.sleep(2000);
		saveButton.click();
		Reporter.log("vehicle is added successfully", true);
		
	}
	public void Deletevehicle() throws InterruptedException
	{
		Thread.sleep(2000);
		masterData.click();
		Thread.sleep(2000);
		vehiclePage.click();
		Thread.sleep(2000);
		vehicleSearch.sendKeys("Test car");
		Thread.sleep(2000);
		vehicleDelet.click();
		Thread.sleep(2000);
		//BaseTest.driver.switchTo().alert().accept();
		clickOkButton.click();
		Reporter.log("vehicle is delete successfully", true);
		
		
		
		
		
	}
	
	

}
