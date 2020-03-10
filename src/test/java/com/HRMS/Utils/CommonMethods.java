package com.HRMS.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.HRMS.TestBase.BaseClass;


//Command o==> for Mac to see all methods 
public class CommonMethods extends BaseClass {

	

	/**
	 * This method will accept the alert
	 * 
	 * @throws will throw an NoAlertPresentException if alert is NOt present
	 * 
	 */
	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}

	}

	/**
	 * This method will dismiss the alert
	 * 
	 * @throws will throw an NoAlertPresentException if alert is NOt present
	 * 
	 */
	public static void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("");
		}
	}

	/**
	 * This method will get a text from the alert
	 * 
	 * @return text of the alert
	 * @throws will throw an NoAlertPresentException if alert is NOt present
	 */

	public static String getAlertText() {
		String text = null;
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();

		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
		return text;
	}

	/**
	 * This method will switch to frame with Name or ID
	 * 
	 * @param nameORId
	 */
	public static void switchToFrame(String nameORId) {

		try {
			driver.switchTo().frame(nameORId);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}

	/**
	 * This method will switch to frame with WebElement
	 * 
	 * @param element
	 */
	public static void switchToFrame(WebElement element) {

		try {
			driver.switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}

	/**
	 * This method will switch to frame by Index
	 * 
	 * @param index
	 */
	public static void switchToFrame(Integer index) {

		try {
			driver.switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}

	}

	/**
	 * This method will click on the element using JavaScriptExecutor
	 * 
	 * @param element
	 */
	public static void jsCLick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	/**
	 * This method will scroll until specified element
	 * 
	 * @param element
	 */
	public static void scrollIntoElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	/**
	 * This method will scroll page down
	 * 
	 * @param pixel
	 */
	public static void scrollDown(int pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + pixel + ")");
	}

	/**
	 * This method will scroll page up
	 * 
	 * @param pixel
	 */
	public static void scrollUp(int pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-" + pixel + ")");
	}
	
	/**
	 * This method will take a screenshot
	 * @param fileName
	 */
	public static String takesScreenshot(String fileName) {
//		Date date=new Date();
//		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy/hh:mm:ss");
//		String timeStamp=sdf.format(date.getTime());
//		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File file=ts.getScreenshotAs(OutputType.FILE);
//		String screenshotFile=Constants.SCREENSHOTS_FILEPATH+fileName+timeStamp+".png";
//		try {
//			FileUtils.copyFile(file, new File(screenshotFile));
//		}catch(IOException e) {
//			System.out.println("Cannot Take ScreenShot");
//		}
//		
//		return screenshotFile;
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy_MMdd_HHmmss");
		String timeStamp=sdf.format(date.getTime());
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		String scrshotFile=Constants.SCREENSHOTS_FILEPATH+fileName+timeStamp+".png";
		
		try {
			FileUtils.copyFile(file, new File(scrshotFile));
		} catch (IOException e) {
			System.out.println("Cannot take a screenshot");
		}
		
		return scrshotFile;
		
	}
	/**
	 * This method will enter text
	 * 
	 * @param element
	 * @param value
	 */
	public static void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
		
		
	}
	
	
	


	/**
	 * This method will create an Object of WebDriverWait
	 * 
	 * @return WebDriverWait
	 */
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_LOAD_TIME);
		return wait;
	}

	/**
	 * This method will wait until element becomes clickable
	 * 
	 * @param element
	 */
	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method will wait until element becomes visible
	 * 
	 * @param element
	 */
	public static void waitForVisibility(WebElement element) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will wait until element becomes invisible
	 * 
	 * @param element
	 */
	public static void waitForInvisibility(WebElement element) {
		getWaitObject().until(ExpectedConditions.invisibilityOf(element));
	}
	/**
	 * 
	 */
	
	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

}
