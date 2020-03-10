package com.HRMS.TestBase;




import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.HRMS.Utils.CommonMethods;


public class Listener extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test started " + result.getName());
		test=report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed " + result.getName());
		test.pass("Test passed"+ result.getName());
		String imagePath=CommonMethods.takesScreenshot("passed/" + result.getName());
		try {
		test.addScreenCaptureFromPath(imagePath);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed " + result.getName());
		test.fail("Test Failed" +result.getName());
		String imagePath=CommonMethods.takesScreenshot("failed/" + result.getName());
		try {
			test.addScreenCaptureFromPath(imagePath);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
