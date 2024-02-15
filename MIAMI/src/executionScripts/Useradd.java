package executionScripts;

import logins.AdminLogin;
import masterData.Adduser;

import org.testng.annotations.Test;
import GenericLib.BaseTest;

public class Useradd extends BaseTest 
{
	
	@Test
	public void CreateUser() throws Throwable
	{
		Thread.sleep(2000);
		AdminLogin lgn = new AdminLogin();
		lgn.adminLogin();
		Thread.sleep(2000);
		Adduser s=new Adduser();
		Thread.sleep(2000);
		s.AddUser();
	}
}
