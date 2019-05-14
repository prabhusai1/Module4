package com.capg.pom;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitializer {
	static Properties prop = new Properties();
	public static WebDriver driver;
	static String browser;

	// This method sets the browser name to chrome
	public static void setBrowserName() {
		try {
			InputStream is = new FileInputStream(
					"C:\\Users\\VJIT\\updatedEclipse\\TestAutomationandSelenium\\src\\main\\java\\com\\capg\\properties\\conference.properties");
			prop.load(is);
			System.out.println(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		browser = prop.getProperty("browser");
	}

	// This will set browser configuration with the help of chrome driver location
	public static void setBrowserConfig() {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\VJIT\\updatedEclipse\\TestAutomationandSelenium\\src\\main\\java\\chromedriver.exe");

		}
	}

	public static void runTest() {
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));

	}

	public static void quitTest() {
		driver.quit();
	}

}
