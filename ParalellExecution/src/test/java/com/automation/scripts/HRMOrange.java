package com.automation.scripts;

import java.awt.AWTException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.base.Base;
import com.automation.pages.HrmOrange;
import com.automation.utility.DataProvide;
import com.automation.utility.ExtentManager;
import com.aventstack.extentreports.Status;

public class HRMOrange extends Base {

	HrmOrange page = new HrmOrange();
	DataProvide data = new DataProvide();

	@DataProvider(name = "EmployeeData")
	public String[][] readExcel() {

		String[][] values = data.getExcelData(
				"D:\\Backup_Navin\\Client\\Client\\ParalellExecution\\src\\test\\resources\\TestData\\TestData.xls",
				"Employee-Details");

		return values;
	}

	@Test(dataProvider = "EmployeeData", priority = -1)
	public void verifyLoginPage(String UserName, String Password, String name, String id, String supervisor)
			throws InterruptedException, AWTException {
		ExtentManager.test.log(Status.INFO, "Enter user name in text field");
		page.enterUserName(getDriver(), UserName);
		ExtentManager.test.log(Status.PASS, "Enter user name in text field successful");

		ExtentManager.test.log(Status.INFO, "Enter password user name in text field");
		page.enterPassword(getDriver(), Password);
		ExtentManager.test.log(Status.PASS, "Enter password in text field successful");

		ExtentManager.test.log(Status.INFO, "Click on sign in button");
		page.clickOnSignUpButton(getDriver());
		ExtentManager.test.log(Status.PASS, "Click on sign in button is successful");

		ExtentManager.test.log(Status.INFO, "Click on PIM in button");
		page.clickOnPIM(getDriver());
		ExtentManager.test.log(Status.PASS, "Click on PIM button is successful");

		ExtentManager.test.log(Status.INFO, "Enter employee name");
		page.enterEmployeeName(getDriver(), name);
		ExtentManager.test.log(Status.PASS, "Enter employee name is successful");

		ExtentManager.test.log(Status.INFO, "Enter employee id");
		page.enterEmployeeID(getDriver(), id);
		ExtentManager.test.log(Status.PASS, "Enter employee id is successful");

		ExtentManager.test.log(Status.INFO, "Select employee status");
		page.selectEmployeeStatus(getDriver());
		ExtentManager.test.log(Status.PASS, "Select employee status is successful");

		ExtentManager.test.log(Status.INFO, "Enter supervisor name");
		page.enterSupervisorName(getDriver(), supervisor);
		ExtentManager.test.log(Status.PASS, "Enter supervisor name is successful");

		ExtentManager.test.log(Status.INFO, "Click on reset button");
		page.clickOnWrongResetButton(getDriver());
		ExtentManager.test.log(Status.PASS, "Click on reset button is successful");

		
	}
	
	@AfterTest
	public void close() {
		System.out.println("Base class after test....");
		getDriver().close();
	}

}
