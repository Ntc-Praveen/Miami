
package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.FileLib;
import assessorData.Addpayroll;
import logins.AssessorLogin;

public class AssAddpayroll extends BaseTest {
	
	@Test
	public void SheduleReq() throws Throwable
	{
		FileLib Flib=new FileLib();
		AssessorLogin algn= new AssessorLogin();
		algn.assessorLogin(Flib.readPropData(PROP_PATH, "UserEmailId"), Flib.readPropData(PROP_PATH, "UserPassword"));
		Thread.sleep(2000);
		Addpayroll A=new Addpayroll();
		A.assesorAddpayroll();
	}
	
}