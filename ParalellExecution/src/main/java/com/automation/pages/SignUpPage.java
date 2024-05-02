package com.automation.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.commonactions.Commonactions;

public class SignUpPage {

	Commonactions actions = new Commonactions();

	By signUpButton = By.xpath("//div[@class='new_label text-center']/following-sibling::button");
	By agencyTextBox = By.xpath("//input[@id='organizationName']");
	By agencyAddressTextBox = By.xpath("//input[@id='organizationAddress1']");
	By zipcode = By.xpath("//input[@id='zip']");
	By city = By.xpath("//input[@id='city']");
	By next = By.xpath("//button[starts-with(text(),' NEXT ')]");
	By firstName = By.xpath("//input[@id='firstName']");
	By lastName = By.xpath("//input[@id='lastName']");
	By email = By.xpath("//input[@id='email']");
	By submit = By.xpath("//button[contains(text(),' SUBMIT ')]");
	By close = By.xpath(" //a[contains(text(),' CLOSE ')]");
	By state = By.xpath("//ng-select[@formcontrolname='state']//span[@class='ng-arrow-wrapper']");
	By stateDropDown = By.xpath("//span[contains(.,'AL')]");
	By dealType = By.xpath("//ng-select[@formcontrolname='transactionsType']");
	By dealTypeDropDown = By.xpath(
			"//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-multiple ng-star-inserted ng-select-bottom']//input[@id='item-0']");

	public void clickOnSignUpButton(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(signUpButton), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(signUpButton));

		assertTrue(flag);

		driver.findElement(signUpButton).click();


	}

	public void enterAgencyTextBox(WebDriver driver) {

		actions.explicitWait(driver, driver.findElement(agencyTextBox), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(agencyTextBox));

		assertTrue(flag);

		actions.type(driver.findElement(agencyTextBox), "Yash Technologies");

	}

	public void enterAgencyAddressTextBox(WebDriver driver, String address) {

		actions.explicitWait(driver, driver.findElement(agencyAddressTextBox), 60);
		boolean flag = actions.isDisplayed(driver, driver.findElement(agencyAddressTextBox));

		assertTrue(flag);

		actions.type(driver.findElement(agencyAddressTextBox), "Yash Magarpatta");
	}

	public void selectStateDropDown(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(state), 60);
		
		boolean flag = actions.isDisplayed(driver, driver.findElement(state));

		assertTrue(flag);

		actions.click(driver, driver.findElement(state));

		actions.dropDownValues(driver, driver.findElement(stateDropDown));

	}

	public void enterPinCode(WebDriver driver) throws InterruptedException {
		
		actions.explicitWait(driver, driver.findElement(zipcode), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(zipcode));

		assertTrue(flag);
		
		actions.type(driver.findElement(zipcode), "50001");
	}

	public void selectDealTypeDropDown(WebDriver driver) throws InterruptedException {

		Actions actionObj = new Actions(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,200)", "");
		
		actions.explicitWait(driver, driver.findElement(dealType), 60);
		
		boolean flag = actions.isDisplayed(driver, driver.findElement(dealType));

		assertTrue(flag);
		

		actions.click(driver, driver.findElement(dealType));

		actions.dropDownValues(driver, driver.findElement(dealTypeDropDown));

		actions.escapeKeyWord(driver, driver.findElement(dealTypeDropDown));

	}

	public void enterCity(WebDriver driver) throws InterruptedException {
		
		actions.explicitWait(driver, driver.findElement(city), 60);
		
		boolean flag = actions.isDisplayed(driver, driver.findElement(city));

		assertTrue(flag);
		actions.type(driver.findElement(city), "Pune");
	}

	public void clickNextButton(WebDriver driver) throws InterruptedException {
		
		actions.explicitWait(driver, driver.findElement(next), 60);
		
		boolean flag = actions.isDisplayed(driver, driver.findElement(next));

		assertTrue(flag);
		actions.click(driver, driver.findElement(next));
		Thread.sleep(1000);
	}

	public void enterFirstName(WebDriver driver) throws InterruptedException {
		
		actions.explicitWait(driver, driver.findElement(firstName), 60);
		
		boolean flag = actions.isDisplayed(driver, driver.findElement(firstName));

		assertTrue(flag);
		actions.type(driver.findElement(firstName), "Vinayaka");
	}

	public void enterLastName(WebDriver driver) throws InterruptedException {
		actions.explicitWait(driver, driver.findElement(lastName), 60);
		
		boolean flag = actions.isDisplayed(driver, driver.findElement(lastName));

		assertTrue(flag);
		actions.type(driver.findElement(lastName), "Ganesh");
	}

	public void enterEmail(WebDriver driver) throws InterruptedException {
		
		actions.explicitWait(driver, driver.findElement(email), 60);
		boolean flag = actions.isDisplayed(driver, driver.findElement(email));

		assertTrue(flag);
		actions.type(driver.findElement(email), "ganesh@1234");
	}

	public void clickSubmitButton(WebDriver driver) throws InterruptedException {
		actions.explicitWait(driver, driver.findElement(submit), 60);
		boolean flag = actions.isDisplayed(driver, driver.findElement(submit));

		assertTrue(flag);
		actions.click(driver, driver.findElement(submit));
		
	}

	public void clickCloseButton(WebDriver driver) throws InterruptedException {
		
		actions.explicitWait(driver, driver.findElement(close), 60);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		boolean flag = actions.isDisplayed(driver, driver.findElement(close));

		assertTrue(flag);

		js.executeScript("window.scrollBy(0,200)", "");
		actions.click(driver, driver.findElement(close));
	}
}
