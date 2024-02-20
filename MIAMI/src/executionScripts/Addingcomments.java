package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import logins.AdminLogin;
import masterData.AddComments;

public class Addingcomments extends BaseTest {
	
	@Test
	public void Commentadding() throws Throwable
	{
		AdminLogin Al=new AdminLogin();
		Al.adminLogin();
		Thread.sleep(3000);
		AddComments C=new AddComments();
		C.Commentadd();
	}
	
	
	

}
