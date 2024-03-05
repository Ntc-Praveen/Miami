package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.FileLib;
import GenericLib.WebDriverCommonLib;
import logins.AdminLogin;
import logins.AssessorLogin;

public class loginToApplication extends BaseTest {
	
	@Test
	
	public void Login() throws Throwable {
		
//		AdminLogin lgn = new AdminLogin();
//		lgn.adminLogin();
	
		FileLib Flib=new FileLib();		
		AssessorLogin algn= new AssessorLogin();
		algn.assessorLogin(Flib.readPropData(PROP_PATH, "UserEmailId"), Flib.readPropData(PROP_PATH, "UserPassword"));
		
		
//		WebDriverCommonLib wlib = new WebDriverCommonLib();
//		wlib.Emailreports();
		
		
		
	}

}
