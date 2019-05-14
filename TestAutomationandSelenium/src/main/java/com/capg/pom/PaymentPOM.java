package com.capg.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPOM {
	WebDriver driver; 

	
	public PaymentPOM(WebDriver driver) {
		this.driver = driver;
	}

	// Method used to take card holders name
	public void typeCardholderName() {
		By tfn = By.id("txtCardholderName");
		driver.findElement(tfn).sendKeys("Prabhusai");
	}

	// Method used to take card number
	public void typeCardNumber() {
		By tfn = By.id("txtDebit");
		driver.findElement(tfn).sendKeys("1234123412341234");
	}

	// Method used to take card CVV
	public void typeCvv() {
		By tfn = By.id("txtCvv");
		driver.findElement(tfn).sendKeys("143");
	}

	// Method used to take card expire month
	public void typeExpireMonth() {
		By tfn = By.id("txtMonth");
		driver.findElement(tfn).sendKeys("08");
	}

	// Method used to take card expire year
	public void typeExpireYear() {
		By tfn = By.id("txtYear");
		driver.findElement(tfn).sendKeys("29");
	}

	// This method will perform the actions after clicking on submit button
	public void submitButton() {
		WebElement subbtn = driver.findElement(By.xpath("//input[@type='button']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", subbtn);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
	}
}
