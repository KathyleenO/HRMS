package com.HRMS.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.HRMS.Pages.LoginPage;
import com.HRMS.Pages.LoginPageElementsWithFindBY;
import com.HRMS.Utils.CommonMethods;
/*naviagte to HRMS
 * enter user 
 * leave password blank
 * cick login
 * verify "password cannot be empty text is there
 * close browser
 */
public class EmptyMessageError extends CommonMethods {

	@Test
	public void Login() {
		LoginPage msg = new LoginPage();
		sendText(msg.username, "admin");
		click(msg.loginBtn);
	}
	
	/*naviagte to HRMS
	 * enter user 
	 * leave password blank
	 * cick login
	 * verify "password cannot be empty text is there
	 * close browser
	 * Using Find Element 
	 * 
	 */
	

		
		@Test
		public void negativeLogin() throws InterruptedException {
			LoginPageElementsWithFindBY login =new LoginPageElementsWithFindBY();
			sendText(login.username, "Admin");
			click(login.loginBtn);
			String expectedError="Password cannot be empty";
			Assert.assertEquals(login.errMsg.getText(), expectedError, "Error message text is not matched");
			Thread.sleep(5000);

	}

}
