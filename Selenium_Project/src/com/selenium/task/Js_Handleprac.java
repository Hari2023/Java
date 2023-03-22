package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Handleprac {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		
		driver.get("https://twitter.com/i/flow/login");
	
		
		Thread.sleep(3000);
	
		
		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='haribas@gmail.com'", email);
		js.executeScript("arguments[0].value='1233445'", pass);
		
		
		
		
		
	}

}
