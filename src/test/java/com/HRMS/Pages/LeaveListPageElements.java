package com.HRMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRMS.TestBase.BaseClass;

public class LeaveListPageElements {

	
	@FindBy(css="a.toggle.tiptip")
	public WebElement leaveListLabel;
	
	
	public LeaveListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
