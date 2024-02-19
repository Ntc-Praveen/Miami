package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BaseTest;

public class Vehicles {
	
	@FindBy(xpath="/html/body/main/section/div[1]/div[2]/ul/li[1]/a")private WebElement masterData;
	@FindBy(xpath="//a[@href='/AddVehicles/AddVehicles/AddVehicles']")private WebElement vehiclePage;
	@FindBy(xpath="//input[@id='addvhcl']")private WebElement vehicleName;	
	@FindBy(xpath="//input[@value='Save']")private WebElement saveButton;
	
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
	public void Addvehicle() throws InterruptedException
	{
		Thread.sleep(2000);
		masterData.click();
		Thread.sleep(2000);
		vehiclePage.click();
		Thread.sleep(2000);
		vehicleName.sendKeys("Test Car");
		Thread.sleep(2000);
		saveButton.click();
		
	}
	
	
	

}
