package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HTML_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement create  = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    		
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select a = new Select(day);
		a.selectByIndex(25);
		boolean multiple = a.isMultiple();
		System.out.println("Double drop down: "+multiple);
		
		Select a1 = new Select(month);
		a1.selectByValue("9");
		
		Select a2 = new Select(year);
		a2.selectByVisibleText("2021");
		
		
		
		
		
		
		
		
		
		
	}

}
