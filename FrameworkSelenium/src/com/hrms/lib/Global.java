package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global{


	// To provide Test Data & Objects /Elements for Whole Application
	
	//TestData
		public String url ="http://183.82.103.245/nareshit/login.php";
		public String username= "nareshit";
		public String  password="nareshit";
		
		//Object Elements
		public String txt_loginname="txtUserName";
		public String txt_Password="txtPassword";
		public String btn_login="Submit";
		public String link_logout="Logout";
		public WebDriver driver;
		


}
