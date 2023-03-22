package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("");

		WebElement From = driver.findElement(By.id("src"));
		From.sendKeys("Chennai");

		WebElement Dest = driver.findElement(By.id("dest"));
		Dest.sendKeys("Tiruchirapalli");

		WebElement Date = driver.findElement(By.id("onward_cal"));
		Date.sendKeys("21/09/2022");
		
	   // WebElement Btn = driver.findElement(("fl button"));
	//	Btn.click();
	}

}
