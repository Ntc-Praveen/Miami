package executionScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import logins.AdminLogin;
import masterData.Addforms;

public class Formsadding extends BaseTest
{
	@Test
	public void AddingForms () throws Throwable
	{
		Thread.sleep(1000);
		AdminLogin lgn = new AdminLogin();
		lgn.adminLogin();
		Reporter.log("Login successful", true);
		Thread.sleep(2000);
		Addforms af=new Addforms();
		af.FormsAdding();		
		Thread.sleep(2000);
		Addforms sf=new Addforms();
		sf.Addmanaginrules();
		
		
	}
	
	

}
