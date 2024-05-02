package com.automation.scripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.automation.base.Base;
import com.automation.pages.SignUpPage;
import com.automation.utility.ExtentManager;
import com.aventstack.extentreports.Status;

public class SignUp extends Base {
	
	SignUpPage page = new SignUpPage();
	
//	@Test(dataProvider = "EmployeeData",priority=0)
	@Test
	public void verifySignUpPage() throws InterruptedException {
		
		
		ExtentManager.test.log(Status.INFO, "Click On Sign up button");
		page.clickOnSignUpButton(getDriver());
		ExtentManager.test.log(Status.PASS, "Click On Sign up button succeessful");
		
		ExtentManager.test.log(Status.INFO, "Enter text in agency text box");
		page.enterAgencyTextBox(getDriver());
		ExtentManager.test.log(Status.PASS, "Enter text in agency text box");
		
		ExtentManager.test.log(Status.INFO, "Enter text in address text box");
		page.enterAgencyAddressTextBox(getDriver(),"Magarpatta");
		ExtentManager.test.log(Status.PASS, "Enter text in address text box");
		
		ExtentManager.test.log(Status.INFO, "Enter text in zip code text box");
		page.enterCity(getDriver());
		ExtentManager.test.log(Status.INFO, "Enter text in zip code text box successful");
		
		ExtentManager.test.log(Status.INFO, "Select value from State drop down");
		page.selectStateDropDown(getDriver());
		ExtentManager.test.log(Status.PASS, "Select value from State drop down successful");
		
		ExtentManager.test.log(Status.INFO, "Enter text in zip code text box");
		page.enterPinCode(getDriver());
		ExtentManager.test.log(Status.INFO, "Enter text in zip code text box successful");
		
		ExtentManager.test.log(Status.INFO, "Select value from Deals type drop down");
		page.selectDealTypeDropDown(getDriver());
		ExtentManager.test.log(Status.INFO, "Select value from Deals type drop down successful");
		
		ExtentManager.test.log(Status.INFO, "Click On Next button");
		page.clickNextButton(getDriver());
		ExtentManager.test.log(Status.INFO, "Click On Next button successful");
		
		ExtentManager.test.log(Status.INFO, "Enter first name text box");
		page.enterFirstName(getDriver());
		ExtentManager.test.log(Status.INFO, "Enter first name in text box successful");
		
		ExtentManager.test.log(Status.INFO, "Enter  last name text box");
		page.enterLastName(getDriver());
		ExtentManager.test.log(Status.INFO, "Enter text last name in text box successful");
		
		ExtentManager.test.log(Status.INFO, "Enter email in text box");
		page.enterEmail(getDriver());
		ExtentManager.test.log(Status.INFO, "Enter email in text box successful");
		
		ExtentManager.test.log(Status.INFO, "Click On Submit button");
		page.clickSubmitButton(getDriver());
		ExtentManager.test.log(Status.INFO, "Click On Submit button successful");
		
		ExtentManager.test.log(Status.INFO, "Click On Close button");
		page.clickCloseButton(getDriver());
		ExtentManager.test.log(Status.INFO, "Click On Close button successful");
		
		
	}
	
	@AfterTest
	public void teardown() {
		getDriver().quit();
	}
	
}
