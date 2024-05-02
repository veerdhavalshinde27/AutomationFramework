package com.automation.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.automation.utility.ExtentManager;

public class Base {

	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

	public static WebDriver getDriver() {
		// Get Driver from threadLocalmap
		return driver.get();
	}

	public void Initialization(String browserName) throws InterruptedException {

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/test/resources/Drivers/chromedriver.exe");
			System.out.print("----------------->" + browserName);
			ChromeOptions options = new ChromeOptions();
				//	options.addArguments("headless");
				//	ChromeDriver driver = new ChromeDriver(options);
			driver.set(new ChromeDriver(options));
		}

		if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "/src/test/resources/Drivers/msedgedriver.exe");
			System.out.print("----------------->" + browserName);
			driver.set(new EdgeDriver());
		}

		if (browserName.equals("firefox")) {
			System.out.print("----------------->" + browserName);
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/src/test/resources/Drivers/geckodriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);

			driver.set(new FirefoxDriver());
		}

		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 getDriver().get("https://trainee-web-app.azurewebsites.net");

	//	getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	//	getDriver().get("https://juliemr.github.io/protractor-demo/");

		Thread.sleep(3000);

	}

	@BeforeSuite
	public void LogInitializer() {
		ExtentManager.setExtent();

	}

	@AfterSuite
	public void afterSuite() throws InterruptedException {
		ExtentManager.endReport();
		Thread.sleep(5000);
		
	}

	
	
	@Parameters("browser")
	@BeforeMethod
	public void invoke(String browserName) throws InterruptedException {
		Initialization(browserName);

	}

}
