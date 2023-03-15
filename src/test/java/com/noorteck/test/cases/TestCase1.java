package com.noorteck.test.cases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {
	
	public static void main(String[] args) {
		
		String url = "https://demo.guru99.com/test/simple_context_menu.html";
		String key = "webdriver.chrome.driver";
		String path = "/Users/Work/Desktop/B7-Selenium/chromedriver";
		
		System.setProperty(key, path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Actions action = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click')]"));
		
		action.contextClick(button).perform();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			System.out.println("Oops Something happened.. do it again");
			e.printStackTrace();
		}
		
		WebElement editButton = driver.findElement(By.xpath("//span[contains(text(),'Copy')]"));
		editButton.click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert text: " + alert.getText());
		
		alert.accept();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			System.out.println("Oops Something happened.. do it again");
			e.printStackTrace();
		}
	
		
		driver.quit();
		
	}

}
