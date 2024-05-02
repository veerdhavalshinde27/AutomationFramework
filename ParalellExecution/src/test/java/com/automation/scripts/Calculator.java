package com.automation.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.automation.base.Base;
import com.automation.utility.ExtentManager;
import com.aventstack.extentreports.Status;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularBinding;
import com.paulhammant.ngwebdriver.ByAngularButtonText;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.NgWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator extends Base{

	@Test
	public void addition() {

	//	WebDriver driver;
		NgWebDriver ngDriver;
		JavascriptExecutor executor;

//Angular Locators		
		ByAngularModel first = ByAngular.model("first");
		ByAngularModel second = ByAngular.model("second");
		ByAngularModel operator = ByAngular.model("operator");
		ByAngularButtonText button = ByAngular.buttonText("Go!");
		

		By result = By.tagName("h2");
		
		// WebDriverManager.chromedriver().setup();

//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir") + "/src/test/resources/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
		executor = (JavascriptExecutor) getDriver();
		ngDriver = new NgWebDriver(executor);

		//driver.get("https://juliemr.github.io/protractor-demo/");

		ngDriver.waitForAngularRequestsToFinish();

		ExtentManager.test.log(Status.INFO, "Enter number in text field");
		getDriver().findElement(first).sendKeys("20");
		ExtentManager.test.log(Status.PASS, "Enter number in text field successful");
		
		ExtentManager.test.log(Status.INFO, "Enter number in text field");
		getDriver().findElement(second).sendKeys("30");
		ExtentManager.test.log(Status.PASS, "Enter number in text field successful");
		
		ExtentManager.test.log(Status.INFO, "Select operator from drop down");
		getDriver().findElement(operator).sendKeys("*");
		ExtentManager.test.log(Status.PASS, "Select operator from drop down successful");
		
		ExtentManager.test.log(Status.INFO, "Click on Go! button");
		getDriver().findElement(button).click();
		ExtentManager.test.log(Status.PASS, "Click on Go! button successful");
		
		ngDriver.waitForAngularRequestsToFinish();
		
		ExtentManager.test.log(Status.INFO, "Get text value from binding");
		getDriver().findElement(result).getText();
		ExtentManager.test.log(Status.PASS, "et text value from binding successful");
		
		String str = getDriver().findElement(result).getText();
		
		Assert.assertEquals(600, Integer.parseInt(str));
		System.out.println(str);

		ExtentManager.test.log(Status.INFO, "Enter number in text field");
		getDriver().findElement(first).sendKeys("40");
		ExtentManager.test.log(Status.PASS, "Enter number in text field successful");
		
		ExtentManager.test.log(Status.INFO, "Enter number in text field");
		getDriver().findElement(second).sendKeys("50");
		ExtentManager.test.log(Status.PASS, "Enter number in text field successful");
		
		ExtentManager.test.log(Status.INFO, "Select operator from drop down");
		getDriver().findElement(operator).sendKeys("*");
		ExtentManager.test.log(Status.PASS, "Select operator from drop down successful");
		
		ExtentManager.test.log(Status.INFO, "Click on Go! button");
		getDriver().findElement(button).click();
		ExtentManager.test.log(Status.PASS, "Click on Go! button successful");
		
		ngDriver.waitForAngularRequestsToFinish();
		
		ExtentManager.test.log(Status.INFO, "Get text value from binding");
		getDriver().findElement(result).getText();
		ExtentManager.test.log(Status.PASS, "et text value from binding successful");
		
		String str1 = getDriver().findElement(result).getText();
		
		Assert.assertEquals(2000, Integer.parseInt(str1));
		
	}
	
	@AfterTest
	public void close() {
		System.out.println("Base class after test....");
		getDriver().close();
	}

}
