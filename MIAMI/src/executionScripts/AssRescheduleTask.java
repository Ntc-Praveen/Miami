package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.FileLib;
import assessorData.ResheduleTask;
import logins.AssessorLogin;

public class AssRescheduleTask extends BaseTest {

	@Test
	public void Rescheduleass() throws Throwable {
		FileLib Flib = new FileLib();
		AssessorLogin algn = new AssessorLogin();
		algn.assessorLogin(Flib.readPropData(PROP_PATH, "UserEmailId"), Flib.readPropData(PROP_PATH, "UserPassword"));

		Thread.sleep(2000);
		ResheduleTask R = new ResheduleTask();

		R.assessorRescheduleTask();

	}

}
