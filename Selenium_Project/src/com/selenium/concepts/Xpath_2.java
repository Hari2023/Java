package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");  

		WebElement email = driver.findElement(By.xpath("(//input[contains(@data-testid,'royal')])[1]"));
		email.sendKeys("ramkumarkaspl.net");

		WebElement passwd = driver.findElement(By.xpath("(//input[contains(@data-testid,'royal')])[2]"));
		passwd.sendKeys("1234");

		WebElement log_Btn = driver.findElement(By.xpath("(//button[contains(@data-testid,'royal')])[1]"));
		log_Btn.click();

//		WebElement mail = driver.findElement(By.xpath("//input[contains(@aria-label,'address or phone')]"));
//		mail.sendKeys("abc@gmail.com");
//		
//		WebElement pass = driver.findElement(By.xpath("//input[contains(@data-testid,'royal_pass')]"));
//		pass.sendKeys("1234");
//		
//		WebElement login_Btn = driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login_button')]"));
//		login_Btn.click();
//		
//		

//		WebElement create_new = driver.findElement(By.xpath("//a[text()='Create New Account']"));
//		create_new.click();

	}

}
