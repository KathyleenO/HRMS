package com.HRMS.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.HRMS.Pages.AddEmployeeElements;
import com.HRMS.Pages.DashBoardPageElements;
import com.HRMS.Pages.LoginPageElementsWithFindBY;
import com.HRMS.Pages.PIMOptionsElements;
import com.HRMS.Utils.CommonMethods;

public class ClassTask extends CommonMethods{
/*
 * Sprint 5
US 16767: As an admin I should be able to add an employee 

TC: Add Employee
Step 1. navigate to the application
Step 2: login into the application
Step 3: navigate to add employee page
Step 4: add employee by providing fname. mname, lname
Step 5: verify employee has been added successfully
 */
	
	@Test
	public void AddEmployee() {
		LoginPageElementsWithFindBY login = new LoginPageElementsWithFindBY();
		sendText(login.username,"admin");
		sendText(login.password,"Hum@nhrm123");
		click(login.loginBtn);
		DashBoardPageElements use=new DashBoardPageElements();
		click(use.PIMbtn);
		PIMOptionsElements add=new PIMOptionsElements();
		click(add.addEmployeeBtn);
		
		AddEmployeeElements addEmp=new AddEmployeeElements();
		sendText(addEmp.firstName, "Mario");
		sendText(addEmp.middleName, "Nando");
		sendText(addEmp.lastName, "Smith");
		click(addEmp.saveBtn);
		
		
		
		
		
	}
	
	
}
