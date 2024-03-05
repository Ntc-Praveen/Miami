package assessorData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import GenericLib.BaseTest;
import GenericLib.WebDriverCommonLib;

public class Dashboard extends BaseTest{
	
//	Start Job xpaths
	@FindBy(xpath="//*[@id='startTask']")private WebElement startJob;
	@FindBy(xpath="//*[@id='Pending']")private WebElement pendingJob;
	@FindBy(xpath="//*[@id='Completed']")private WebElement completedJob;
	@FindBy(xpath="//*[@id='Unabletocomplete']")private WebElement unabletoCompletedJob;
	
//	Start Task xpaths
	@FindBy(xpath="/html/body/main/section/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/a")private WebElement taskBar;
	@FindBy(xpath="/html/body/main/section/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/a")private WebElement taskBarClick;
	@FindBy(xpath="/html/body/main/section/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[1]/button")private WebElement taskClickHere;
	@FindBy(xpath="//*[@id=\"faqhead1\"]/div/button")private WebElement taskOptions;
	
//	Start Assment xpaths
	@FindBy(xpath="//a[text()='Start Assessment']")private WebElement startAssesemnt;
	@FindBy(xpath="/html/body/div/div/div[4]/div/button")private WebElement locationPopup;
	
//	Sidewalk Options
	@FindBy(xpath="//*[@id='qCat_1']")private WebElement sideWalks;
	@FindBy(xpath="//select[@id='assessments_ListFormData_0__OptionRating']")private WebElement sideWalksForm0;
	@FindBy(xpath="//select[@id='assessments_ListFormData_2__OptionRating']")private WebElement sideWalksForm2;
	@FindBy(xpath="//select[@id='assessments_ListFormData_4__OptionRating']")private WebElement sideWalksForm4; 
	@FindBy(xpath="//select[@id='assessments_ListFormData_6__OptionRating']")private WebElement sideWalksForm6;
	@FindBy(xpath="//select[@id='assessments_ListFormData_8__OptionRating']")private WebElement sideWalksForm8;
	
//	Roadways Options
	@FindBy(xpath="//*[@id='qCat_2']")private WebElement roadWays;
	@FindBy(xpath="//select[@id='assessments_ListFormData_5__OptionRating']")private WebElement roadWaysForm5;
	@FindBy(xpath="//select[@id='assessments_ListFormData_7__OptionRating']")private WebElement roadWaysForm7;
	@FindBy(xpath="//select[@id='assessments_ListFormData_9__OptionRating']")private WebElement roadWaysForm9; 
	@FindBy(xpath="//select[@id='assessments_ListFormData_11__OptionRating']")private WebElement roadWaysForm11;
	@FindBy(xpath="//select[@id='assessments_ListFormData_13__OptionRating']")private WebElement roadWaysForm13;
	
//	Turf (Grass) Options
	@FindBy(xpath="//*[@id='qCat_3']")private WebElement turfGrass;
	@FindBy(xpath="//select[@id='assessments_ListFormData_10__OptionRating']")private WebElement turfGrassForm10;
	@FindBy(xpath="//select[@id='assessments_ListFormData_12__OptionRating']")private WebElement turfGrassForm12;
	@FindBy(xpath="//select[@id='assessments_ListFormData_14__OptionRating']")private WebElement turfGrassForm14; 
	@FindBy(xpath="//select[@id='assessments_ListFormData_16__OptionRating']")private WebElement turfGrassForm16;
	@FindBy(xpath="//select[@id='assessments_ListFormData_18__OptionRating']")private WebElement turfGrassForm18;
	
//	Unable to complete xpaths
	@FindBy(xpath="//*[@id='faqhead1']/div[2]/div/button[2]")private WebElement unableToCompleteTask;
	
//	
	@FindBy(xpath="//*[@id='faqhead1']/div[2]/div/button[3]")private WebElement rescheduleTask;
	
	public Dashboard() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
//	Start Job Methods
	public WebElement getStartJob() {
		return startJob;
	}

	public WebElement getPendingJob() {
		return pendingJob;
	}

	public WebElement getCompletedJob() {
		return completedJob;
	}
	
	public WebElement getUnabletoCompletedJob() {
		return unabletoCompletedJob;
	}
//	Start Task Methods
	public WebElement gettaskBar() {
		return taskBar;
	}
	
	public WebElement gettaskBarclick() {
		return taskBarClick;
	}
	
	public WebElement gettaskClickHere(){
		return taskClickHere;
	}
	
	public WebElement gettaskOptions() {
		return taskOptions;
	}
//	Start Assement Methods
	public WebElement gettartAssesemnt() {
		return startAssesemnt;
	}
	public WebElement getlocationPopup() {
		return locationPopup;
	}
//	SideWalk Option Methods
	public WebElement getsideWalks() {
		return sideWalks;
	}
	public WebElement getsideWalksForm0() {
		return sideWalksForm0;
	}
	public WebElement getsideWalksForm2() {
		return sideWalksForm2;
	}
	public WebElement getsideWalksForm4() {
		return sideWalksForm4;
	}
	public WebElement getsideWalksForm6() {
		return sideWalksForm6;
	}
	public WebElement getsideWalksForm8() {
		return sideWalksForm8;
	}
	
//	Roadways Option Methods
	public WebElement getroadWays() {
		return roadWays;
	}
	public WebElement getroadWaysForm5() {
		return roadWaysForm5;
	}
	public WebElement getroadWaysForm7() {
		return roadWaysForm7;
	}
	public WebElement getroadWaysForm9() {
		return roadWaysForm9;
	}
	public WebElement getroadWaysForm11() {
		return roadWaysForm11;
	}
	public WebElement getroadWaysForm13() {
		return roadWaysForm13;
	}
	
//	Turf (Grass) Options Methods
	public WebElement getturfGrass() {
		return roadWays;
	}
	public WebElement getturfGrassForm10() {
		return turfGrassForm10;
	}
	public WebElement getturfGrassForm12() {
		return turfGrassForm12;
	}
	public WebElement getturfGrassForm14() {
		return turfGrassForm14;
	}
	public WebElement getturfGrassForm16() {
		return turfGrassForm16;
	}
	public WebElement getturfGrassForm18() {
		return turfGrassForm18;
	}
//	Assessor Unable to complete Task Methods
	
	public WebElement getunableToCompleteTask() {
		return unableToCompleteTask;
	}
	
//	Assessor Reschedule Task Methods
	
	public WebElement getrescheduleTask() {
		return rescheduleTask;
	}

	WebDriverCommonLib ComLib= new WebDriverCommonLib();
//	@priority=1
	public void assesorStartJob() throws InterruptedException
	{
				
		try {
				startJob.click();
				Thread.sleep(4000);
				ComLib.fullPageScreenshot("C:\\Users\\susmi\\git\\Miami\\MIAMI\\Data");
				System.out.println("Clicked on Start Job");
						}
		catch(Exception e){
			System.out.println("Start job button not available : "+ e);
		}
	 		
//		completedJob.click();
//		Thread.sleep(2000);
//		System.out.println("Clicked on Completed Job");
//		unabletoCompletedJob.click();
//		Thread.sleep(2000);
//		System.out.println("Clicked on unabletoCompleted Job");
//		pendingJob.click();
//		Thread.sleep(10000);
//		System.out.println("Clicked on Pending Job");
	}
	public void assesorStartTask() throws InterruptedException{
	
		taskBar.click();
		Thread.sleep(2000);
		System.out.println("Clicked on taskBar Job");
		
		taskBarClick.click();
		Thread.sleep(2000);
		System.out.println("Clicked on taskBar Job");
				
		taskClickHere.click();
		Thread.sleep(2000);
		System.out.println("Clicked on taskBar Click Here ");
		
		taskOptions.click();
		Thread.sleep(2000);
		System.out.println("Clicked on taskBar Options");
//		ComLib.fullPageScreenshot("C:\\Users\\susmi\\git\\Miami\\MIAMI\\Data");
		
		
		startAssesemnt.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Start Assesment Click Here ");
		
		locationPopup.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Ok Popup");
		
		
	}
	
	public void assessorStartAssesemnt() throws InterruptedException{
		
	
		
//		Sidewalk Options		
		sideWalks.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Ok Sidewalks CheckBox");
		Select sidewalk0=new Select(sideWalksForm0);
		sidewalk0.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Clicked on Ok Sidewalks CheckBox: sideWalksForm0");
		Select sidewalk2=new Select(sideWalksForm2);
		sidewalk2.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Clicked on Ok Sidewalks CheckBox: sideWalksForm2");
		Select sidewalk4=new Select(sideWalksForm4);
		sidewalk4.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Clicked on Ok Sidewalks CheckBox: sideWalksForm4");
		Select sidewalk6=new Select(sideWalksForm6);
		sidewalk6.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Clicked on Ok Sidewalks CheckBox: sideWalksForm6");
		Select sidewalk8=new Select(sideWalksForm8);
		sidewalk8.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Clicked on Ok Sidewalks CheckBox: sideWalksForm8");
		
//		RoadWays
		roadWays.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Ok roadWays CheckBox");
		Select roadWays5=new Select(roadWaysForm5);
		roadWays5.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Clicked on Ok Sidewalks CheckBox: roadWaysForm5");
		Select roadWays7=new Select(roadWaysForm7);
		roadWays7.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Clicked on Ok Sidewalks CheckBox: roadWaysForm7");
		Select roadWays9=new Select(roadWaysForm9);
		roadWays9.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Clicked on Ok Sidewalks CheckBox: roadWaysForm9");
		Select roadWays11=new Select(roadWaysForm11);
		roadWays11.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Clicked on Ok Sidewalks CheckBox: roadWaysForm11");
		Select roadWays13=new Select(roadWaysForm13);
		roadWays13.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Clicked on Ok Sidewalks CheckBox: roadWaysForm13");
		
		
//		RoadWays
//		roadWays.click();
//		Thread.sleep(2000);
//		System.out.println("Clicked on Ok roadWays CheckBox");
//		Select roadWays5=new Select(roadWaysForm5);
//		roadWays5.selectByValue("1");
//		Thread.sleep(1000);
//		System.out.println("Clicked on Ok Sidewalks CheckBox: roadWaysForm5");
//		Select roadWays7=new Select(roadWaysForm7);
//		roadWays7.selectByValue("1");
//		Thread.sleep(1000);
//		System.out.println("Clicked on Ok Sidewalks CheckBox: roadWaysForm7");
//		Select roadWays9=new Select(roadWaysForm9);
//		roadWays9.selectByValue("1");
//		Thread.sleep(1000);
//		System.out.println("Clicked on Ok Sidewalks CheckBox: roadWaysForm9");
//		Select roadWays11=new Select(roadWaysForm11);
//		roadWays11.selectByValue("1");
//		Thread.sleep(1000);
//		System.out.println("Clicked on Ok Sidewalks CheckBox: roadWaysForm11");
//		Select roadWays13=new Select(roadWaysForm13);
//		roadWays13.selectByValue("1");
//		Thread.sleep(1000);
//		System.out.println("Clicked on Ok Sidewalks CheckBox: roadWaysForm13");
//		
		
	}
	
	public void assessorUnableToCompleteTask() throws InterruptedException{
		
		unableToCompleteTask.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Unable To CompleteTask");
	}
	
	public void assessorRescheduleTask() throws InterruptedException{
		
		rescheduleTask.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Reschedule Task");
	}
	
	
	
}

	

