package com.guru99.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	/**
	 * <-----------To LAUNCH THE BROWSER-------------->
	 * 
	 * @author shatish
	 * @param browserName
	 * @return
	 */
	public static WebDriver Driver(String browserName) {
		if (browserName == "chrome") {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shatish\\Desktop\\Testing\\shatish Project Files\\Guru9\\src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		} else if (browserName == "firefox") {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\shatish\\Desktop\\Testing\\shatish Project Files\\Guru9\\src\\test\\resources\\driver\\geckoie.exe");
			return driver;
		} else if (browserName == "ie") {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\shatish\\Desktop\\Testing\\shatish Project Files\\Guru9\\src\\test\\resources\\driver\\geckoie.exe");
			return driver;
		} else {
			System.out.println("Browser not available");
			return null;
		}
	}

	/**
	 * <----------TO Enter THE VALUES - SEND KEYS-------->
	 * 
	 * @author shatish
	 * @param element
	 * @param value
	 */
	public void type(WebElement element, String value) {

		element.sendKeys(value);
	}

	/**
	 * <------------lAUNCH THE WEBSITE-------------->
	 * 
	 */
	public void loadUrl(String Url) {
		driver.get(Url);
	}

	/**
	 * <------------BUTTON CLICK-------------->
	 * 
	 * @author shatish
	 * @param element
	 */
	public void btnClick(WebElement element) {
		element.click();

	}

}

