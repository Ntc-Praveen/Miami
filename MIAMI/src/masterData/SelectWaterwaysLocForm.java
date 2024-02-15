package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectWaterwaysLocForm {
	
    @FindBy(xpath="//*[@id=\"ddlAreaId\"]")private WebElement publicareaclick;
	
	public WebElement getPublicareadropdownclick() {
		return publicareaclick;
	}
	
	public void waterways() {
		getPublicareadropdownclick().click();
		Select waterways = new Select(getPublicareadropdownclick());
		waterways.selectByValue("7");
	}

}
