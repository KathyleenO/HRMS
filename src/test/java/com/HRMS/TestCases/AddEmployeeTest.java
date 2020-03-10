package com.HRMS.TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.HRMS.Pages.AddEmployeeElements;
import com.HRMS.Pages.DashBoardPageElements;
import com.HRMS.Pages.LoginPageElementsWithFindBY;
import com.HRMS.TestBase.BaseClass;
import com.HRMS.Utils.CommonMethods;
import com.HRMS.Utils.Constants;
import com.HRMS.Utils.ExcelUtility;

public class AddEmployeeTest extends CommonMethods {

	@Test(dataProvider = "getData", groups = "regression")

	public void addeEmployee(String name, String middlename, String LastName) throws InterruptedException {

		LoginPageElementsWithFindBY login = new LoginPageElementsWithFindBY();
		test.info("Login in into HRMS");
		BaseClass.setUp();
		sendText(login.username, "admin");
		sendText(login.password, "Syntax@123");

		test.info("Navigating to the add Employee Page");
		DashBoardPageElements btn = new DashBoardPageElements();
		btn.PIMbtn.click();
		btn.addEmployeeBtn.click();
        
		test.info("adding the employee");
		AddEmployeeElements add = new AddEmployeeElements();
		sendText(add.firstName, "Tico");
		sendText(add.middleName, "Iris");
		sendText(add.lastName, "Boba");
		
		Thread.sleep(1000);
		click(add.saveBtn);
		
		test.info("Verify employee was added");
		
		String names=add.nameVerify.getAttribute("value");
System.out.println(names);
	}

	@DataProvider

	public Object[][] getData() {
		return ExcelUtility.excelIntoArray(Constants.XL_DATA_FILEPATH, "AddEmployee");
	}
}
