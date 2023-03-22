package com.selenium.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
		mail.sendKeys("haribaskarg14@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("1123444");
		
		WebElement login = driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login_button')]"));
		login.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		
		TakesScreenshot a = (TakesScreenshot) driver;//downcasting
		File source = a.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\facebook.png");
		FileUtils.copyFile(source, des);
	}

}
