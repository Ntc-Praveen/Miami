package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectStreetsSidewalksLocForm {
	
@FindBy(xpath="//*[@id=\"ddlAreaId\"]")private WebElement publicareaclick;
	
	public WebElement getPublicareadropdownclick() {
		return publicareaclick;
	}
	
	public void streetsSidewalkslocationform() {
		getPublicareadropdownclick().click();
		Select streetssidewalks = new Select(getPublicareadropdownclick());
		streetssidewalks.selectByValue("4");	
	}

}
