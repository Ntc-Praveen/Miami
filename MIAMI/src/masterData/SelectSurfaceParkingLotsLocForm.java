package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectSurfaceParkingLotsLocForm {
	
    @FindBy(xpath="//*[@id=\"ddlAreaId\"]")private WebElement publicareaclick;
	
	public WebElement getPublicareadropdownclick() {
		return publicareaclick;
	}
	
	public void surfaceParkinglotslocationform() {
		getPublicareadropdownclick().click();
		Select surfaceparklots = new Select(getPublicareadropdownclick());
		surfaceparklots.selectByValue("6");
	}

}
