package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import logins.AdminLogin;
import masterData.MidBeachAreaLocationForm;
import masterData.SelectBeachAreasLocForm;

public class AddSouthBeachLocation extends BaseTest{

	@Test
	public void addSouthbeachlocation() throws Throwable
	{
		Thread.sleep(2000);
		AdminLogin lgn = new AdminLogin();
		lgn.adminLogin();
		Thread.sleep(2000);
		SelectBeachAreasLocForm sbal= new SelectBeachAreasLocForm();
		sbal.selectbeachAreaslocationform();
		Thread.sleep(3000);
		MidBeachAreaLocationForm balf = new MidBeachAreaLocationForm();
		balf.southbeachArealocationform();
		Thread.sleep(3000);
	} 
}
