package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectParksLocForm {
	
    @FindBy(xpath="//*[@id=\"ddlAreaId\"]")private WebElement publicareaclick;
	
	public WebElement getPublicareadropdownclick() {
		return publicareaclick;
	}
	
	public void parkslocationform() {
		getPublicareadropdownclick().click();
		Select parks = new Select(getPublicareadropdownclick());
		parks.selectByValue("3");	
	}

}
