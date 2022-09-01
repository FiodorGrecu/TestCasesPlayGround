package com.noorteck.test.cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		String key = "webdriver.chrome.driver";
		String path = "/Users/Work/Desktop/B7-Selenium/chromedriver";

		System.setProperty(key, path);

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);
		
		driver.manage().window().maximize();

		driver.get(url);

		WebElement oslo = driver.findElement(By.id("box1"));

		WebElement norway = driver.findElement(By.id("box101"));
		action.dragAndDrop(oslo, norway).build().perform();

		WebElement stockholm = driver.findElement(By.id("box2"));

		WebElement sweden = driver.findElement(By.id("box102"));
		action.dragAndDrop(stockholm, sweden).build().perform();

		WebElement washington = driver.findElement(By.id("box3"));

		WebElement US = driver.findElement(By.id("box103"));
		action.dragAndDrop(washington, US).build().perform();

		WebElement copenhaghen = driver.findElement(By.id("box4"));

		WebElement denmark = driver.findElement(By.id("box104"));
		action.dragAndDrop(copenhaghen, denmark).build().perform();

		WebElement seoul = driver.findElement(By.id("box5"));

		WebElement skorea = driver.findElement(By.id("box105"));
		action.dragAndDrop(seoul, skorea).build().perform();

		WebElement rome = driver.findElement(By.id("box6"));

		WebElement italy = driver.findElement(By.id("box106"));
		action.dragAndDrop(rome, italy).build().perform();

		WebElement madrid = driver.findElement(By.id("box7"));

		WebElement spain = driver.findElement(By.id("box107"));
		action.dragAndDrop(madrid, spain).build().perform();

		Thread.sleep(3000);

		driver.quit();
	}

}
