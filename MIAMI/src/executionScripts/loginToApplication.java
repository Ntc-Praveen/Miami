package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.WebDriverCommonLib;
import logins.AdminLogin;

public class loginToApplication extends BaseTest {
	
	@Test
	
	public void Login() throws Throwable {
		
		AdminLogin lgn = new AdminLogin();
		lgn.adminLogin();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.Emailreports();
		
		
		
	}

}
