package com.HRMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRMS.TestBase.BaseClass;
import com.HRMS.Utils.CommonMethods;

public class LoginPageElementsWithFindBY extends CommonMethods {

	
	@FindBy(xpath="//div[@id='divLogo']")
	public WebElement logo;
	
	@FindBy(id="logInPanelHeading")
	public WebElement loginLabel;
	
	@FindBy(name="txtUsername")
	public WebElement username;
	
	@FindBy(css="input#txtPassword")
	public WebElement password;
	
	
	@FindBy(css="input[name='Submit']")
	public WebElement loginBtn;
	
	@FindBy(id="spanMessage")
	public WebElement errMsg;
	
	
	public LoginPageElementsWithFindBY() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void login(String uid, String pwd) {
		sendText(username, uid);
		sendText(password, pwd);
		click(loginBtn);
	}
	
	
	
	
	
}
