package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.FileLib;
import assessorData.UnableToCompleteTask;
import logins.AssessorLogin;

public class AssUnabletoCompleteTask extends BaseTest {

	@Test
	public void UnableToCompleteTaskass() throws Throwable {
		FileLib Flib = new FileLib();
		AssessorLogin algn = new AssessorLogin();
		algn.assessorLogin(Flib.readPropData(PROP_PATH, "UserEmailId"), Flib.readPropData(PROP_PATH, "UserPassword"));

		Thread.sleep(2000);
		UnableToCompleteTask U = new UnableToCompleteTask();

		U.assessorUnableToCompleteTask();

	}

}
