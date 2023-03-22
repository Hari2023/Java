package com.miniproject.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		WebElement signin = driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
//		signin.click();
//
//		WebElement num = driver.findElement(By.xpath("//input[@name='email']"));
//		num.sendKeys("6379724477");
//
//		WebElement move = driver.findElement(By.xpath("//input[@id='continue']"));
//		move.click();
//
//		WebElement passwd = driver.findElement(By.xpath("//input[@name='password']"));
//		passwd.sendKeys("Hari22");
//
//		WebElement sign = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
//		sign.click();
       
		WebElement prod = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        prod.sendKeys("shirt");
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();

		WebElement model = driver.findElement(By.xpath(
				"(//div[@id='search']/div/div/div/span[3]/div[2]/div//div/div/div/div/div/div/div/span/a/div/img)[1]"));
		model.click();
		WebElement add = driver.findElement(By.xpath("//input[contains(@id,'add')]"));
		add.click();
	}

}
