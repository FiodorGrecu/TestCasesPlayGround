package com.noorteck.test.cases;

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
			Thread.sleep(3000);
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
		
		
		Thread.sleep(8000);
		driver.quit();
	}
}
