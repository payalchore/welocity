package com.testing.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contains opening and closing browser methods
 * 
 * @author payalchore
 *
 */
public class BaseFramework {
	public WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		System.out.println("Opening browser session");
		driver = new ChromeDriver();
		driver.get("http://ydcc.in/");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("Closing browser session");
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

}
