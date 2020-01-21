package com.HRMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRMS.TestBase.BaseClass;

public class AddEmployeeElements {

	@FindBy(linkText="PIM")
	public WebElement PIMbtn;
	
	
	@FindBy(linkText="Add Employee")
	public WebElement addEmployeeBtn;
	
	@FindBy(css="input#firstName")
	public WebElement  firstName;
	
	@FindBy(css="input#middleName")
	public WebElement  middleName;
	
	@FindBy(css="input#lastName")
	public WebElement  lastName;
	
	@FindBy(css="input#btnSave")
	public WebElement  saveBtn;
	
	//VERIFY NAME WAS ADDED
	
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement nameVerify;
	
	
	public AddEmployeeElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

	
}
