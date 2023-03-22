package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Prac {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement mail = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		mail.sendKeys("haribaskar@kaspl.net");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("1234");
		WebElement login_Btn = driver.findElement(By.xpath("//button[@name='login']"));
		login_Btn.click();
		driver.navigate().back();
		//driver.close();
		Thread.sleep(3000);
	
//		WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		forgot.click();
		
		driver.navigate().back();
		
//		WebElement create = driver.findElement(By.xpath("//a[text()='Create a Page']"));
//		create.click();
		
		WebElement logo = driver.findElement(By.xpath("//h2[contains(text(),'people in your life.')]"));
		String text = logo.getText();
		System.out.println(text);
		
	}

}
