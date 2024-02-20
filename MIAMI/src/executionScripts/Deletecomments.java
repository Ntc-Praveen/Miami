package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import logins.AdminLogin;
import masterData.AddComments;

public class Deletecomments extends BaseTest {
	@Test
	public void CommentsDelete() throws Throwable
	{
		AdminLogin Al=new AdminLogin();
		Al.adminLogin();
		AddComments cm=new AddComments();
		cm.Deletecomment();
		
	}

}
