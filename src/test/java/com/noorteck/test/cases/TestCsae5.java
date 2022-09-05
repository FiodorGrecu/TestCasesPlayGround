package com.noorteck.test.cases;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCsae5 {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String key = "webdriver.chrome.driver";
		String path = "/Users/Work/Desktop/B7-Selenium/chromedriver";

		System.setProperty(key, path);

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);
		
		driver.manage().window().maximize();

		driver.get(url);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Uh oh...");
			e.printStackTrace();
		}
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type = 'submit']"));
		loginButton.click();
		
		WebElement pimLink = driver.findElement(By.linkText("PIM"));
		
		action.moveToElement(pimLink);
		Thread.sleep(2000);
		pimLink.click();
		
		WebElement empList = driver.findElement(By.linkText("Employee List"));
		empList.click();
		Thread.sleep(4000);
		//Enter “00016” in ID field
		WebElement empIdField = driver.findElement(By.xpath("//input[@class = 'oxd-input oxd-input--active']"));
		Thread.sleep(4000);
		empIdField.sendKeys("00016");
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
