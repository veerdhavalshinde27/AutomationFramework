package com.automation.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.automation.base.Base;
import com.automation.utility.ExtentManager;
import com.aventstack.extentreports.Status;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class PurchaseTest extends Base {

	@Test
	public void addition() {

		// WebDriver driver;
		NgWebDriver ngDriver;
		JavascriptExecutor executor;

//Angular Locators		
		By userName = By.xpath("//input[@id='inputUserName']");
		By password = By.xpath("//input[@id='inputPassword']");
	//	By signInButton = By.xpath("//button[contains(.,' SIGN IN')]");
		ByAngularButtonText signInButton = ByAngular.buttonText("SIGN IN");
		ByAngularButtonText button = ByAngular.buttonText("CREATE NEW");
		
		By address = By.xpath("//input[@id='address']");
		By dealNumber = By.xpath("//input[@id='fileNumber']");
		By sales = By.xpath("//div[@formcontrolname='transactionType']");

		executor = (JavascriptExecutor) getDriver();
		ngDriver = new NgWebDriver(executor);

		// driver.get("https://juliemr.github.io/protractor-demo/");

		ngDriver.waitForAngularRequestsToFinish();

		ExtentManager.test.log(Status.INFO, "Enter userName in text field");
		getDriver().findElement(userName).sendKeys("test@test.com");
		ExtentManager.test.log(Status.PASS, "Enter userName in text field successful");

		ExtentManager.test.log(Status.INFO, "Enter password in text field");
		getDriver().findElement(password).sendKeys("test");
		ExtentManager.test.log(Status.PASS, "Enter password in text field successful");
		
		ExtentManager.test.log(Status.INFO, "Click signInButton");
		getDriver().findElement(signInButton).click();
		ExtentManager.test.log(Status.PASS, "Click signInButton successful");
		
		ExtentManager.test.log(Status.INFO, "Enter Address in text field");
		getDriver().findElement(address).sendKeys("test");
		ExtentManager.test.log(Status.PASS, "Enter Address in text field successful");
		
		ExtentManager.test.log(Status.INFO, "Enter Dealer number in text field");
		getDriver().findElement(dealNumber).sendKeys("test");
		ExtentManager.test.log(Status.PASS, "Enter Dealer number in text field successful");
		
		ExtentManager.test.log(Status.INFO, "Click Sales Button");
		ngDriver.waitForAngularRequestsToFinish();
		getDriver().findElement(sales).click();
		ExtentManager.test.log(Status.PASS, "Click Sales  successful");
		
		ExtentManager.test.log(Status.INFO, "Click Create New Button");
		ngDriver.waitForAngularRequestsToFinish();
		getDriver().findElement(button).click();
		ExtentManager.test.log(Status.PASS, "Click Create New Button  successful");

	}
}
