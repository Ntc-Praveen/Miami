package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import logins.AdminLogin;
import masterData.Vehicles;

public class Deletevehicle extends BaseTest{
	
	@Test
	public void vehicleDelete() throws Throwable
	{
	       AdminLogin Al=new AdminLogin();
	       Al.adminLogin();
	       Vehicles vh=new Vehicles();
	       vh.Deletevehicle();
	
	}
	
	

}
