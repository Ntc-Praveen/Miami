package assessorData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import GenericLib.BaseTest;
import GenericLib.MyListeners;
import GenericLib.WebDriverCommonLib;

public class AssessorStartTask extends BaseTest {


	@FindBy(xpath = "//*[@id='startTask']")private WebElement startJob;
	@FindBy(xpath = "//h3[@id='totalTask1']")private WebElement totalTasksHeader;
	@FindBy(xpath = "//div[@id='faqhead1']/div/button/img")	private WebElement taskOptions;
	@FindBy(xpath = "//button[text()='Start Assessment']")private WebElement startAssesemnt;
	@FindBy(xpath = "//button[text()='OK']")private WebElement locationPopup;

//	Sidewalk Options
	@FindBy(xpath = "//*[@id='qCat_1']")private WebElement sideWalks;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_0__OptionRating']")private WebElement sideWalksForm0;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_2__OptionRating']")private WebElement sideWalksForm2;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_4__OptionRating']")private WebElement sideWalksForm4;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_6__OptionRating']")private WebElement sideWalksForm6;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_8__OptionRating']")private WebElement sideWalksForm8;

//	Roadways Options
	@FindBy(xpath = "//*[@id='qCat_2']")private WebElement roadWays;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_5__OptionRating']")private WebElement roadWaysForm5;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_7__OptionRating']")private WebElement roadWaysForm7;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_9__OptionRating']")private WebElement roadWaysForm9;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_11__OptionRating']")private WebElement roadWaysForm11;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_13__OptionRating']")private WebElement roadWaysForm13;

//	Turf (Grass) Options
	@FindBy(xpath = "//*[@id='qCat_3']")private WebElement turfGrass;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_10__OptionRating']")private WebElement turfGrassForm10;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_12__OptionRating']")private WebElement turfGrassForm12;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_14__OptionRating']")private WebElement turfGrassForm14;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_16__OptionRating']")private WebElement turfGrassForm16;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_18__OptionRating']")private WebElement turfGrassForm18;
	
//	Plant Beds Options
	@FindBy(xpath = "//*[@id='qCat_4']")private WebElement plantBeds;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_15__OptionRating']")private WebElement plantBeds15;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_17__OptionRating']")private WebElement plantBeds17;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_19__OptionRating']")private WebElement plantBeds19;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_21__OptionRating']")private WebElement plantBeds21;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_23__OptionRating']")private WebElement plantBeds23;
	
	
//	Street Litter/Trash
	@FindBy(xpath="//*[@id='assessments_ListFormData_0__OptionRating']")private WebElement litterRating;
	@FindBy(xpath="//*[@id='Q1173_1']")private WebElement litterComments1;
	@FindBy(xpath="//*[@id='Q1173_2']")private WebElement litterComments2;
	@FindBy(xpath="//*[@id='Q1173_3']")private WebElement litterComments3;
	@FindBy(xpath="//*[@id='Q1173_4']")private WebElement litterComments4;
	@FindBy(xpath="//*[@id='Q1173_5']")private WebElement litterComments5;
	@FindBy(xpath="//*[@id='Q1173_6']")private WebElement litterComments6;
	@FindBy(xpath="//*[@id='Q1173_7']")private WebElement litterComments7;

//	Street Organic Materials
	@FindBy(xpath="//*[@id='assessments_ListFormData_1__OptionRating']")private WebElement organicMaterials;
	@FindBy(xpath="//*[@id='Q1174_13']")private WebElement organicMaterials1;
	@FindBy(xpath="//*[@id='Q1174_14']")private WebElement organicMaterials2;
	@FindBy(xpath="//*[@id='Q1174_15']")private WebElement organicMaterials3;
	@FindBy(xpath="//*[@id='Q1174_16']")private WebElement organicMaterials4;
	@FindBy(xpath="//*[@id='Q1174_17']")private WebElement organicMaterials5;
	
//	Street Fecal Matter
	@FindBy(xpath="//*[@id='assessments_ListFormData_2__OptionRating']")private WebElement fecalMatter;
	@FindBy(xpath="//*[@id='Q1175_3']")private WebElement fecalMatter1;
	@FindBy(xpath="//*[@id='Q1175_6']")private WebElement fecalMatter2;
	@FindBy(xpath="//*[@id='Q1175_26']")private WebElement fecalMatter3;
	
//	Sidewalk Litter/Trash
	@FindBy(xpath="//*[@id='assessments_ListFormData_3__OptionRating']")private WebElement sidewalkLitterrating;
	@FindBy(xpath="//*[@id='Q1490_1']")private WebElement sidewalkLitter1;
	@FindBy(xpath="//*[@id='Q1490_2']")private WebElement sidewalkLitter2;
	@FindBy(xpath="//*[@id='Q1490_3']")private WebElement sidewalkLitter3;
	@FindBy(xpath="//*[@id='Q1490_4']")private WebElement sidewalkLitter4;
	@FindBy(xpath="//*[@id='Q1490_5']")private WebElement sidewalkLitter5;
	@FindBy(xpath="//*[@id='Q1490_6']")private WebElement sidewalkLitter6;
	@FindBy(xpath="//*[@id='Q1490_7']")private WebElement sidewalkLitter7;
	@FindBy(xpath="//*[@id='Q1490_29']")private WebElement sidewalkLitter8;
	
	
	
// Save
	@FindBy(xpath="//*[@id='Save']")private WebElement save;
	@FindBy(xpath="//*[@id='disComments']")WebElement comments;
	@FindBy(xpath="//*[@id='btnSubmit']")WebElement submit;


	
	
	
	public AssessorStartTask() {
		PageFactory.initElements(BaseTest.driver, this);
	}

//	Start Job Methods
	public WebElement getStartJob() {
		return startJob;
	}

	public WebElement getTotalTasksHeader() {
		return totalTasksHeader;
	}

//	Start Assement Methods
	public WebElement getStartAssesemnt() {
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
		return turfGrass;
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
	
//	Plant Beds Options Methods
	public WebElement getplantBeds() {
		return plantBeds;
	}

	public WebElement getplantBeds15() {
		return plantBeds15;
	}

	public WebElement getplantBeds17() {
		return plantBeds17;
	}

	public WebElement getplantBeds19() {
		return plantBeds19;
	}

	public WebElement getplantBeds21() {
		return plantBeds21;
	}

	public WebElement getplantBeds23() {
		return plantBeds23;
	}
	
//	litterRating Options
	public WebElement getlitterRating() {
		return litterRating;
	}
	public WebElement getlitterComments1() {
		return litterComments1;
	}
	public WebElement getlitterComments2() {
		return litterComments2;
	}
	public WebElement getlitterComments3() {
		return litterComments3;
	}
	public WebElement getlitterComments4() {
		return litterComments4;
	}
	public WebElement getlitterComments5() {
		return litterComments5;
	}
	public WebElement getlitterComments6(){
		return litterComments6;
	}
	public WebElement getlitterComments7(){
		return litterComments7;
	}	
	//	save
	public WebElement getsave() {
		return save;
	}
	public WebElement getcomments() {
		return comments;
	}
	public WebElement getsubmit() {
		return submit;
	}
	


	WebDriverCommonLib ComLib = new WebDriverCommonLib();
	String time = ComLib.sysTimeStamp;

	MyListeners lisn = new MyListeners();

//	@priority=1
	
	public void assesorStartTask() throws InterruptedException {

		System.out.println(time);

		try {
			startJob.click();
			System.out.println("Clicked on Start Job");

		} catch (Exception e) {
			System.out.println("Start job button not available : Exception Handled");
		}
		
		taskOptions.click();
		Thread.sleep(3000);
		ComLib.fullPageScreenshot("C:\\NTC Projects\\ScreenShots\\" + time + ".png");
		System.out.println("Clicked on taskBar Options");
		ComLib.waitForElementToClick(startAssesemnt);
		ComLib.waitForElement(startAssesemnt);

		startAssesemnt.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Start Assesment button");		
		locationPopup.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Ok Popup");
		
//		Sidewalk Options		
		try {
		
		sideWalks.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Ok Sidewalks CheckBox");
		Select sidewalk0 = new Select(sideWalksForm0);
		sidewalk0.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Selected: sideWalksForm0");
		Select sidewalk2 = new Select(sideWalksForm2);
		sidewalk2.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Selected: sideWalksForm2");
		Select sidewalk4 = new Select(sideWalksForm4);
		sidewalk4.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Selected: sideWalksForm4");
		Select sidewalk6 = new Select(sideWalksForm6);
		sidewalk6.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Selected: sideWalksForm6");
		Select sidewalk8 = new Select(sideWalksForm8);
		sidewalk8.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Selected: sideWalksForm8");
		
		}
		catch (Exception e) {
			System.out.println("Exception Handled");
		}	

		try {
//			RoadWays
			roadWays.click();
			Thread.sleep(2000);
			System.out.println("Clicked on Ok roadWays CheckBox");
			Select roadWays5 = new Select(roadWaysForm5);
			roadWays5.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: roadWaysForm5");
			Select roadWays7 = new Select(roadWaysForm7);
			roadWays7.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: roadWaysForm7");
			Select roadWays9 = new Select(roadWaysForm9);
			roadWays9.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: roadWaysForm9");
			Select roadWays11 = new Select(roadWaysForm11);
			roadWays11.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: roadWaysForm11");
			Select roadWays13 = new Select(roadWaysForm13);
			roadWays13.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: roadWaysForm13");
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}

		try {
//		turfGrass
		turfGrass.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Ok turfGrass CheckBox");
		Select turfGrass10=new Select(turfGrassForm10);
		turfGrass10.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Selected: turfGrassForm10");
		Select turfGrass12=new Select(turfGrassForm12);
		turfGrass12.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Selected: roadWaysForm7");
		Select turfGrass14=new Select(turfGrassForm14);
		turfGrass14.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Selected: turfGrassForm14");
		Select turfGrass16=new Select(turfGrassForm16);
		turfGrass16.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Selected: turfGrassForm16");
		Select turfGrass18=new Select(turfGrassForm18);
		turfGrass18.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Selected: turfGrassForm18");
		}
		catch(Exception e) {
		System.out.println("Exception Handled");	
		}
		
		try {
//			Plant Beds
			plantBeds.click();
			Thread.sleep(2000);
			System.out.println("Clicked on Ok Plant Beds CheckBox");
			Select plantBed15=new Select(plantBeds15);
			plantBed15.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds15");
			Select plantBed17=new Select(plantBeds17);
			plantBed17.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds17");
			Select plantBed19=new Select(plantBeds19);
			plantBed19.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds19");
			Select plantBed21=new Select(plantBeds21);
			plantBed21.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds21");
			Select plantBed23=new Select(plantBeds23);
			plantBed23.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds23");
			}
			catch(Exception e) {
			System.out.println("Exception Handled");	
			}
		
		try {
//			Street Litter/Trash
			
			Select litter=new Select(litterRating);
			litter.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: litterRating");
			litterComments1.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments1");
			litterComments2.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments2");
			litterComments3.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments3");
			litterComments4.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments4");
			litterComments5.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments5");
			litterComments6.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments6");
			litterComments7.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments7");
			
			}
			catch(Exception e) {
			System.out.println("Exception Handled");	
			}
		
		
		save.click();
		System.out.println("Clicked on Save");
		Thread.sleep(1000);
		comments.sendKeys("Away from the location because of rain");
		submit.click();
		System.out.println("Task Saved Successfully");
		
		}


}
