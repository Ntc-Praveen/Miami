package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import logins.AdminLogin;
import masterData.Adduser;

public class DeletingUser extends BaseTest{
	@Test
	public void UserDlete() throws Throwable
	{
		Thread.sleep(2000);
		AdminLogin Al=new AdminLogin();
		Al.adminLogin();
		Thread.sleep(2000);
		Adduser Au=new Adduser();
		Au.deleteUser();
		Adduser ac=new Adduser();
		ac.deleteAccessor();	
		
	}
	
	

}
