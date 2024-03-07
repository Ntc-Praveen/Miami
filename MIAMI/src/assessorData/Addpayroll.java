package assessorData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BaseTest;

public class Addpayroll extends BaseTest{
	
	@FindBy(xpath="//a[@href='/Addassessorpayroll/Addassessorpayroll/Addpayroll']")private WebElement addpayroll;
	
		
	public WebElement getAddpayroll() {
		return addpayroll;
	}

	public Addpayroll() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void assesorAddpayroll() throws InterruptedException
	{
		addpayroll.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Pay Roll");
	}

}
