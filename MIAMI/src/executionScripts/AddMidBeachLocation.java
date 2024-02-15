package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import logins.AdminLogin;
import masterData.MidBeachAreaLocationForm;
import masterData.SelectBeachAreasLocForm;

public class AddMidBeachLocation extends BaseTest {

	@Test
	public void addmidBeachLocation() throws Throwable
	{
		Thread.sleep(2000);
		AdminLogin lgn = new AdminLogin();
		lgn.adminLogin();
		Thread.sleep(2000);
		SelectBeachAreasLocForm sbal= new SelectBeachAreasLocForm();
		sbal.selectbeachAreaslocationform();
		Thread.sleep(3000);
		MidBeachAreaLocationForm balf = new MidBeachAreaLocationForm();
		balf.midbeachArealocationform();
		Thread.sleep(3000);
	}	
}
