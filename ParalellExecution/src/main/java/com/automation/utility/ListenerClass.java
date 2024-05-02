/**
 * @author gaurav.wani
 *
 */
package com.automation.utility;

import java.io.IOException;
import com.aventstack.extentreports.ExtentTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automation.commonactions.Commonactions;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ListenerClass extends ExtentManager implements ITestListener {

	Commonactions action = new Commonactions();
//	Base base = new Base();


	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart============");
		test = extent.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			System.out.println("onTestSuccess============");
			test.log(Status.PASS, "Passed Test Case is: " + result.getName());
			try {
				test.log(Status.PASS,
						MarkupHelper.createLabel(result.getName() + " - Test Case Passed Report", ExtentColor.GREEN));
				test.log(Status.PASS,
						MarkupHelper.createLabel(result.getName()  + " - Test Case Passed", ExtentColor.GREEN));
				String imgPath = action.screenShot(getDriver(), result.getName());

				test.pass("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());

			} catch (IOException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("onTestFailure============");
			try {
				test.log(Status.FAIL,
						MarkupHelper.createLabel(result.getName() + " - Test Case Failed Report", ExtentColor.RED));
				test.log(Status.FAIL,
						MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
				String imgPath = action.screenShot(getDriver(), result.getName());

				test.fail("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());

			} catch (IOException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void onTestSkipped(ITestResult result) {
		if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Skipped Test Case is: " + result.getName());
		}
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}
}
