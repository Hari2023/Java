package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		
		
WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
		
		element.sendKeys("abc@gmail.com");
		
	}

}
