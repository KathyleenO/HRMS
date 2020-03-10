package com.HRMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRMS.TestBase.BaseClass;
import com.HRMS.Utils.CommonMethods;

public class DashBoardPageElements extends CommonMethods {

	
	@FindBy(linkText="Leave")
	public WebElement leaveLnk;
	
	@FindBy(linkText="Leave List")
	public WebElement leaveList;
	
	@FindBy(linkText="PIM")
	public WebElement PIMbtn;
	
	@FindBy(linkText="Add Employee")
	public WebElement addEmployeeBtn;
	
	
	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateToLeaveList() {
		jsCLick(leaveLnk);
		jsCLick(leaveList);
		
	}
	
	public void  addEmployee() {
		jsCLick(PIMbtn);
		jsCLick(addEmployeeBtn);
		
		
	}
}
