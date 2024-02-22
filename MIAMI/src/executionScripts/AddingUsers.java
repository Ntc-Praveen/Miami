package executionScripts;

import logins.AdminLogin;
import masterData.Adduser;

import org.testng.annotations.Test;
import GenericLib.BaseTest;
                                                     /*** Written By VidyaSagar ***/
public class AddingUsers extends BaseTest 
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
		s.addUser();
		Thread.sleep(5000);
		Adduser ac=new Adduser();
		ac.addAccessor();
		
	}
}
