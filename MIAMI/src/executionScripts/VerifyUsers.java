package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import logins.AdminLogin;
import masterData.Adduser;
                                                   /*** Written By VidyaSagar ***/
public class VerifyUsers extends BaseTest{
	
	@Test
	public void Usersverify() throws Throwable
	{
		AdminLogin Al=new AdminLogin();
		Al.adminLogin();
		Thread.sleep(1000);
		Adduser au=new Adduser();
		au.verifyUser();
		Thread.sleep(1000);
		
	}
	

}
