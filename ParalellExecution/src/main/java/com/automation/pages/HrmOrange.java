package com.automation.pages;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.automation.commonactions.Commonactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HrmOrange {
	
	Commonactions actions = new Commonactions();
	
	By userName = By.name("username");
	By password = By.name("password");
	
	By signUpButton = By.xpath("//*[@type='submit']");
	
	By pim = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
	
	By pi = By.linkText("PI");
	
	By employeeName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input");
	
	By employeeID = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input");
	
	By status = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");
	
	By statusValue = By.xpath("//span[contains(.,'Freelance')]");
	
	By supervisor = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input");
			
    By reset = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]");
    
    By set = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/butto");
    
	public void enterUserName(WebDriver driver,String UserName) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(userName), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(userName));

		assertTrue(flag);

		actions.type(driver.findElement(userName), UserName);

	}
	
	public void enterPassword(WebDriver driver,String Password) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(password), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(password));

		assertTrue(flag);

		actions.type(driver.findElement(password), Password);

	}
	
	public void clickOnSignUpButton(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(signUpButton), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(signUpButton));

		assertTrue(flag);

		driver.findElement(signUpButton).click();


	}
	
	public void clickOnPIM(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(pim), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(pim));

		assertTrue(flag);

		driver.findElement(pim).click();


	}
	
	public void clickOnPI(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(pi), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(pi));

		assertTrue(flag);

		driver.findElement(pi).click();


	}
	
	public void enterEmployeeName(WebDriver driver,String empName) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(employeeName), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(employeeName));

		assertTrue(flag);

		actions.type(driver.findElement(employeeName), empName);

	}
	
	public void enterEmployeeID(WebDriver driver,String empID) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(employeeID), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(employeeID));

		assertTrue(flag);

		actions.type(driver.findElement(employeeID), empID);

	}
	
	public void selectEmployeeStatus(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(status), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(status));

		assertTrue(flag);

		actions.click(driver, driver.findElement(status));
		
		actions.dropDownValues(driver, driver.findElement(statusValue));

	}
	
	public void enterSupervisorName(WebDriver driver,String supervisorName) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(supervisor), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(supervisor));

		assertTrue(flag);

		actions.type(driver.findElement(supervisor), supervisorName);
		driver.findElement(supervisor).sendKeys(Keys.TAB);

	}
	

	public void clickOnResetButton(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(reset), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(reset));

		assertTrue(flag);

		driver.findElement(reset).click();


	}
	
	public void clickOnWrongResetButton(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(set), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(set));

		assertTrue(flag);

		driver.findElement(set).click();


	}
}
