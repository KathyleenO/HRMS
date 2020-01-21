package com.HRMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRMS.TestBase.BaseClass;

public class PIMOptionsElements {

	
	
	@FindBy(linkText="Add Employee")
	public WebElement addEmployeeBtn;
	
	
	public PIMOptionsElements(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
