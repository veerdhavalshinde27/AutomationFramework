package com.selenium.basics;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println(System.getProperty("user.dir"));

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		String textUser = driver.findElement(By.xpath("//span[contains(text(),'Username')]")).getText();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		// span[text()='( Username : Admin | Password : admin123 )']
		// span[starts-with(text(),'( Username : Admin | Password : admin123 )')]
		// a[starts-with(@href,'/index')]
		// a[contains(@href,'/index')]
		// span[contains(text(),'( Username : Admin | Password : admin123 )')]

		System.out.println(textUser);
		WebElement element = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b"));

		Actions hover = new Actions(driver);

		hover.moveToElement(element).build().perform();
		// a[@id='menu_pim_viewPimModule']/b/../../ul/li[2]/a
		// driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b/../../ul/li[2]/a")).click();

		/*
		 * WebElement status =driver.findElement(By.id("empsearch_employee_status"));
		 * 
		 * Select empStatus = new Select(status);
		 * 
		 * empStatus.selectByIndex(2);
		 */

		List<WebElement> status = driver.findElements(By.xpath("//*[@id='empsearch_employee_status']/option"));

		System.out.println(status.size());

		for (int i = 0; i < status.size(); i++) {
			if (i == 2) {
				status.get(i).click();
			}
		}

		List<WebElement> checkBoxes = driver
				.findElements(By.xpath("//input[starts-with(@id,'ohrmList_chkSelectRecord')]"));

		System.out.println(status.size());

		for (int i = 0; i < checkBoxes.size(); i++) {

			checkBoxes.get(i).click();

		}
		Thread.sleep(2000);

		driver.quit();
		try {
			Runtime.getRuntime().exec("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
