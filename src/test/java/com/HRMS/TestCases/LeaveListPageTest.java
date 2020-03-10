package com.HRMS.TestCases;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.HRMS.Pages.DashBoardPageElements;
import com.HRMS.Pages.LeaveListPageElements;
import com.HRMS.Pages.LoginPageElementsWithFindBY;
import com.HRMS.Utils.CommonMethods;
import com.HRMS.Utils.ConfigsReader.ConfigsReader;


public class LeaveListPageTest extends CommonMethods {

	@Test(groups = "regression")
	public void leaveLabelvalidation3() {
		LoginPageElementsWithFindBY login = new LoginPageElementsWithFindBY();
		DashBoardPageElements dashboard = new DashBoardPageElements();
		LeaveListPageElements leaveList = new LeaveListPageElements();

		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		jsCLick(dashboard.leaveLnk);
		jsCLick(dashboard.leaveList);
		Assert.assertTrue(leaveList.leaveListLabel.isDisplayed(), "Label is NOT displayed");
	}

	@Test(groups = "regression")
	public void leaveLabelvalidation4() {
		LoginPageElementsWithFindBY login = new LoginPageElementsWithFindBY();
		DashBoardPageElements dashboard = new DashBoardPageElements();
		LeaveListPageElements leaveList = new LeaveListPageElements();

		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.navigateToLeaveList();
		Assert.assertTrue(leaveList.leaveListLabel.isDisplayed(), "Label is NOT displayed");
	}
}