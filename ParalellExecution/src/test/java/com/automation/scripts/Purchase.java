package com.automation.scripts;

import java.awt.AWTException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.automation.base.Base;
import com.automation.pages.PurchasePage;
import com.automation.utility.ExtentManager;
import com.aventstack.extentreports.Status;

public class Purchase extends Base {
	
	PurchasePage page = new PurchasePage();
	
	@Test
	public void verifyPurchasePage() throws InterruptedException, AWTException {
		
		
		ExtentManager.test.log(Status.INFO, "Enter user name in text field");
		page.enterUserName(getDriver());
		ExtentManager.test.log(Status.PASS, "Enter user name in text field successful");
		
		ExtentManager.test.log(Status.INFO, "Enter password user name in text field");
		page.enterPassword(getDriver());
		ExtentManager.test.log(Status.PASS, "Enter password in text field successful");
		
		ExtentManager.test.log(Status.INFO, "Click on sign in button");
		page.clickSignInButton(getDriver());
		ExtentManager.test.log(Status.PASS, "Click on sign in button is successful");
		
		ExtentManager.test.log(Status.INFO, "Enter address in text field");
		page.enterAddress(getDriver());
		ExtentManager.test.log(Status.PASS, "Enter address in text field successful");
		
		ExtentManager.test.log(Status.INFO, "Enter deal number in text field");
		page.enterDealNumber(getDriver());
		ExtentManager.test.log(Status.PASS, "Enter deal number in text field successful");
				
		ExtentManager.test.log(Status.INFO, "Click on sales button");
		page.clickSalesButton(getDriver());
		ExtentManager.test.log(Status.PASS, "Click on sales button is successful");
				
		ExtentManager.test.log(Status.INFO, "Click on create new button");
		page.clickCreateNewButton(getDriver());
		ExtentManager.test.log(Status.PASS, "Click on create new is successful");
		
		ExtentManager.test.log(Status.INFO, "Click on create new file button");
		page.clickCreateNewFile(getDriver());
		ExtentManager.test.log(Status.PASS, "Click on create new file is successful");
		
		ExtentManager.test.log(Status.INFO, "Click on booking date button");
		//page.clickBookingDate(getDriver());
		page.propertyType(getDriver());
		ExtentManager.test.log(Status.PASS, "Click on booking date is successful");
		
		ExtentManager.test.log(Status.INFO, "Click on Cash finance radio button successful");
		page.clickOnRadioButton(getDriver());
		ExtentManager.test.log(Status.PASS, "Click on Cash finance radio button is successful");
		
		ExtentManager.test.log(Status.INFO, "Enter loan amount in text field");
		page.enterLoanAmount(getDriver());
		page.calendar(getDriver());
		Thread.sleep(10000);
		ExtentManager.test.log(Status.PASS, "Enter loan amount in text field successful");
		
		ExtentManager.test.log(Status.INFO, "Click on map link");
		//page.clickBookingDate(getDriver());
	//	page.uploadFile(getDriver());
		page.clickMapLink(getDriver());
		ExtentManager.test.log(Status.PASS, "Click on map link is successful");
		
		ExtentManager.test.log(Status.INFO, "Verify new window is open");
		page.newWindowValidations(getDriver());
		ExtentManager.test.log(Status.PASS, "Verify new window is open successful");
	}
	
	@AfterSuite
	public void teardown() {
		getDriver().quit();
	}

}
