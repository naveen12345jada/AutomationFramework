package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class General  extends Global{
	public void openApplication()  {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\jadan\\OneDrive\\Documents\\driversselenium\\geckodriver-v0.32.2-win64");
//	WebDriver driver = new FirefoxDriver();
		driver=new FirefoxDriver(); //decclaring 
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("open into application completed");
	}
	
	public void Close() {
		driver.close();
		System.out.println("apllication closed");
	}
	
	public void login(){
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_Password)).sendKeys(password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login into application completed");
			
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout into application completed");
		
	}
	
	
	
}
