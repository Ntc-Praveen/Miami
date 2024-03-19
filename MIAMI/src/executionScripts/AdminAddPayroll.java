package executionScripts;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import logins.AdminLogin;
import masterData.Adminpayroll;


public class AdminAddPayroll extends BaseTest{
	
	@Test
	public void vehicleDelete() throws Throwable
	{
	       AdminLogin Al=new AdminLogin();
	       Al.adminLogin();
	       Adminpayroll payroll=new Adminpayroll();
	       payroll.AdminPayroll();
	
	}
	
	

}