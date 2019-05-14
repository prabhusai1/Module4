package com.capg.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPOM {

	WebDriver driver;

	public RegisterPOM(WebDriver driver) {

		this.driver = driver;
	}

	public void typeFirstName() {
		System.out.println("entered");
		By tfn = By.id("txtFirstName");
		driver.findElement(tfn).sendKeys("Prabhusai");

	}

	public void typeLastName() {
		driver.findElement(By.id("txtLastName")).sendKeys("Kotha");
	}

	public void typeEmail() {
		driver.findElement(By.id("txtEmail")).sendKeys("kotha@gmail.com");
	}

	public void typeContactNo() {
		driver.findElement(By.id("txtPhone")).sendKeys("8790321879");
	}

	public void typeNumberofPeople() {
		driver.findElement(By.name("size")).sendKeys("1");
	}

	public void typeBuildingNameRoomNo() {
		driver.findElement(By.id("txtAddress1")).sendKeys("saiBuldings");

	}

	public void typeAreaName() {
		driver.findElement(By.id("txtAddress2")).sendKeys("Kalimadir");

	}

	public void typeCity() {
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
	}

	public void typeState() {
		driver.findElement(By.name("state")).sendKeys("Telangana");
	}

	public void typeConferencefullAccess() {
		List<WebElement> radioBtn = driver.findElements(By.name("memberStatus"));

		radioBtn.get(0).click();
	}

	public void clickNext() {
		driver.findElement(By.linkText("Next")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
	}
}
