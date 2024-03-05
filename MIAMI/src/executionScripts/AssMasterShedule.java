package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.FileLib;
import assessorData.MySchedules;
import logins.AssessorLogin;

public class AssMasterShedule extends BaseTest {
	
	@Test
	public void MasterShedule() throws Throwable
	{
		FileLib Flib=new FileLib();
		AssessorLogin algn= new AssessorLogin();
		algn.assessorLogin(Flib.readPropData(PROP_PATH, "UserEmailId"), Flib.readPropData(PROP_PATH, "UserPassword"));
		Thread.sleep(2000);
		MySchedules A=new MySchedules();
		A.assesorMasterShedule();
	}
	
}
