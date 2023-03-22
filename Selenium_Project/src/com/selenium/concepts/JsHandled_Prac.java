package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JsHandled_Prac {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		ChromeOptions b = new ChromeOptions();
		b.addArguments("incognito");
		b.addArguments("disable-notificationds");
		
		driver = new ChromeDriver(b);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up']"));
	
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].value='hari@gmail.com'", mail);
		js.executeScript("arguments[0].value='12345'", pass);
		//js.executeScript("arguments[0].click()", login);
	
	    Thread.sleep(3000);
	    
	    js.executeScript("arguments[0].scrollIntoView()", signup);
	    
	    js.executeScript("arguments[0].setAttribute('style','color:red')", mail);
	    
	    
	
	
	
	}
	
	
	

}
