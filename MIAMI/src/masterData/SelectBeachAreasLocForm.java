package masterData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import GenericLib.BaseTest;

public class SelectBeachAreasLocForm {

	@FindBy(xpath ="/html/body/main/section/div[1]/div[2]/ul/li[1]/ul/li[2]/a" )private WebElement addlocation;
	@FindBy(xpath = "/html/body/main/section/div[1]/div[2]/ul/li[1]/a")private WebElement masterdata;
	@FindBy(xpath="//*[@id=\"ddlAreaId\"]")private WebElement publicareaclick;
	
	public WebElement getMasterdata() {
		return masterdata;
	}
	
	public WebElement getAddlocation() {
		return addlocation;
	}

	public WebElement getPublicareadropdownclick() {
		return publicareaclick;
	}
	public SelectBeachAreasLocForm()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	
	public void selectbeachAreaslocationform() throws InterruptedException {
		Thread.sleep(3000);
		masterdata.click();
		Thread.sleep(2000);
		addlocation.click();
		Thread.sleep(2000);
		publicareaclick.click();
		Thread.sleep(2000);
		Select beachareas = new Select(publicareaclick);
		beachareas.selectByValue("1");
	}
}
