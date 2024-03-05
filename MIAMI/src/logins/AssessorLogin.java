package logins;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import GenericLib.BaseTest;

public class AssessorLogin {
	
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//input[@type='submit']")private WebElement loginButton;

	public AssessorLogin() {
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
	
	public void assessorLogin(String usn,String pwd) throws Throwable {
		
//		Input User email Id
 
		email.sendKeys(usn);
        Thread.sleep(2000);

//		Input User Password	
  
        password.sendKeys(pwd);
        Thread.sleep(2000);
		
        loginButton.click();
        
		Reporter.log("Logged In as : "+usn, true);
		

	}
	
	}
