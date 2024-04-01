package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.FileLib;
import assessorData.AssessorStartTask;
import logins.AssessorLogin;

public class AssStartAssesment extends BaseTest {
	
	@Test
	public void AssDashoardstrat() throws Throwable
	{
		FileLib Flib=new FileLib();
		AssessorLogin algn= new AssessorLogin();
		algn.assessorLogin(Flib.readPropData(PROP_PATH, "UserEmailId"), Flib.readPropData(PROP_PATH, "UserPassword"));
	
		Thread.sleep(2000);
		AssessorStartTask A=new AssessorStartTask();
		A.assesorStartTask();
		
	}

}
