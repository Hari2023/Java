package com.selenium.task;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Check {

	public static void main(String[] args) {
      
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();// upcasting

		
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
	    WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
	    mail.sendKeys("xyz@gmail.com");
	    WebElement hidden = driver.findElement(By.xpath("(//input[@type='hidden'])[1]"));
	    boolean displayed = hidden.isDisplayed();
	    System.out.println(displayed);
	    
	    
	    
//	    driver.navigate().to("https://"
//	    		+ "accounts.spotify.com/en/login?continue=https");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.quit();
//		String title = driver.getTitle();
//		System.out.println(title);

		
	
		
		
		
		
		
		
		
		
		
	}

}
