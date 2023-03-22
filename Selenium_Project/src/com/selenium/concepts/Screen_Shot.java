package com.selenium.concepts;

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
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://twitter.com/i/flow/login");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		
		
		WebElement mail = driver.findElement(By.xpath("(//div[@dir='auto'])[1]"));
		mail.sendKeys("6379724477");
		
//		WebElement from_start = driver.findElement(By.xpath("//span[text()='Log in']"));
//		from_start.click();
//		Thread.sleep(3000);
//		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email address or username']"));
//		username.sendKeys("haribaskarg14@gmail.com");
//		Thread.sleep(3000);
//		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//		pass.sendKeys("hari8120");
//		WebElement login = driver.findElement(By.xpath("//p[text()='Log In']"));
//		login.click();
//		Thread.sleep(3000);
		TakesScreenshot a = (TakesScreenshot) driver;
//		File source = a
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\spotify.png");
//		FileUtils.copyFile(source, des);
//		driver.close();
		
	}

}
