package shiftInfo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BaseTest;

public class GetAllShiftInfoNew {
	
	@FindBy(xpath="//a[@href='/ShiftInfo/ShiftInfoMaster/GetAllShiftInfoNew']")private WebElement shiftInfotab;
	@FindBy(xpath="//h2[text()='Shift Info']")private WebElement shiftInfoTitle;
	@FindBy(xpath="//h2[text()='Shift Info']")private WebElement shiftInf;
		

	public GetAllShiftInfoNew() {
		
		PageFactory.initElements(BaseTest.driver, this);
	}

	
	
	
}
