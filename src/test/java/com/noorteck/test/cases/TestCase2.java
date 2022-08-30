package com.noorteck.test.cases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase2 {
	
public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demo.guru99.com/test/simple_context_menu.html";
		String key = "webdriver.chrome.driver";
		String path = "/Users/Work/Desktop/B7-Selenium/chromedriver";
		
		System.setProperty(key, path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Actions action = new Actions(driver);
	
		
		WebElement doubleButton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
	
		action.doubleClick(doubleButton).perform();
		
				
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert text: " + alert.getText());
				
		alert.accept();
		
		
		driver.quit();
		
	}

}
