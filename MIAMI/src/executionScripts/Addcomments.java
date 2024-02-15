package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import logins.AdminLogin;
import masterData.Comments;

public class Addcomments extends BaseTest {
	
	@Test
	public void Commentadding() throws Throwable
	{
		AdminLogin Al=new AdminLogin();
		Al.adminLogin();
		Thread.sleep(3000);
		Comments C=new Comments();
		C.Commentadd();
	}
	
	
	

}
