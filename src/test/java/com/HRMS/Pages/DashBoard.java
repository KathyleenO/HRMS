package com.HRMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRMS.TestBase.BaseClass;
import com.HRMS.Utils.CommonMethods;

public class DashBoard extends CommonMethods {

	
	@FindBy(linkText="Leave")
	public WebElement leaveLnk;
	
	@FindBy(linkText="Leave List")
	public WebElement leaveList;
	
	@FindBy(linkText="PIM")
	public WebElement PIMbtn;
	
	@FindBy(linkText="Add Employee")
	public WebElement addEmployeeBtn;
	
	
	public DashBoard() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateToLeaveList() {
		click(leaveLnk);
		click(leaveList);
		
	}
	
	public void  addEmployee() {
		click(PIMbtn);
		click(addEmployeeBtn);
		
		
	}
}
