package com.hrms.testscripts;
import com.hrms.lib.*;

public class Tc_001  {

	public static void main(String[] args) throws Exception {
//	we have to create object for the class who have methods in that  class 	 so we have methods for the general class so we have to create objects for 2nd class

		General c = new General();
		c.openApplication();
	  Thread.sleep(3000);
		c.login();
		Thread.sleep(3000);
		c.logout();
		Thread.sleep(3000);
		c.Close();
		

	}

}
