package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
				
		WebElement course = driver.findElement(By.xpath("//a[.='COURSES']"));
		Actions a = new Actions(driver);
		a.moveToElement(course).build().perform();
				
		WebElement oracle = driver.findElement(By.xpath("//span[.='Oracle Training']"));
		a.click(oracle).build().perform();
		Thread.sleep(3000);
		
		WebElement oracle_Rac = driver.findElement(By.xpath("//span[.='Oracle RAC Training']"));
		a.click(oracle_Rac).build().perform();
		
		
			
		
		
		
	}

}
