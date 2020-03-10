package com.HRMS.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.HRMS.Pages.DashBoardPageElements;
import com.HRMS.Pages.LeaveListPageElements;
import com.HRMS.Pages.LoginPageElementsWithFindBY;
import com.HRMS.Utils.CommonMethods;

public class LeaveListIsDisplayed extends CommonMethods   {

	//@Test(groups="regression")
	public void LeaveLabelValidation1() {
	LoginPageElementsWithFindBY login=new LoginPageElementsWithFindBY();
	DashBoardPageElements dashboard=new DashBoardPageElements();
	LeaveListPageElements leavelist=new LeaveListPageElements();
	
		sendText(login.username,"admin");
		sendText(login.password, "Syntax@123");
		click(login.loginBtn);
		jsCLick(dashboard.leaveLnk);
		jsCLick(dashboard.leaveList);
		Assert.assertTrue(leavelist.leaveListLabel.isDisplayed(), "Label is NOT Displayes");
		
	}
	//@Test(groups="regression")
	public void Leavelabelvalidation2() {
		LoginPageElementsWithFindBY login=new LoginPageElementsWithFindBY ();
		login.login("admin", "Syntax@123");
		DashBoardPageElements dash=new DashBoardPageElements();
		dash.navigateToLeaveList();
		LeaveListPageElements leave=new LeaveListPageElements();
		Assert.assertTrue(leave.leaveListLabel.isDisplayed(), "Label is NOT Displayed");
		
		
		
	}
	
	
	
}
