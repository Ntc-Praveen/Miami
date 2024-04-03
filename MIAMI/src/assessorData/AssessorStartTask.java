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
	@FindBy(xpath = "/html/body/div/div/div[4]/div/button")private WebElement startJobOk;
	@FindBy(xpath = "//h3[@id='totalTask1']")private WebElement totalTasksHeader;
	@FindBy(xpath = "//div[@id='faqhead1']/div/button/img")private WebElement taskOptions;
	@FindBy(xpath = "//button[text()='Start Assessment']")private WebElement startAssesemnt;
	@FindBy(xpath = "//button[text()='OK']")private WebElement locationPopup;

//	Sidewalk Options
	@FindBy(xpath = "//*[@id='qCat_1']")private WebElement sideWalks;
	@FindBy(xpath = "//*[contains(text(),'Smooth and even with no cracked or broken panels/bricks')]")private WebElement SidewalkText;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_0__OptionRating']")private WebElement sideWalksForm0;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_2__OptionRating']")private WebElement sideWalksForm2;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_4__OptionRating']")private WebElement sideWalksForm4;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_6__OptionRating']")private WebElement sideWalksForm6;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_8__OptionRating']")private WebElement sideWalksForm8;

//	Roadways Options
	@FindBy(xpath = "//*[@id='qCat_2']")private WebElement roadWays;
	@FindBy(xpath = "//*[contains(text(),'Asphalt Smooth')]')]")private WebElement roadWaysText;
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
//	Plant Beds

//	Plant Beds Options
	@FindBy(xpath = "//*[@id='qCat_4']")private WebElement plantBeds;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_10__OptionRating']")private WebElement plantBeds10;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_11__OptionRating']")private WebElement plantBeds11;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_12__OptionRating']")private WebElement plantBeds12;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_13__OptionRating']")private WebElement plantBeds13;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_14__OptionRating']")private WebElement plantBeds14;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_15__OptionRating']")private WebElement plantBeds15;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_16__OptionRating']")private WebElement plantBeds16;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_17__OptionRating']")private WebElement plantBeds17;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_18__OptionRating']")private WebElement plantBeds18;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_19__OptionRating']")private WebElement plantBeds19;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_20__OptionRating']")private WebElement plantBeds20;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_21__OptionRating']")private WebElement plantBeds21;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_22__OptionRating']")private WebElement plantBeds22;
	@FindBy(xpath = "//select[@id='assessments_ListFormData_23__OptionRating']")private WebElement plantBeds23;

//	Street Litter/Trash
	@FindBy(xpath = "//*[contains(text(),'Litter/Trash')]")private WebElement LitterTrash;
	@FindBy(xpath = "//*[@id='assessments_ListFormData_0__OptionRating']")private WebElement litterRating;
	@FindBy(xpath = "//*[@id='Q1173_1']")private WebElement litterComments1;
	@FindBy(xpath = "//*[@id='Q1173_2']")private WebElement litterComments2;
	@FindBy(xpath = "//*[@id='Q1173_3']")private WebElement litterComments3;
	@FindBy(xpath = "//*[@id='Q1173_4']")private WebElement litterComments4;
	@FindBy(xpath = "//*[@id='Q1173_5']")private WebElement litterComments5;
	@FindBy(xpath = "//*[@id='Q1173_6']")private WebElement litterComments6;
	@FindBy(xpath = "//*[@id='Q1173_7']")private WebElement litterComments7;
	
//	Street Litter/Trash
	@FindBy(xpath = "//*[contains(text(),'Litter/Trash')]")private WebElement LitterandTrash;
	@FindBy(xpath = "//*[@id='Q1167_1']")private WebElement litterTrash1;
	@FindBy(xpath = "//*[@id='Q1167_2']")private WebElement litterTrash2;
	@FindBy(xpath = "//*[@id='Q1167_3']")private WebElement litterTrash3;
	@FindBy(xpath = "//*[@id='Q1167_4']")private WebElement litterTrash4;
	@FindBy(xpath = "//*[@id='Q1167_5']")private WebElement litterTrash5;
	@FindBy(xpath = "//*[@id='Q1167_6']")private WebElement litterTrash6;
	@FindBy(xpath = "//*[@id='Q1167_7']")private WebElement litterTrash7;
	
//	Street Litter/Trash	
	@FindBy(xpath = "//*[@id='Q1188_1']")private WebElement litterComments8;
	@FindBy(xpath = "//*[@id='Q1188_2']")private WebElement litterComments9;
	@FindBy(xpath = "//*[@id='Q1188_3']")private WebElement litterComments10;
	@FindBy(xpath = "//*[@id='Q1188_4']")private WebElement litterComments11;
	@FindBy(xpath = "//*[@id='Q1188_5']")private WebElement litterComments12;
	@FindBy(xpath = "//*[@id='Q1188_6']")private WebElement litterComments13;
	@FindBy(xpath = "//*[@id='Q1188_7']")private WebElement litterComments14;

//	Street Organic Materials
	@FindBy(xpath = "//*[@id='assessments_ListFormData_1__OptionRating']")private WebElement organicMaterials;
	@FindBy(xpath = "//*[@id='Q1174_13']")private WebElement organicMaterials1;
	@FindBy(xpath = "//*[@id='Q1174_14']")private WebElement organicMaterials2;
	@FindBy(xpath = "//*[@id='Q1174_15']")private WebElement organicMaterials3;
	@FindBy(xpath = "//*[@id='Q1174_16']")private WebElement organicMaterials4;
	@FindBy(xpath = "//*[@id='Q1174_17']")private WebElement organicMaterials5;

//	Street Fecal Matter
	@FindBy(xpath = "//*[@id='assessments_ListFormData_2__OptionRating']")private WebElement fecalMatter;
	@FindBy(xpath = "//*[@id='Q1175_3']")private WebElement fecalMatter1;
	@FindBy(xpath = "//*[@id='Q1169_6']")private WebElement fecalMatter2;
	@FindBy(xpath = "//*[@id='Q1169_26']")private WebElement fecalMatter3;
	

	@FindBy(xpath = "//*[@id='assessments_ListFormData_2__OptionRating']")private WebElement streetfecalMatter;
	@FindBy(xpath = "//*[@id='Q1169_3']")private WebElement fecalMatter4;
	@FindBy(xpath = "//*[@id='Q1175_6']")private WebElement fecalMatter5;
	@FindBy(xpath = "//*[@id='Q1175_26']")private WebElement fecalMatter6;

//	Sidewalk Litter/Trash
	@FindBy(xpath = "//*[@id='assessments_ListFormData_3__OptionRating']")private WebElement sidewalkLitterrating;
	@FindBy(xpath = "//*[@id='Q1490_1']")private WebElement sidewalkLitter1;
	@FindBy(xpath = "//*[@id='Q1490_2']")private WebElement sidewalkLitter2;
	@FindBy(xpath = "//*[@id='Q1490_3']")private WebElement sidewalkLitter3;
	@FindBy(xpath = "//*[@id='Q1490_4']")private WebElement sidewalkLitter4;
	@FindBy(xpath = "//*[@id='Q1490_5']")private WebElement sidewalkLitter5;
	@FindBy(xpath = "//*[@id='Q1490_6']")private WebElement sidewalkLitter6;
	@FindBy(xpath = "//*[@id='Q1490_7']")private WebElement sidewalkLitter7;
	@FindBy(xpath = "//*[@id='Q1490_29']")private WebElement sidewalkLitter8;
	
//	Sidewalk Litter/Trash
	@FindBy(xpath = "//*[@id='assessments_ListFormData_3__OptionRating']")private WebElement sidewalkLitter;
	@FindBy(xpath = "//*[@id='Q1484_1']")private WebElement sidewalkLittertrash1;
	@FindBy(xpath = "//*[@id='Q1484_2']")private WebElement sidewalkLittertrash2;
	@FindBy(xpath = "//*[@id='Q1484_3']")private WebElement sidewalkLittertrash3;
	@FindBy(xpath = "//*[@id='Q1484_4']")private WebElement sidewalkLittertrash4;
	@FindBy(xpath = "//*[@id='Q1484_5']")private WebElement sidewalkLittertrash5;
	@FindBy(xpath = "//*[@id='Q1484_6']")private WebElement sidewalkLittertrash6;
	@FindBy(xpath = "//*[@id='Q1484_7']")private WebElement sidewalkLittertrash7;
	@FindBy(xpath = "//*[@id='Q1484_29']")private WebElement sidewalkLittertrash8;

//	Sidewalk Organic Materials
	@FindBy(xpath = "//*[@id='assessments_ListFormData_4__OptionRating']")private WebElement sidewalkOrganic;
	@FindBy(xpath = "//*[@id='Q1491_13']")private WebElement sidewalkOrganic1;
	@FindBy(xpath = "//*[@id='Q1491_14']")private WebElement sidewalkOrganic2;
	@FindBy(xpath = "//*[@id='Q1491_15']")private WebElement sidewalkOrganic3;
	@FindBy(xpath = "//*[@id='Q1491_16']")private WebElement sidewalkOrganic4;
	@FindBy(xpath = "//*[@id='Q1491_17']")private WebElement sidewalkOrganic5;

//	Sidewalk Fecal Matter
	@FindBy(xpath = "//*[@id='assessments_ListFormData_5__OptionRating']")private WebElement sidewalkFecal;
	@FindBy(xpath = "//*[@id='Q1492_3']")private WebElement sidewalkFecal1;
	@FindBy(xpath = "//*[@id='Q1492_6']")private WebElement sidewalkFecal2;
	@FindBy(xpath = "//*[@id='Q1492_26']")private WebElement sidewalkFecal3;

//	Sidewalk Litter/ Garbage Cans/ Dumpsters
	@FindBy(xpath = "//*[@id='assessments_ListFormData_6__OptionRating']")private WebElement sidewalkDumpsters;
	@FindBy(xpath = "//*[@id='Q1524_3']")private WebElement sidewalkDumpsters1;
	@FindBy(xpath = "//*[@id='Q1524_4']")private WebElement sidewalkDumpsters2;
	@FindBy(xpath = "//*[@id='Q1524_8']")private WebElement sidewalkDumpsters3;
	@FindBy(xpath = "//*[@id='Q1524_9']")private WebElement sidewalkDumpsters4;
	@FindBy(xpath = "//*[@id='Q1524_11']")private WebElement sidewalkDumpsters5;
	@FindBy(xpath = "//*[@id='Q1524_12']")private WebElement sidewalkDumpsters6;

// Save
	@FindBy(xpath = "//*[@id='Save']")private WebElement save;
	@FindBy(xpath = "//*[@id='disComments']")private WebElement comments;
	@FindBy(xpath = "//*[@id='btnSubmit']")private WebElement submit;

	public AssessorStartTask() {
		PageFactory.initElements(BaseTest.driver, this);
	}

//	Start Job Methods
	public WebElement getStartJob() {
		return startJob;
	}

	public WebElement getstartJobOk() {
		return startJobOk;
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

	public WebElement getSidewalkText() {
		return SidewalkText;
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

	public WebElement getroadWaysText() {
		return roadWaysText;
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

	public WebElement getplantBeds10() {
		return plantBeds10;
	}

	public WebElement getplantBeds11() {
		return plantBeds11;
	}

	public WebElement getplantBeds12() {
		return plantBeds12;
	}

	public WebElement getplantBeds13() {
		return plantBeds13;
	}

	public WebElement getplantBeds14() {
		return plantBeds14;
	}

	public WebElement getplantBeds15() {
		return plantBeds15;
	}

	public WebElement getplantBeds16() {
		return plantBeds16;
	}

	public WebElement getplantBeds17() {
		return plantBeds17;
	}

	public WebElement getplantBeds18() {
		return plantBeds18;
	}

	public WebElement getplantBeds19() {
		return plantBeds19;
	}

	public WebElement getplantBeds20() {
		return plantBeds20;
	}

	public WebElement getplantBeds21() {
		return plantBeds21;
	}

	public WebElement getplantBeds22() {
		return plantBeds22;
	}

	public WebElement getplantBeds23() {
		return plantBeds23;
	}

//	litterRating Options

	public WebElement getLitterTrash() {
		return LitterTrash;
	}

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

	public WebElement getlitterComments6() {
		return litterComments6;
	}

	public WebElement getlitterComments7() {
		return litterComments7;
	}
	
	public WebElement getlitterandTrash() {
		return LitterandTrash;
	}


	public WebElement getlitterTrash1() {
		return litterTrash1;
	}

	public WebElement getlitterTrash2() {
		return litterTrash2;
	}

	public WebElement getlitterTrash3() {
		return litterTrash3;
	}

	public WebElement getlitterTrash4() {
		return litterTrash4;
	}

	public WebElement getlitterTrash5() {
		return litterTrash5;
	}

	public WebElement getlitterTrash6() {
		return litterTrash6;
	}

	public WebElement getlitterTrash7() {
		return litterTrash7;
	}
	

	public WebElement getlitterComments8() {
		return litterComments8;
	}

	public WebElement getlitterComments9() {
		return litterComments9;
	}

	public WebElement getlitterComments10() {
		return litterComments10;
	}

	public WebElement getlitterComments11() {
		return litterComments11;
	}

	public WebElement getlitterComments12() {
		return litterComments12;
	}

	public WebElement getlitterComments13() {
		return litterComments13;
	}

	public WebElement getlitterComments14() {
		return litterComments14;
	}

//	organic Materials
	public WebElement getorganicMaterials() {
		return organicMaterials;
	}

	public WebElement getorganicMaterials1() {
		return organicMaterials1;
	}

	public WebElement getorganicMaterials2() {
		return organicMaterials2;
	}

	public WebElement getorganicMaterials3() {
		return organicMaterials3;
	}

	public WebElement getorganicMaterials4() {
		return organicMaterials4;
	}

	public WebElement getorganicMaterials5() {
		return organicMaterials5;
	}

//	Street Fecal Matter
	public WebElement getfecalMatter() {
		return fecalMatter;
	}

	public WebElement getfecalMatter1() {
		return fecalMatter1;
	}

	public WebElement getfecalMatter2() {
		return fecalMatter2;
	}

	public WebElement getfecalMatter3() {
		return fecalMatter3;
	}
	public WebElement getfecalandMatter() {
		return streetfecalMatter;
	}

	public WebElement getfecalMatter4() {
		return fecalMatter4;
	}

	public WebElement getfecalMatter5() {
		return fecalMatter5;
	}

	public WebElement getfecalMatter6() {
		return fecalMatter6;
	}


//	Sidewalk Litter/Trash
	public WebElement getsidewalkLitterrating() {
		return sidewalkLitterrating;
	}

	public WebElement getsidewalkLitter1() {
		return sidewalkLitter1;
	}

	public WebElement getsidewalkLitter2() {
		return sidewalkLitter2;
	}

	public WebElement getsidewalkLitter3() {
		return sidewalkLitter3;
	}

	public WebElement getsidewalkLitter4() {
		return sidewalkLitter4;
	}

	public WebElement getsidewalkLitter5() {
		return sidewalkLitter5;
	}

	public WebElement getsidewalkLitter6() {
		return sidewalkLitter6;
	}

	public WebElement getsidewalkLitter7() {
		return sidewalkLitter7;
	}

	public WebElement getsidewalkLitter8() {
		return sidewalkLitter8;
	}
	
//	Sidewalk Litter/Trash
	public WebElement getsidewalkLitter() {
		return sidewalkLitter;
	}

	public WebElement getsidewalkLittertrash1() {
		return sidewalkLittertrash1;
	}

	public WebElement getsidewalkLittertrash2() {
		return sidewalkLittertrash2;
	}

	public WebElement getsidewalkLittertrash3() {
		return sidewalkLitter3;
	}

	public WebElement getsidewalkLittertrash4() {
		return sidewalkLittertrash4;
	}

	public WebElement getsidewalkLittertrash5() {
		return sidewalkLittertrash5;
	}

	public WebElement getsidewalkLittertrash6() {
		return sidewalkLittertrash6;
	}

	public WebElement getsidewalkLittertrash7() {
		return sidewalkLittertrash7;
	}

	public WebElement getsidewalkLittertrash8() {
		return sidewalkLittertrash8;
	}

//	Sidewalk Organic Materials
	public WebElement getsidewalkOrganic() {
		return sidewalkOrganic;
	}

	public WebElement getsidewalkOrganic1() {
		return sidewalkOrganic1;
	}

	public WebElement getsidewalkOrganic2() {
		return sidewalkOrganic2;
	}

	public WebElement getsidewalkOrganic3() {
		return sidewalkOrganic3;
	}

	public WebElement getsidewalkOrganic4() {
		return sidewalkOrganic4;
	}

	public WebElement getsidewalkOrganic5() {
		return sidewalkOrganic5;
	}

//	Sidewalk Fecal Matter
	public WebElement getsidewalkFecal() {
		return sidewalkFecal;
	}

	public WebElement getsidewalkFecal1() {
		return sidewalkFecal1;
	}

	public WebElement getsidewalkFecal2() {
		return sidewalkFecal2;
	}

	public WebElement getsidewalkFecal3() {
		return sidewalkFecal3;
	}

//	Sidewalk Litter/ Garbage Cans/ Dumpsters
	public WebElement getsidewalkDumpsters() {
		return sidewalkDumpsters;
	}

	public WebElement getsidewalkDumpsters1() {
		return sidewalkDumpsters1;
	}

	public WebElement getsidewalkDumpsters2() {
		return sidewalkDumpsters2;
	}

	public WebElement getsidewalkDumpsters3() {
		return sidewalkDumpsters3;
	}

	public WebElement getsidewalkDumpsters4() {
		return sidewalkDumpsters4;
	}

	public WebElement getsidewalkDumpsters5() {
		return sidewalkDumpsters5;
	}

	public WebElement getsidewalkDumpsters6() {
		return sidewalkDumpsters6;
	}

	// save
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
			startJobOk.click();

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

//-----------------------------------------------------------
//		if(LitterTrash.getText()=="Litter/Trash") {
//			LitterTrash();
//		}
//		
//		else if(SidewalkText.getText()=="Smooth and even with no cracked or broken panels/bricks") {
//			LitterTrash();
//		}else if(roadWaysText.getText()=="Asphalt Smooth")
//		{
//			RoadWaysTest();
//		}
//		
//		
//		else{
//			System.out.println("Text Not available");
//			}
//		
//-----------------------------------------------------------

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

		} catch (Exception e) {
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
		} catch (Exception e) {
			System.out.println("Exception handled");
		}

		try {
//		Plant Beds
			plantBeds.click();
			Thread.sleep(2000);
			System.out.println("Clicked on Ok Plant Beds CheckBox");
			Select plantBed10 = new Select(plantBeds10);
			plantBed10.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds10");
			Select plantBed12 = new Select(plantBeds12);
			plantBed12.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds12");
			Select plantBed14 = new Select(plantBeds14);
			plantBed14.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds14");
			Select plantBed16 = new Select(plantBeds16);
			plantBed16.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds16");
			Select plantBed18 = new Select(plantBeds18);
			plantBed18.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds18");
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}

		try {
//		turfGrass
			turfGrass.click();
			Thread.sleep(2000);
			System.out.println("Clicked on Ok turfGrass CheckBox");
			Select turfGrass10 = new Select(turfGrassForm10);
			turfGrass10.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: turfGrassForm10");
			Select turfGrass12 = new Select(turfGrassForm12);
			turfGrass12.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: roadWaysForm7");
			Select turfGrass14 = new Select(turfGrassForm14);
			turfGrass14.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: turfGrassForm14");
			Select turfGrass16 = new Select(turfGrassForm16);
			turfGrass16.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: turfGrassForm16");
			Select turfGrass18 = new Select(turfGrassForm18);
			turfGrass18.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: turfGrassForm18");
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}

		try {
//			Plant Beds
			plantBeds.click();
			Thread.sleep(2000);
			System.out.println("Clicked on Ok Plant Beds CheckBox");
			Select plantBed15 = new Select(plantBeds15);
			plantBed15.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds15");
			Select plantBed17 = new Select(plantBeds17);
			plantBed17.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds17");
			Select plantBed19 = new Select(plantBeds19);
			plantBed19.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds19");
			Select plantBed21 = new Select(plantBeds21);
			plantBed21.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds21");
			Select plantBed23 = new Select(plantBeds23);
			plantBed23.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: plantBeds23");
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}

		try {
//			Street Litter/Trash

			Select litter = new Select(litterRating);
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

		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
		try {
//			Street Litter/Trash

			Select litter = new Select(LitterandTrash);
			litter.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: litterRating");
			litterTrash1.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterTrash1");
			litterTrash2.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterTrash2");
			litterTrash3.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterTrash3");
			litterTrash4.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterTrash4");
			litterTrash5.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterTrash5");
			litterTrash6.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterTrash6");
			litterTrash7.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterTrash7");

		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		try {
//			Street Litter/Trash

			Select litter = new Select(litterRating);
			litter.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: litterRating");
			litterComments8.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments8");
			litterComments9.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments9");
			litterComments10.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments10");
			litterComments11.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments11");
			litterComments12.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments12");
			litterComments13.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments13");
			litterComments14.click();
			Thread.sleep(1000);
			System.out.println("Clicked on litterComments14");

		} catch (Exception e) {
			System.out.println("Exception handled");
		}

		try {
//			Street Litter/Trash

			Select litter = new Select(organicMaterials);
			litter.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: organicMaterials");
			organicMaterials1.click();
			Thread.sleep(1000);
			System.out.println("Clicked on organicMaterials1");
			organicMaterials2.click();
			Thread.sleep(1000);
			System.out.println("Clicked on organicMaterials2");
			organicMaterials3.click();
			Thread.sleep(1000);
			System.out.println("Clicked on organicMaterials3");
			organicMaterials4.click();
			Thread.sleep(1000);
			System.out.println("Clicked on organicMaterials4");
			organicMaterials5.click();
			Thread.sleep(1000);
			System.out.println("Clicked on organicMaterials5");

		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		try {
//			Street Fecal Matter

			Select litter = new Select(fecalMatter);
			litter.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: fecalMatter");
			fecalMatter1.click();
			Thread.sleep(1000);
			System.out.println("Clicked on fecalMatter1");
			fecalMatter2.click();
			Thread.sleep(1000);
			System.out.println("Clicked on fecalMatter2");
			fecalMatter3.click();
			Thread.sleep(1000);
			System.out.println("Clicked on fecalMatter3");
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
		try {
//			Street Fecal Matter

			Select litter = new Select(streetfecalMatter);
			litter.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: streetfecalMatter");
			fecalMatter4.click();
			Thread.sleep(1000);
			System.out.println("Clicked on fecalMatter4");
			fecalMatter5.click();
			Thread.sleep(1000);
			System.out.println("Clicked on fecalMatter5");
			fecalMatter6.click();
			Thread.sleep(1000);
			System.out.println("Clicked on fecalMatter6");
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		try {
//			Sidewalk Litter/Trash

			Select litter = new Select(sidewalkLitterrating);
			litter.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: sidewalkLitterrating");
			sidewalkLitter1.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLitter1");
			sidewalkLitter2.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLitter2");
			sidewalkLitter3.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLitter3");
			sidewalkLitter4.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLitter4");
			sidewalkLitter5.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLitter5");
			sidewalkLitter6.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLitter6");
			sidewalkLitter7.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLitter7");
			sidewalkLitter8.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLitter8");
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
		try {
//			Sidewalk Litter/Trash

			Select litter = new Select(sidewalkLitter);
			litter.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: sidewalkLitterrating");
			sidewalkLittertrash1.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLittertrash1");
			sidewalkLittertrash2.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLittertrash2");
			sidewalkLittertrash3.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLittertrash3");
			sidewalkLittertrash4.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLittertrash4");
			sidewalkLittertrash5.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLittertrash5");
			sidewalkLittertrash6.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLittertrash6");
			sidewalkLittertrash7.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLittertrash7");
			sidewalkLittertrash8.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkLittertrash8");
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}

		try {
//			Sidewalk Organic Materials

			Select sidewalkO = new Select(sidewalkOrganic);
			sidewalkO.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: sidewalkOrganic");
			sidewalkOrganic1.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkOrganic1");
			sidewalkOrganic2.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkOrganic2");
			sidewalkOrganic3.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkOrganic3");
			sidewalkOrganic4.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkOrganic4");
			sidewalkOrganic5.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkOrganic5");
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		try {
//			Sidewalk Fecal Matter

			Select sidewalkF = new Select(sidewalkFecal);
			sidewalkF.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: sidewalkFecal");
			sidewalkFecal1.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkFecal1");
			sidewalkFecal2.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkFecal2");
			sidewalkFecal3.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkFecal3");
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		try {
//			Sidewalk Litter/ Garbage Cans/ Dumpsters

			Select sidewalkD = new Select(sidewalkDumpsters);
			sidewalkD.selectByValue("1");
			Thread.sleep(1000);
			System.out.println("Selected: sidewalkDumpsters");
			sidewalkDumpsters1.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkDumpsters1");
			sidewalkDumpsters2.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkDumpsters2");
			sidewalkDumpsters3.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkDumpsters3");
			sidewalkDumpsters4.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkDumpsters4");
			sidewalkDumpsters5.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkDumpsters5");
			sidewalkDumpsters6.click();
			Thread.sleep(1000);
			System.out.println("Clicked on sidewalkDumpsters6");

		} catch (Exception e) {
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