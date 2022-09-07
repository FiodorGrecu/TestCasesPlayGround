package com.noorteck.test.cases;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCsae5 {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String key = "webdriver.chrome.driver";
		String path = "/Users/Work/Desktop/B7-Selenium/chromedriver";

		System.setProperty(key, path);

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

//		driver.manage().window().maximize();

		driver.get(url);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Uh oh...");
			e.printStackTrace();

			WebElement username = driver.findElement(By.name("username"));
			username.sendKeys("Admin");

			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("admin123");

			WebElement loginButton = driver.findElement(By.xpath("//button[@type = 'submit']"));
			loginButton.click();

			WebElement pimLink = driver.findElement(By.linkText("PIM"));

			action.moveToElement(pimLink);
			Thread.sleep(1000);
			pimLink.click();

			WebElement empList = driver.findElement(By.linkText("Employee List"));
			empList.click();
			Thread.sleep(2000);
			WebElement empIdField = driver.findElement(By.xpath("//div[2]/input"));

			empIdField.sendKeys("00016");
			Thread.sleep(2000);

			/**
			 * String empStatusXpath = "//*[@class='oxd-grid-4
			 * orangehrm-full-width-grid']/div[3]//div[@class='oxd-select-text-input']";
			 * 
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\Muhammet\\chromedriver\\chromedriver.exe"); WebDriver driver =
			 * new ChromeDriver(); driver.manage().window().maximize();
			 * 
			 * driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			 * 
			 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
			 * WebElement username = driver.findElement(By.name("username"));
			 * username.sendKeys("Admin");
			 * 
			 * WebElement password = driver.findElement(By.name("password"));
			 * password.sendKeys("admin123");
			 * 
			 * WebElement loginButton = driver.findElement(By.xpath("//button[@type =
			 * 'submit']")); loginButton.click();
			 * 
			 * driver.findElement(By.xpath(empStatusXpath)).click();
			 * 
			 * driver.findElement(By.xpath("//div[@role='listbox']//*[contains(text(),
			 * 'Full-Time Permanent')]")).click();
			 */

//		WebElement dropDownStatus = driver
//				.findElement(By.xpath("//div[text() = 'Select']"));
//
//		dropDownStatus.click();

			Thread.sleep(2000);
//
//		WebElement position = driver.findElement(By.xpath("//div[@tabindex = '0']"));
//
//		Thread.sleep(2000);
//		position.click();
//
//		WebElement dropDownInclude = driver.findElement(By.xpath(
//				"/html/body/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[1]/label"));
//		Thread.sleep(2000);
//		dropDownInclude.click();
//		Thread.sleep(2000);
//
//		WebElement subUnit = driver.findElement(By.xpath("//div[@tabindex = '0']"));
//
//		Thread.sleep(2000);
//		subUnit.click();
//
//		WebElement Administartion = driver.findElement(By.xpath(
//				"/html/body/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div/div[1]"));
//		Thread.sleep(2000);
//		Administartion.click();

			Thread.sleep(2000);
			driver.quit();
		}
	}
}
