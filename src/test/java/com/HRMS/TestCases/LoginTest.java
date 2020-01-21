package com.HRMS.TestCases;

import org.testng.annotations.Test;

import com.HRMS.Pages.LoginPage;
import com.HRMS.Utils.CommonMethods;

public class LoginTest extends CommonMethods {

	
	
	@Test
	public void LoginTest() {
	LoginPage login=new LoginPage();
	
	sendText(login.username, "admin");
	sendText(login.password,"Hum@nhrm123");
	click(login.loginBtn);
	
	}
}
