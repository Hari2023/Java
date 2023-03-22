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

public class Absolute_Xpath {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
		
		WebElement apple_Mac = driver.findElement(By.xpath("//input[@type='text']"));
		apple_Mac.sendKeys("AppleMac Book");
		WebElement search_Btn = driver.findElement(By.xpath("//input[@type='submit']"));
		search_Btn.click();
		
		WebElement apple_Laptop = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result']/div/div/div/div/div/div/div/div[2]/div/span/a/div/img)[3]"));
		apple_Laptop.click();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Screenshot\\amazon.png");
		FileUtils.copyFile(src, des);
		
		
		
		
		
		
		
		
		
		
		
	}

}
