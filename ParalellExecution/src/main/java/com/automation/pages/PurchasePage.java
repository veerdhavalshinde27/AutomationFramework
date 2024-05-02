package com.automation.pages;

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

/**
 * @author navin.kotamraju
 *
 */
public class PurchasePage {
	Commonactions actions = new Commonactions();

	By userName = By.xpath("//input[@id='inputUserName']");
	By password = By.xpath("//input[@id='inputPassword']");
	By signInButton = By.xpath("//button[contains(.,' SIGN IN')]");
	By address = By.xpath("//input[@id='address']");
	By dealNumber = By.xpath("//input[@id='fileNumber']");
	By sales = By.xpath("//div[@formcontrolname='transactionType']");
	By createNew = By.xpath("//button[contains(text(),'CREATE NEW')]");
	By bookingDate = By.xpath("//input[@id='closingDate']");
	By propertyType = By.xpath("//ng-select[@formcontrolname='disclosureType']//span[@class='ng-arrow-wrapper']");
	By propertyTypeValue = By.xpath("//span[contains(.,'Resendential Plot')]");
	By map = By.xpath("//div[@class='sidenav']/a[@class='menu-item']/span[contains(text(),'Map')]");
	By checkBox = By.xpath("//*[contains(text(),'Option 1')]");
	By secondCheckBox = By.xpath("//*[contains(text(),'Option 2')]");
	By disabledCheckBox = By.xpath("//*[contains(text(),'Option 3')]");
	By attributCheckBox = By.xpath("//div[@class='checkbox disabled']/label/input");
	By iframeLink = By.xpath("//div[@class='google-maps-link']/a");

	By cashFinanceRadioButton = By.xpath("//label[contains(text(),'Cash + Finance')]");
	By loanAmountTextBox = By.xpath("//input[@id='loanAmount']");

	By createNewFile = By.xpath("//button[contains(text(),' Create New File ')]");
	By enterAddress = By.xpath("//input[@id='address']");
	By enterDealNumber = By.xpath("//input[@placeholder='Enter Deal Number']");

	By submit = By.xpath("//input[@type='submit']");
	By download = By.xpath("//button[contains(text(),'Download')]");

	By preview = By.xpath("//button[contains(text(),' Preview')]");
	
	By row = By.xpath("//div[@class='row']//table//tr/th[@class='table-secondary']");
	
	By column = By.xpath("//div[@class='row']//table//tr/th[@class='table-secondary']/following-sibling::td");

	public void enterUserName(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(userName), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(userName));

		assertTrue(flag);

		actions.type(driver.findElement(userName), "test@test.com");

	}

	public void enterPassword(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(password), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(password));

		assertTrue(flag);

		actions.type(driver.findElement(password), "test");

	}

	public void clickSignInButton(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(signInButton), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(signInButton));

		assertTrue(flag);

		actions.click(driver, driver.findElement(signInButton));

	}

	public void enterAddress(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(address), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(address));

		assertTrue(flag);

		actions.type(driver.findElement(address), "Karadi");

	}

	public void enterDealNumber(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(dealNumber), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(dealNumber));

		assertTrue(flag);

		actions.type(driver.findElement(dealNumber), "Amanora");

	}

	public void clickSalesButton(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(sales), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(sales));

		assertTrue(flag);

		actions.click(driver, driver.findElement(sales));

	}

	public void clickCreateNewButton(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(createNew), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(createNew));

		assertTrue(flag);

		actions.click(driver, driver.findElement(createNew));

	}

	public void clickBookingDate(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(bookingDate), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(bookingDate));

		assertTrue(flag);

		actions.click(driver, driver.findElement(bookingDate));

		Thread.sleep(3000);

	}

	public void propertyType(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(propertyType), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(propertyType));

		assertTrue(flag);

		actions.click(driver, driver.findElement(propertyType));

		actions.explicitWait(driver, driver.findElement(propertyTypeValue), 60);

		actions.click(driver, driver.findElement(propertyTypeValue));

		Thread.sleep(3000);

	}

	public void clickOnRadioButton(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(cashFinanceRadioButton), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(cashFinanceRadioButton));

		assertTrue(flag);

		actions.click(driver, driver.findElement(cashFinanceRadioButton));

		Thread.sleep(3000);

	}

	public void enterLoanAmount(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(loanAmountTextBox), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(loanAmountTextBox));

		assertTrue(flag);

		actions.click(driver, driver.findElement(loanAmountTextBox));

		driver.findElement(loanAmountTextBox).sendKeys(Keys.CONTROL, "a");

		driver.findElement(loanAmountTextBox).sendKeys(Keys.DELETE);

		driver.findElement(loanAmountTextBox).clear();

		Thread.sleep(3000);
		actions.type(driver.findElement(loanAmountTextBox), "9000000");

	}

	public void clickCreateNewFile(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(createNewFile), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(createNewFile));

		assertTrue(flag);

		actions.click(driver, driver.findElement(createNewFile));

		Thread.sleep(1000);

		actions.type(driver.findElement(enterAddress), "Amanora");

		actions.type(driver.findElement(enterDealNumber), "30001");

		driver.findElement(By.xpath("//input[@id='address']")).sendKeys(Keys.ESCAPE);

		Thread.sleep(1000);
	}
	
	public void calendar(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='input-group post-icon']/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='bs-datepicker-head']//button[@class='next']")).click();
		driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[2]/td[3]/span[1]")).click();
		System.out.println("-------->"+driver.findElement(By.xpath("//div[@class='input-group post-icon']/input")).getText());
	}

	public void uploadFile(WebDriver drv) throws InterruptedException, AWTException {

		JavascriptExecutor js = (JavascriptExecutor) drv; // Scroll operation using Js Executor
		js.executeScript("window.scrollBy(0,00)"); // Scroll Down(+ve) upto browse option
		Thread.sleep(2000); // suspending execution for specified time period

		WebElement browse = drv.findElement(By.xpath("//label[@class='file-input__label']"));
		// using linkText, to click on browse element
		browse.click(); // Click on browse option on the webpage
		Thread.sleep(2000); // suspending execution for specified time period

		// creating object of Robot class
		Robot rb = new Robot();

		// copying File path to Clipboard
		StringSelection str = new StringSelection("C:\\Users\\navin.kotamraju\\Desktop\\nav-bar.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
	}

	public void clickMapLink(WebDriver driver) throws InterruptedException {

		actions.explicitWait(driver, driver.findElement(map), 60);

		boolean flag = actions.isDisplayed(driver, driver.findElement(map));

		assertTrue(flag);

		actions.click(driver, driver.findElement(map));

		Thread.sleep(3000);

		driver.manage().window().maximize();

	}

	public void newWindowValidations(WebDriver driver) {
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				actions.explicitWait(driver, driver.findElement(checkBox), 60);

				boolean box = actions.isDisplayed(driver, driver.findElement(checkBox));

				assertTrue(box);

				actions.click(driver, driver.findElement(checkBox));

				actions.explicitWait(driver, driver.findElement(secondCheckBox), 60);

				boolean secondBox = actions.isDisplayed(driver, driver.findElement(secondCheckBox));

				assertTrue(secondBox);

				actions.click(driver, driver.findElement(secondCheckBox));

				boolean disabled = actions.isDisplayed(driver, driver.findElement(attributCheckBox));

				System.out.print("disabled--->" + disabled);

				assertTrue(disabled);

				String value = actions.getAttribute(driver, driver.findElement(attributCheckBox), "type");

				assertTrue(value != null);

				actions.switchToFrameByIndex(driver, 0);

				boolean iframes = actions.isDisplayed(driver, driver.findElement(iframeLink));

				assertTrue(iframes);

				Assert.assertEquals("View larger map", driver.findElement(iframeLink).getText());

				driver.close();
			}

		}

		// switch to the parent window
		driver.switchTo().window(parent);

		actions.explicitWait(driver, driver.findElement(submit), 60);

		actions.click(driver, driver.findElement(submit));

		actions.explicitWait(driver, driver.findElement(preview), 60);
		actions.click(driver, driver.findElement(preview));

		List<WebElement> rows = driver.findElements(row);
		List<WebElement> columns = driver.findElements(column);
		for (int i = 0; i < rows.size(); i++) {
			System.out.println(rows.get(i).getText());
			for (int j = 0; j < columns.size(); j++) {
				System.out.println(columns.get(j).getText());
			}

		}

		actions.explicitWait(driver, driver.findElement(download), 60);
		actions.click(driver, driver.findElement(download));

	}

	

}
