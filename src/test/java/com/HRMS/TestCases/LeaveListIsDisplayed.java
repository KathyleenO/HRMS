package com.HRMS.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.HRMS.Pages.DashBoard;
import com.HRMS.Pages.LeaveListPageElements;
import com.HRMS.Pages.LoginPageElementsWithFindBY;
import com.HRMS.Utils.CommonMethods;

public class LeaveListIsDisplayed extends CommonMethods   {

	@Test(groups="regression")
	public void LeaveLabelValidation() {
	LoginPageElementsWithFindBY login=new LoginPageElementsWithFindBY();
	DashBoard dashboard=new DashBoard();
	LeaveListPageElements leavelist=new LeaveListPageElements();
	
		sendText(login.username,"admin");
		sendText(login.password, "Hum@nhrm123");
		click(login.loginBtn);
		jsCLick(dashboard.leaveLnk);
		jsCLick(dashboard.leaveList);
		Assert.assertTrue(leavelist.leaveListLabel.isDisplayed(), "Label is NOT Displayes");
		
	}
	@Test(groups="regression")
	public void Leavelabelvalidation2() {
		LoginPageElementsWithFindBY login=new LoginPageElementsWithFindBY ();
		login.login("admin", "Hum@nhrm123");
		DashBoard dash=new DashBoard();
		dash.navigateToLeaveList();
		LeaveListPageElements leave=new LeaveListPageElements();
		Assert.assertTrue(leave.leaveListLabel.isDisplayed(), "Label is NOT Displayed");
		
		
		
	}
	
	
	
}
