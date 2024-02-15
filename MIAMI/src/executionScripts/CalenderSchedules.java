package executionScripts;

import org.testng.annotations.Test;
import logins.AdminLogin;
import GenericLib.BaseTest;
import calendar.Calendar;

public class CalenderSchedules extends BaseTest{
	
	@Test
	public void CaSchedule() throws Throwable
	{
		AdminLogin Al=new AdminLogin();
		Al.adminLogin();
		Thread.sleep(2000);
		Calendar cl=new Calendar();
		cl.checkTasks();
				
	}

}
