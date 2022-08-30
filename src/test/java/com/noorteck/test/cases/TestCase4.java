package com.noorteck.test.cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase4 {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String key = "webdriver.chrome.driver";
		String path = "/Users/Work/Desktop/B7-Selenium/chromedriver";

		System.setProperty(key, path);

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		Actions action = new Actions(driver);

		Thread.sleep(3000);

		WebElement userNameInput = driver.findElement(By.xpath("//input[@name = 'username']"));
		userNameInput.sendKeys("Admin");

		Thread.sleep(3000);

		WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
		passwordInput.sendKeys("admin123");

		WebElement submitButton = driver.findElement(By.xpath("//button[@type = 'submit']"));
		submitButton.click();

		WebElement adminLink = driver.findElement(By.linkText("Admin"));
		action.moveToElement(adminLink);
		Thread.sleep(3000);

		adminLink.click();

		Thread.sleep(3000);
		driver.quit();

	}

}
