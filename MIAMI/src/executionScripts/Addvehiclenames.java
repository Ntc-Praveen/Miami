package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import logins.AdminLogin;
import masterData.Vehicles;

public class Addvehiclenames extends BaseTest {
	
	@Test
	public void Vehiclenamesadd() throws Throwable
	{
	    AdminLogin Al=new AdminLogin();  
		Al.adminLogin();
		Thread.sleep(2000);
		Vehicles V=new Vehicles();
		V.Addvehicle();
				
		
	}

}
