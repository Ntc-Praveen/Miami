package logins;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import GenericLib.BaseTest;
import GenericLib.FileLib;
import GenericLib.WebDriverCommonLib;

public class AdminLogin {
	
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//input[@type='submit']")private WebElement loginButton;

	public AdminLogin() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void adminLogin() throws Throwable {
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();
		Reporter.log("Execution Started, trying to login as ADMIN User", true);
		email.sendKeys("admin@neumeric2023.onmicrosoft.com");
		Thread.sleep(2000);
		password.sendKeys("Neumeric@0602");
		Thread.sleep(2000);
		loginButton.click();
		//wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "loginTitle"), "Login Page");
	}
}
