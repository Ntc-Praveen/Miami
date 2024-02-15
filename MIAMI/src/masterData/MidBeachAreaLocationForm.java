package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import GenericLib.BaseTest;

public class MidBeachAreaLocationForm {
	
	@FindBy(id="Beach_Id")private WebElement beachId;
	@FindBy(id="Address")private WebElement beachaddress;
	@FindBy(id="Area")private WebElement Area;
	@FindBy(id="Beach_x")private WebElement beachlat;
	@FindBy(id="Beach_y")private WebElement beachlong;
	@FindBy(id="Beach_Assessment_time")private WebElement beachassesmenttime;
	@FindBy(id="Beach_sand")private WebElement beachsandmdc;
	@FindBy(id="Beach_Dune")private WebElement dunemdc;
	@FindBy(id="Beach_Walk")private WebElement beachwalkcmb;
	@FindBy(id="Beach_Spoil")private WebElement beachspoilcmb;
	@FindBy(id="BeachDistrict_id")private WebElement midareatype;
	@FindBy(xpath="/html/body/main/section/div[2]/div/div[2]/form[2]/div/div[2]/input[1]")private WebElement beachcreatebutton;
	@FindBy(id="BeachDistrict_id")private WebElement northareatype;
	@FindBy(id="BeachDistrict_id")private WebElement southareatype;
	
	public WebElement getBeachId() {
		return beachId;
	}
	public WebElement getbeachAddress() {
		return beachaddress;
	}
	public WebElement getArea() {
		return Area;
	}
	public WebElement getBeachlat() {
		return beachlat;
	}
	public WebElement getBeachlong() {
		return beachlong;
	}
	public WebElement getBeachassesmenttime() {
		return beachassesmenttime;
	}
	public WebElement getBeachsand() {
		return beachsandmdc;
	}
	public WebElement getDune() {
		return dunemdc;
	}
	public WebElement getBeachwalk() {
		return beachwalkcmb;
	}
	public WebElement getBeachspoil() {
		return beachspoilcmb;
	}
	public WebElement getMidbeach() {
		return midareatype;
	}
	public WebElement getNorthbeach() {
		return northareatype;
	}
	public WebElement getSouthbeach() {
		return southareatype;
	}
	public WebElement getbeachcreatebutton() {
		return beachcreatebutton;
	}
	public MidBeachAreaLocationForm()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void midbeachArealocationform() throws InterruptedException {
		Thread.sleep(1000);
		beachId.sendKeys("123456");
		Thread.sleep(1000);
		beachaddress.sendKeys("Beach Area Location");
		Thread.sleep(1000);
		Area.sendKeys("Beach Area");
		Thread.sleep(1000);
		beachlat.sendKeys("12312132");
		Thread.sleep(1000);
		beachlong.sendKeys("-237416841368");
		Thread.sleep(1000);
		beachassesmenttime.sendKeys("20");
		Thread.sleep(1000);
		Select Beachsandmdc = new Select(beachsandmdc);
		Beachsandmdc.selectByValue("1");
		Thread.sleep(1000);
		Select bdunemdc = new Select(dunemdc);
		bdunemdc.selectByValue("1");
		Thread.sleep(1000);
		Select bbeachwalkcmb = new Select(beachwalkcmb);
		bbeachwalkcmb.selectByValue("1");
		Thread.sleep(1000);
		Select bbeachspoilcmb = new Select(beachspoilcmb);
		bbeachspoilcmb.selectByValue("1");
		Thread.sleep(1000);
		Select midbeachareatype = new Select(midareatype);
		midbeachareatype.selectByValue("2");
		Thread.sleep(1000);
		beachcreatebutton.click();
	}
	public void northbeachArealocationform() throws InterruptedException {
		Thread.sleep(1000);
		beachId.sendKeys("123456");
		Thread.sleep(1000);
		beachaddress.sendKeys("Beach Area Location");
		Thread.sleep(1000);
		Area.sendKeys("Beach Area");
		Thread.sleep(1000);
		beachlat.sendKeys("12312132");
		Thread.sleep(1000);
		beachlong.sendKeys("-237416841368");
		Thread.sleep(1000);
		beachassesmenttime.sendKeys("20");
		Thread.sleep(1000);
		Select Beachsandmdc = new Select(beachsandmdc);
		Beachsandmdc.selectByValue("1");
		Thread.sleep(1000);
		Select nbdunemdc = new Select(dunemdc);
		nbdunemdc.selectByValue("1");
		Thread.sleep(1000);
		Select nbbeachwalkcmb = new Select(beachwalkcmb);
		nbbeachwalkcmb.selectByValue("1");
		Thread.sleep(1000);
		Select nbbeachspoilcmb = new Select(beachspoilcmb);
		nbbeachspoilcmb.selectByValue("1");
		Thread.sleep(1000);
		Select northbeachareatype = new Select(northareatype);
		northbeachareatype.selectByValue("4");
		Thread.sleep(1000);
		beachcreatebutton.click();
	}
	public void southbeachArealocationform() throws InterruptedException {
		Thread.sleep(1000);
		beachId.sendKeys("123456");
		Thread.sleep(1000);
		beachaddress.sendKeys("Beach Area Location");
		Thread.sleep(1000);
		Area.sendKeys("Beach Area");
		Thread.sleep(1000);
		beachlat.sendKeys("12312132");
		Thread.sleep(1000);
		beachlong.sendKeys("-237416841368");
		Thread.sleep(1000);
		beachassesmenttime.sendKeys("20");
		Thread.sleep(1000);
		Select Beachsandmdc = new Select(beachsandmdc);
		Beachsandmdc.selectByValue("1");
		Thread.sleep(1000);
		Select sbdunemdc = new Select(dunemdc);
		sbdunemdc.selectByValue("1");
		Thread.sleep(1000);
		Select sbbeachwalkcmb = new Select(beachwalkcmb);
		sbbeachwalkcmb.selectByValue("1");
		Thread.sleep(1000);
		Select sbbeachspoilcmb = new Select(beachspoilcmb);
		sbbeachspoilcmb.selectByValue("1");
		Thread.sleep(1000);
		Select southbeachareatype = new Select(southareatype);
		southbeachareatype.selectByValue("6");
		Thread.sleep(1000);
		beachcreatebutton.click();
	}
}
