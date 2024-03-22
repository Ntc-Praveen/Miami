package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.FileLib;
import assessorData.Dashboard;
import logins.AssessorLogin;

public class AssStartingJob extends BaseTest {
	
	@Test
	public void StartingJob() throws Throwable
	{
		FileLib Flib=new FileLib();
		AssessorLogin algn= new AssessorLogin();
		algn.assessorLogin(Flib.readPropData(PROP_PATH, "UserEmailId"), Flib.readPropData(PROP_PATH, "UserPassword"));
	
		Thread.sleep(2000);
		Dashboard A=new Dashboard();
		A.assesorStartJob();
		A.assesorStartTask();
		A.assessorStartAssesemnt();
		A.assessorUnableToCompleteTask();
		

	}
	
		

}
